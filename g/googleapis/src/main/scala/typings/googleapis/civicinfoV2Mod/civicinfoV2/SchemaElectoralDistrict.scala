package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the geographic scope of a contest.
  */
@js.native
trait SchemaElectoralDistrict extends js.Object {
  /**
    * An identifier for this district, relative to its scope. For example, the
    * 34th State Senate district would have id &quot;34&quot; and a scope of
    * stateUpper.
    */
  var id: js.UndefOr[String] = js.native
  var kgForeignKey: js.UndefOr[String] = js.native
  /**
    * The name of the district.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The geographic scope of this district. If unspecified the district&#39;s
    * geography is not known. One of: national, statewide, congressional,
    * stateUpper, stateLower, countywide, judicial, schoolBoard, cityWide,
    * township, countyCouncil, cityCouncil, ward, special
    */
  var scope: js.UndefOr[String] = js.native
}

object SchemaElectoralDistrict {
  @scala.inline
  def apply(id: String = null, kgForeignKey: String = null, name: String = null, scope: String = null): SchemaElectoralDistrict = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kgForeignKey != null) __obj.updateDynamic("kgForeignKey")(kgForeignKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaElectoralDistrict]
  }
}

