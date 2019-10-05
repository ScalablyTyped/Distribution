package typings.gapiDotClientDotCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectoralDistrict extends js.Object {
  /** An identifier for this district, relative to its scope. For example, the 34th State Senate district would have id "34" and a scope of stateUpper. */
  var id: js.UndefOr[String] = js.undefined
  var kgForeignKey: js.UndefOr[String] = js.undefined
  /** The name of the district. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The geographic scope of this district. If unspecified the district's geography is not known. One of: national, statewide, congressional, stateUpper,
    * stateLower, countywide, judicial, schoolBoard, cityWide, township, countyCouncil, cityCouncil, ward, special
    */
  var scope: js.UndefOr[String] = js.undefined
}

object ElectoralDistrict {
  @scala.inline
  def apply(id: String = null, kgForeignKey: String = null, name: String = null, scope: String = null): ElectoralDistrict = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kgForeignKey != null) __obj.updateDynamic("kgForeignKey")(kgForeignKey)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[ElectoralDistrict]
  }
}

