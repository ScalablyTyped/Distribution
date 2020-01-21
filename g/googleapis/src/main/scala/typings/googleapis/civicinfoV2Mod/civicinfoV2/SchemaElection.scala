package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the election that was queried.
  */
@js.native
trait SchemaElection extends js.Object {
  /**
    * Day of the election in YYYY-MM-DD format.
    */
  var electionDay: js.UndefOr[String] = js.native
  /**
    * The unique ID of this election.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A displayable name for the election.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The political division of the election. Represented as an OCD Division
    * ID. Voters within these political jurisdictions are covered by this
    * election. This is typically a state such as
    * ocd-division/country:us/state:ca or for the midterms or general election
    * the entire US (i.e. ocd-division/country:us).
    */
  var ocdDivisionId: js.UndefOr[String] = js.native
}

object SchemaElection {
  @scala.inline
  def apply(electionDay: String = null, id: String = null, name: String = null, ocdDivisionId: String = null): SchemaElection = {
    val __obj = js.Dynamic.literal()
    if (electionDay != null) __obj.updateDynamic("electionDay")(electionDay.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ocdDivisionId != null) __obj.updateDynamic("ocdDivisionId")(ocdDivisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaElection]
  }
}

