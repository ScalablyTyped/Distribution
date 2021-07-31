package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Other elements required for this mapping (from context)
  */
trait ConceptMapGroupElementTargetDependsOn
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'property'.
    */
  var _property: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  
  /**
    * Value of the referenced element
    */
  var code: String
  
  /**
    * Display for the code
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to property mapping depends on
    */
  var property: uri
  
  /**
    * Code System (if necessary)
    */
  var system: js.UndefOr[uri] = js.undefined
}
object ConceptMapGroupElementTargetDependsOn {
  
  @scala.inline
  def apply(code: String, property: uri): ConceptMapGroupElementTargetDependsOn = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMapGroupElementTargetDependsOn]
  }
  
  @scala.inline
  implicit class ConceptMapGroupElementTargetDependsOnMutableBuilder[Self <: ConceptMapGroupElementTargetDependsOn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setProperty(value: uri): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: uri): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    @scala.inline
    def set_property(value: Element): Self = StObject.set(x, "_property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_propertyUndefined: Self = StObject.set(x, "_property", js.undefined)
    
    @scala.inline
    def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
  }
}
