package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeSystemConceptDesignation
  extends StObject
     with BackboneElement {
  
  var _language: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * This was added rather than increasing the cardinality of .use to 0..* in order to maintain backward compatibility.
    */
  var additionalUse: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * In the absence of a language, the resource language applies.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * If no use is provided, the designation can be assumed to be suitable for general display to a human user.
    */
  var use: js.UndefOr[Coding] = js.undefined
  
  /**
    * The text value for this designation.
    */
  var value: String
}
object CodeSystemConceptDesignation {
  
  inline def apply(value: String): CodeSystemConceptDesignation = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemConceptDesignation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeSystemConceptDesignation] (val x: Self) extends AnyVal {
    
    inline def setAdditionalUse(value: js.Array[Coding]): Self = StObject.set(x, "additionalUse", value.asInstanceOf[js.Any])
    
    inline def setAdditionalUseUndefined: Self = StObject.set(x, "additionalUse", js.undefined)
    
    inline def setAdditionalUseVarargs(value: Coding*): Self = StObject.set(x, "additionalUse", js.Array(value*))
    
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
