package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * How a resource is related to the compartment
  */
trait CompartmentDefinitionResource
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'param'.
    */
  var _param: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Name of resource type
    */
  var code: typings.fhir.fhir.code
  
  /**
    * Additional documentation about the resource and compartment
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * Search Parameter Name, or chained parameters
    */
  var param: js.UndefOr[js.Array[String]] = js.undefined
}
object CompartmentDefinitionResource {
  
  @scala.inline
  def apply(code: code): CompartmentDefinitionResource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompartmentDefinitionResource]
  }
  
  @scala.inline
  implicit class CompartmentDefinitionResourceMutableBuilder[Self <: CompartmentDefinitionResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setParam(value: js.Array[String]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    @scala.inline
    def setParamVarargs(value: String*): Self = StObject.set(x, "param", js.Array(value :_*))
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    @scala.inline
    def set_param(value: js.Array[Element]): Self = StObject.set(x, "_param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_paramUndefined: Self = StObject.set(x, "_param", js.undefined)
    
    @scala.inline
    def set_paramVarargs(value: Element*): Self = StObject.set(x, "_param", js.Array(value :_*))
  }
}
