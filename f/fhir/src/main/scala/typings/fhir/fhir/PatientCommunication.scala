package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of Languages which may be used to communicate with the patient about their health
  */
trait PatientCommunication
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'preferred'.
    */
  var _preferred: js.UndefOr[Element] = js.undefined
  
  /**
    * The language which can be used to communicate with the patient about their health
    */
  var language: CodeableConcept
  
  /**
    * Language preference indicator
    */
  var preferred: js.UndefOr[Boolean] = js.undefined
}
object PatientCommunication {
  
  @scala.inline
  def apply(language: CodeableConcept): PatientCommunication = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatientCommunication]
  }
  
  @scala.inline
  implicit class PatientCommunicationMutableBuilder[Self <: PatientCommunication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: CodeableConcept): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
    
    @scala.inline
    def set_preferred(value: Element): Self = StObject.set(x, "_preferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_preferredUndefined: Self = StObject.set(x, "_preferred", js.undefined)
  }
}
