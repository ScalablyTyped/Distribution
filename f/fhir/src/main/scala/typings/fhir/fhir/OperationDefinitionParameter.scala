package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for the operation/query
  */
@js.native
trait OperationDefinitionParameter extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'searchType'.
    */
  var _searchType: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.native
  /**
    * ValueSet details if this is coded
    */
  var binding: js.UndefOr[OperationDefinitionParameterBinding] = js.native
  /**
    * Description of meaning/use
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * Maximum Cardinality (a number or *)
    */
  var max: String = js.native
  /**
    * Minimum Cardinality
    */
  var min: integer = js.native
  /**
    * Name in Parameters.parameter.name or in URL
    */
  var name: code = js.native
  /**
    * Parts of a nested Parameter
    */
  var part: js.UndefOr[js.Array[OperationDefinitionParameter]] = js.native
  /**
    * Profile on the type
    */
  var profile: js.UndefOr[Reference] = js.native
  /**
    * number | date | string | token | reference | composite | quantity | uri
    */
  var searchType: js.UndefOr[code] = js.native
  /**
    * What type this parameter has
    */
  var `type`: js.UndefOr[code] = js.native
  /**
    * in | out
    */
  var use: code = js.native
}

object OperationDefinitionParameter {
  @scala.inline
  def apply(max: String, min: integer, name: code, use: code): OperationDefinitionParameter = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinitionParameter]
  }
  @scala.inline
  implicit class OperationDefinitionParameterOps[Self <: OperationDefinitionParameter] (val x: Self) extends AnyVal {
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
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: integer): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: code): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUse(value: code): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def set_documentation(value: Element): Self = this.set("_documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_documentation: Self = this.set("_documentation", js.undefined)
    @scala.inline
    def set_max(value: Element): Self = this.set("_max", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_max: Self = this.set("_max", js.undefined)
    @scala.inline
    def set_min(value: Element): Self = this.set("_min", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_min: Self = this.set("_min", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_searchType(value: Element): Self = this.set("_searchType", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_searchType: Self = this.set("_searchType", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def set_use(value: Element): Self = this.set("_use", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_use: Self = this.set("_use", js.undefined)
    @scala.inline
    def setBinding(value: OperationDefinitionParameterBinding): Self = this.set("binding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinding: Self = this.set("binding", js.undefined)
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    @scala.inline
    def setPartVarargs(value: OperationDefinitionParameter*): Self = this.set("part", js.Array(value :_*))
    @scala.inline
    def setPart(value: js.Array[OperationDefinitionParameter]): Self = this.set("part", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
    @scala.inline
    def setProfile(value: Reference): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setSearchType(value: code): Self = this.set("searchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchType: Self = this.set("searchType", js.undefined)
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

