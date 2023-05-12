package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReferenceContentProfile
  extends StObject
     with BackboneElement {
  
  var _valueCanonical: js.UndefOr[Element] = js.undefined
  
  var _valueUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Code|uri|canonical.
    */
  var valueCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * Code|uri|canonical.
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * Code|uri|canonical.
    */
  var valueUri: js.UndefOr[String] = js.undefined
}
object DocumentReferenceContentProfile {
  
  inline def apply(): DocumentReferenceContentProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentReferenceContentProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentReferenceContentProfile] (val x: Self) extends AnyVal {
    
    inline def setValueCanonical(value: String): Self = StObject.set(x, "valueCanonical", value.asInstanceOf[js.Any])
    
    inline def setValueCanonicalUndefined: Self = StObject.set(x, "valueCanonical", js.undefined)
    
    inline def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    inline def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    inline def setValueUri(value: String): Self = StObject.set(x, "valueUri", value.asInstanceOf[js.Any])
    
    inline def setValueUriUndefined: Self = StObject.set(x, "valueUri", js.undefined)
    
    inline def set_valueCanonical(value: Element): Self = StObject.set(x, "_valueCanonical", value.asInstanceOf[js.Any])
    
    inline def set_valueCanonicalUndefined: Self = StObject.set(x, "_valueCanonical", js.undefined)
    
    inline def set_valueUri(value: Element): Self = StObject.set(x, "_valueUri", value.asInstanceOf[js.Any])
    
    inline def set_valueUriUndefined: Self = StObject.set(x, "_valueUri", js.undefined)
  }
}
