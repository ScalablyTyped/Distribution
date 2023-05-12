package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplementationGuideDefinitionTemplate
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _scope: js.UndefOr[Element] = js.undefined
  
  var _source: js.UndefOr[Element] = js.undefined
  
  /**
    * Type of template specified.
    */
  var code: String
  
  /**
    * The scope in which the template applies.
    */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
    * The source location for the template.
    */
  var source: String
}
object ImplementationGuideDefinitionTemplate {
  
  inline def apply(code: String, source: String): ImplementationGuideDefinitionTemplate = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideDefinitionTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImplementationGuideDefinitionTemplate] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_scope(value: Element): Self = StObject.set(x, "_scope", value.asInstanceOf[js.Any])
    
    inline def set_scopeUndefined: Self = StObject.set(x, "_scope", js.undefined)
    
    inline def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
  }
}
