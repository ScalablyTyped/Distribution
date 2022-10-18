package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetCodeSystemConceptDesignation
  extends StObject
     with BackboneElement {
  
  var _language: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * The language this designation is defined for.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * A code that details how this designation would be used.
    */
  var use: js.UndefOr[Coding] = js.undefined
  
  /**
    * The text value for this designation.
    */
  var value: String
}
object ValueSetCodeSystemConceptDesignation {
  
  inline def apply(value: String): ValueSetCodeSystemConceptDesignation = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetCodeSystemConceptDesignation]
  }
  
  extension [Self <: ValueSetCodeSystemConceptDesignation](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setUse(value: Coding): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    inline def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
