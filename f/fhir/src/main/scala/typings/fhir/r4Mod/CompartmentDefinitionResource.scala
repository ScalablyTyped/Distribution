package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompartmentDefinitionResource
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _param: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * The name of a resource supported by the server.
    */
  var code: String
  
  /**
    * Additional documentation about the resource and compartment.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * If no search parameters are listed, then the resource is not linked to the compartment.
    */
  var param: js.UndefOr[js.Array[String]] = js.undefined
}
object CompartmentDefinitionResource {
  
  inline def apply(code: String): CompartmentDefinitionResource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompartmentDefinitionResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompartmentDefinitionResource] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setParam(value: js.Array[String]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setParamVarargs(value: String*): Self = StObject.set(x, "param", js.Array(value*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_param(value: js.Array[Element]): Self = StObject.set(x, "_param", value.asInstanceOf[js.Any])
    
    inline def set_paramUndefined: Self = StObject.set(x, "_param", js.undefined)
    
    inline def set_paramVarargs(value: Element*): Self = StObject.set(x, "_param", js.Array(value*))
  }
}
