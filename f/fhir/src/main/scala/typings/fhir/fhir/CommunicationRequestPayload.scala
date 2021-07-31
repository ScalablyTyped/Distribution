package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message payload
  */
trait CommunicationRequestPayload
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'contentString'.
    */
  var _contentString: js.UndefOr[Element] = js.undefined
  
  /**
    * Message part content
    */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Message part content
    */
  var contentReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Message part content
    */
  var contentString: js.UndefOr[String] = js.undefined
}
object CommunicationRequestPayload {
  
  @scala.inline
  def apply(): CommunicationRequestPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommunicationRequestPayload]
  }
  
  @scala.inline
  implicit class CommunicationRequestPayloadMutableBuilder[Self <: CommunicationRequestPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentAttachment(value: Attachment): Self = StObject.set(x, "contentAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentAttachmentUndefined: Self = StObject.set(x, "contentAttachment", js.undefined)
    
    @scala.inline
    def setContentReference(value: Reference): Self = StObject.set(x, "contentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentReferenceUndefined: Self = StObject.set(x, "contentReference", js.undefined)
    
    @scala.inline
    def setContentString(value: String): Self = StObject.set(x, "contentString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStringUndefined: Self = StObject.set(x, "contentString", js.undefined)
    
    @scala.inline
    def set_contentString(value: Element): Self = StObject.set(x, "_contentString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_contentStringUndefined: Self = StObject.set(x, "_contentString", js.undefined)
  }
}
