package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminologyCapabilitiesValidateCode
  extends StObject
     with BackboneElement {
  
  var _translations: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether translations are validated.
    */
  var translations: Boolean
}
object TerminologyCapabilitiesValidateCode {
  
  inline def apply(translations: Boolean): TerminologyCapabilitiesValidateCode = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminologyCapabilitiesValidateCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminologyCapabilitiesValidateCode] (val x: Self) extends AnyVal {
    
    inline def setTranslations(value: Boolean): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def set_translations(value: Element): Self = StObject.set(x, "_translations", value.asInstanceOf[js.Any])
    
    inline def set_translationsUndefined: Self = StObject.set(x, "_translations", js.undefined)
  }
}
