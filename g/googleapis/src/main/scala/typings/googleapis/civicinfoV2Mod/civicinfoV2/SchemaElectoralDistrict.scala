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
  def apply(): SchemaElectoralDistrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElectoralDistrict]
  }
  @scala.inline
  implicit class SchemaElectoralDistrictOps[Self <: SchemaElectoralDistrict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKgForeignKey(value: String): Self = this.set("kgForeignKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKgForeignKey: Self = this.set("kgForeignKey", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

