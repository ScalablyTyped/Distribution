package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatientCommunication
  extends StObject
     with BackboneElement {
  
  var _preferred: js.UndefOr[Element] = js.undefined
  
  /**
    * Most systems in multilingual countries will want to convey language. Not all systems actually need the regional dialect.
    */
  var language: CodeableConcept
  
  /**
    * People that master multiple languages up to certain level may prefer one or more, i.e. feel more confident in communicating in a particular language making other languages sort of a fall back method.
    */
  var preferred: js.UndefOr[Boolean] = js.undefined
}
object PatientCommunication {
  
  inline def apply(language: CodeableConcept): PatientCommunication = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatientCommunication]
  }
  
  extension [Self <: PatientCommunication](x: Self) {
    
    inline def setLanguage(value: CodeableConcept): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
    
    inline def set_preferred(value: Element): Self = StObject.set(x, "_preferred", value.asInstanceOf[js.Any])
    
    inline def set_preferredUndefined: Self = StObject.set(x, "_preferred", js.undefined)
  }
}
