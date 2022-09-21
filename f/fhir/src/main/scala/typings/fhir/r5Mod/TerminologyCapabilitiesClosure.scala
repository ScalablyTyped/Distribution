package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminologyCapabilitiesClosure
  extends StObject
     with BackboneElement {
  
  var _translation: js.UndefOr[Element] = js.undefined
  
  /**
    * If cross-system closure is supported.
    */
  var translation: js.UndefOr[Boolean] = js.undefined
}
object TerminologyCapabilitiesClosure {
  
  inline def apply(): TerminologyCapabilitiesClosure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminologyCapabilitiesClosure]
  }
  
  extension [Self <: TerminologyCapabilitiesClosure](x: Self) {
    
    inline def setTranslation(value: Boolean): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
    
    inline def set_translation(value: Element): Self = StObject.set(x, "_translation", value.asInstanceOf[js.Any])
    
    inline def set_translationUndefined: Self = StObject.set(x, "_translation", js.undefined)
  }
}
