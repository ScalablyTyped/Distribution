package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivisionSearchResult extends js.Object {
  /**
    * Other Open Civic Data identifiers that refer to the same division -- for example, those that refer to other political divisions whose boundaries are
    * defined to be coterminous with this one. For example, ocd-division/country:us/state:wy will include an alias of ocd-division/country:us/state:wy/cd:1,
    * since Wyoming has only one Congressional district.
    */
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The name of the division. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The unique Open Civic Data identifier for this division. */
  var ocdId: js.UndefOr[java.lang.String] = js.undefined
}

object DivisionSearchResult {
  @scala.inline
  def apply(
    aliases: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    ocdId: java.lang.String = null
  ): DivisionSearchResult = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ocdId != null) __obj.updateDynamic("ocdId")(ocdId)
    __obj.asInstanceOf[DivisionSearchResult]
  }
}

