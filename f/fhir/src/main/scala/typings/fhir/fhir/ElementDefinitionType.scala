package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data type and Profile for this element
  */
@js.native
trait ElementDefinitionType extends Element {
  /**
    * Contains extended information for property 'aggregation'.
    */
  var _aggregation: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'targetProfile'.
    */
  var _targetProfile: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'versioning'.
    */
  var _versioning: js.UndefOr[Element] = js.native
  /**
    * contained | referenced | bundled - how aggregated
    */
  var aggregation: js.UndefOr[js.Array[code]] = js.native
  /**
    * Data type or Resource (reference to definition)
    */
  var code: uri = js.native
  /**
    * Profile (StructureDefinition) to apply (or IG)
    */
  var profile: js.UndefOr[uri] = js.native
  /**
    * Profile (StructureDefinition) to apply to reference target (or IG)
    */
  var targetProfile: js.UndefOr[uri] = js.native
  /**
    * either | independent | specific
    */
  var versioning: js.UndefOr[code] = js.native
}

object ElementDefinitionType {
  @scala.inline
  def apply(code: uri): ElementDefinitionType = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionType]
  }
  @scala.inline
  implicit class ElementDefinitionTypeOps[Self <: ElementDefinitionType] (val x: Self) extends AnyVal {
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
    def setCode(value: uri): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def set_aggregationVarargs(value: Element*): Self = this.set("_aggregation", js.Array(value :_*))
    @scala.inline
    def set_aggregation(value: js.Array[Element]): Self = this.set("_aggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_aggregation: Self = this.set("_aggregation", js.undefined)
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    @scala.inline
    def set_profile(value: Element): Self = this.set("_profile", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_profile: Self = this.set("_profile", js.undefined)
    @scala.inline
    def set_targetProfile(value: Element): Self = this.set("_targetProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_targetProfile: Self = this.set("_targetProfile", js.undefined)
    @scala.inline
    def set_versioning(value: Element): Self = this.set("_versioning", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_versioning: Self = this.set("_versioning", js.undefined)
    @scala.inline
    def setAggregationVarargs(value: code*): Self = this.set("aggregation", js.Array(value :_*))
    @scala.inline
    def setAggregation(value: js.Array[code]): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    @scala.inline
    def setProfile(value: uri): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setTargetProfile(value: uri): Self = this.set("targetProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetProfile: Self = this.set("targetProfile", js.undefined)
    @scala.inline
    def setVersioning(value: code): Self = this.set("versioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersioning: Self = this.set("versioning", js.undefined)
  }
  
}

