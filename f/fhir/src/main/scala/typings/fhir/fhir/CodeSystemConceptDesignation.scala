package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional representations for the concept
  */
trait CodeSystemConceptDesignation
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Human language of the designation
    */
  var language: js.UndefOr[code] = js.undefined
  
  /**
    * Details how this designation would be used
    */
  var use: js.UndefOr[Coding] = js.undefined
  
  /**
    * The text value for this designation
    */
  var value: String
}
object CodeSystemConceptDesignation {
  
  inline def apply(value: String): CodeSystemConceptDesignation = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemConceptDesignation]
  }
  
  extension [Self <: CodeSystemConceptDesignation](x: Self) {
    
    inline def setLanguage(value: code): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
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
