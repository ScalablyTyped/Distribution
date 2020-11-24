package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * How a resource is related to the compartment
  */
@js.native
trait CompartmentDefinitionResource extends BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'param'.
    */
  var _param: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Name of resource type
    */
  var code: typings.fhir.fhir.code = js.native
  
  /**
    * Additional documentation about the resource and compartment
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * Search Parameter Name, or chained parameters
    */
  var param: js.UndefOr[js.Array[String]] = js.native
}
object CompartmentDefinitionResource {
  
  @scala.inline
  def apply(code: code): CompartmentDefinitionResource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompartmentDefinitionResource]
  }
  
  @scala.inline
  implicit class CompartmentDefinitionResourceOps[Self <: CompartmentDefinitionResource] (val x: Self) extends AnyVal {
    
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
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    
    @scala.inline
    def set_documentation(value: Element): Self = this.set("_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_documentation: Self = this.set("_documentation", js.undefined)
    
    @scala.inline
    def set_paramVarargs(value: Element*): Self = this.set("_param", js.Array(value :_*))
    
    @scala.inline
    def set_param(value: js.Array[Element]): Self = this.set("_param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_param: Self = this.set("_param", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setParamVarargs(value: String*): Self = this.set("param", js.Array(value :_*))
    
    @scala.inline
    def setParam(value: js.Array[String]): Self = this.set("param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
  }
}
