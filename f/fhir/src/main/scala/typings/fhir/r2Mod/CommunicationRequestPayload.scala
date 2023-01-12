package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommunicationRequestPayload
  extends StObject
     with BackboneElement {
  
  var _contentString: js.UndefOr[Element] = js.undefined
  
  /**
    * The communicated content (or for multi-part communications, one portion of the communication).
    */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * The communicated content (or for multi-part communications, one portion of the communication).
    */
  var contentReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The communicated content (or for multi-part communications, one portion of the communication).
    */
  var contentString: js.UndefOr[String] = js.undefined
}
object CommunicationRequestPayload {
  
  inline def apply(): CommunicationRequestPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommunicationRequestPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommunicationRequestPayload] (val x: Self) extends AnyVal {
    
    inline def setContentAttachment(value: Attachment): Self = StObject.set(x, "contentAttachment", value.asInstanceOf[js.Any])
    
    inline def setContentAttachmentUndefined: Self = StObject.set(x, "contentAttachment", js.undefined)
    
    inline def setContentReference(value: Reference): Self = StObject.set(x, "contentReference", value.asInstanceOf[js.Any])
    
    inline def setContentReferenceUndefined: Self = StObject.set(x, "contentReference", js.undefined)
    
    inline def setContentString(value: String): Self = StObject.set(x, "contentString", value.asInstanceOf[js.Any])
    
    inline def setContentStringUndefined: Self = StObject.set(x, "contentString", js.undefined)
    
    inline def set_contentString(value: Element): Self = StObject.set(x, "_contentString", value.asInstanceOf[js.Any])
    
    inline def set_contentStringUndefined: Self = StObject.set(x, "_contentString", js.undefined)
  }
}
