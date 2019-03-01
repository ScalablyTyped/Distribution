package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Election extends js.Object {
  /** Day of the election in YYYY-MM-DD format. */
  var electionDay: js.UndefOr[java.lang.String] = js.undefined
  /** The unique ID of this election. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** A displayable name for the election. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The political division of the election. Represented as an OCD Division ID. Voters within these political jurisdictions are covered by this election.
    * This is typically a state such as ocd-division/country:us/state:ca or for the midterms or general election the entire US (i.e.
    * ocd-division/country:us).
    */
  var ocdDivisionId: js.UndefOr[java.lang.String] = js.undefined
}

object Election {
  @scala.inline
  def apply(
    electionDay: java.lang.String = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    ocdDivisionId: java.lang.String = null
  ): Election = {
    val __obj = js.Dynamic.literal()
    if (electionDay != null) __obj.updateDynamic("electionDay")(electionDay)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ocdDivisionId != null) __obj.updateDynamic("ocdDivisionId")(ocdDivisionId)
    __obj.asInstanceOf[Election]
  }
}

