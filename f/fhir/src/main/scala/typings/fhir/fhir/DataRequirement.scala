package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a required data item
  */
@js.native
trait DataRequirement extends Element {
  /**
    * Contains extended information for property 'mustSupport'.
    */
  var _mustSupport: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * What codes are expected
    */
  var codeFilter: js.UndefOr[js.Array[DataRequirementCodeFilter]] = js.native
  /**
    * What dates/date ranges are expected
    */
  var dateFilter: js.UndefOr[js.Array[DataRequirementDateFilter]] = js.native
  /**
    * Indicates that specific structure elements are referenced by the knowledge module
    */
  var mustSupport: js.UndefOr[js.Array[String]] = js.native
  /**
    * The profile of the required data
    */
  var profile: js.UndefOr[js.Array[uri]] = js.native
  /**
    * The type of the required data
    */
  var `type`: code = js.native
}

object DataRequirement {
  @scala.inline
  def apply(`type`: code): DataRequirement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirement]
  }
  @scala.inline
  implicit class DataRequirementOps[Self <: DataRequirement] (val x: Self) extends AnyVal {
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
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_mustSupportVarargs(value: Element*): Self = this.set("_mustSupport", js.Array(value :_*))
    @scala.inline
    def set_mustSupport(value: js.Array[Element]): Self = this.set("_mustSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_mustSupport: Self = this.set("_mustSupport", js.undefined)
    @scala.inline
    def set_profileVarargs(value: Element*): Self = this.set("_profile", js.Array(value :_*))
    @scala.inline
    def set_profile(value: js.Array[Element]): Self = this.set("_profile", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_profile: Self = this.set("_profile", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def setCodeFilterVarargs(value: DataRequirementCodeFilter*): Self = this.set("codeFilter", js.Array(value :_*))
    @scala.inline
    def setCodeFilter(value: js.Array[DataRequirementCodeFilter]): Self = this.set("codeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeFilter: Self = this.set("codeFilter", js.undefined)
    @scala.inline
    def setDateFilterVarargs(value: DataRequirementDateFilter*): Self = this.set("dateFilter", js.Array(value :_*))
    @scala.inline
    def setDateFilter(value: js.Array[DataRequirementDateFilter]): Self = this.set("dateFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFilter: Self = this.set("dateFilter", js.undefined)
    @scala.inline
    def setMustSupportVarargs(value: String*): Self = this.set("mustSupport", js.Array(value :_*))
    @scala.inline
    def setMustSupport(value: js.Array[String]): Self = this.set("mustSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMustSupport: Self = this.set("mustSupport", js.undefined)
    @scala.inline
    def setProfileVarargs(value: uri*): Self = this.set("profile", js.Array(value :_*))
    @scala.inline
    def setProfile(value: js.Array[uri]): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
  }
  
}

