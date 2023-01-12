package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMapElementTargetDependsOn
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _codeSystem: js.UndefOr[Element] = js.undefined
  
  var _element: js.UndefOr[Element] = js.undefined
  
  /**
    * Identity (code or path) or the element/item/ValueSet that the map depends on / refers to.
    */
  var code: String
  
  /**
    * An absolute URI that identifies the code system of the dependency code (if the source/dependency is a value set that crosses code systems).
    */
  var codeSystem: String
  
  /**
    * A reference to a specific concept that holds a coded value. This can be an element in a FHIR resource, or a specific reference to a data element in a different specification (e.g. HL7 v2) or a general reference to a kind of data field, or a reference to a value set with an appropriately narrow definition.
    */
  var element: String
}
object ConceptMapElementTargetDependsOn {
  
  inline def apply(code: String, codeSystem: String, element: String): ConceptMapElementTargetDependsOn = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], codeSystem = codeSystem.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapElementTargetDependsOn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConceptMapElementTargetDependsOn] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeSystem(value: String): Self = StObject.set(x, "codeSystem", value.asInstanceOf[js.Any])
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeSystem(value: Element): Self = StObject.set(x, "_codeSystem", value.asInstanceOf[js.Any])
    
    inline def set_codeSystemUndefined: Self = StObject.set(x, "_codeSystem", js.undefined)
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_element(value: Element): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
    
    inline def set_elementUndefined: Self = StObject.set(x, "_element", js.undefined)
  }
}
