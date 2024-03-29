package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommunicationPayload
  extends StObject
     with BackboneElement {
  
  /**
    * The content can be codified or textual.  As an example of codified content, when working with machine generated communications, the payload may be drawn from a finite, terminology defined set of communications, especially for short, status update kinds of communications where more of a natural language approach isn't appropriate.
    * If the content isn't codified, contentCodeableConcept.text can be used.
    * When using contentCodeableConcept, the CodeableConcept is what is being communicated and is not a categorization of the content.
    */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * The content can be codified or textual.  As an example of codified content, when working with machine generated communications, the payload may be drawn from a finite, terminology defined set of communications, especially for short, status update kinds of communications where more of a natural language approach isn't appropriate.
    * If the content isn't codified, contentCodeableConcept.text can be used.
    * When using contentCodeableConcept, the CodeableConcept is what is being communicated and is not a categorization of the content.
    */
  var contentCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The content can be codified or textual.  As an example of codified content, when working with machine generated communications, the payload may be drawn from a finite, terminology defined set of communications, especially for short, status update kinds of communications where more of a natural language approach isn't appropriate.
    * If the content isn't codified, contentCodeableConcept.text can be used.
    * When using contentCodeableConcept, the CodeableConcept is what is being communicated and is not a categorization of the content.
    */
  var contentReference: js.UndefOr[Reference] = js.undefined
}
object CommunicationPayload {
  
  inline def apply(): CommunicationPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommunicationPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommunicationPayload] (val x: Self) extends AnyVal {
    
    inline def setContentAttachment(value: Attachment): Self = StObject.set(x, "contentAttachment", value.asInstanceOf[js.Any])
    
    inline def setContentAttachmentUndefined: Self = StObject.set(x, "contentAttachment", js.undefined)
    
    inline def setContentCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "contentCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setContentCodeableConceptUndefined: Self = StObject.set(x, "contentCodeableConcept", js.undefined)
    
    inline def setContentReference(value: Reference): Self = StObject.set(x, "contentReference", value.asInstanceOf[js.Any])
    
    inline def setContentReferenceUndefined: Self = StObject.set(x, "contentReference", js.undefined)
  }
}
