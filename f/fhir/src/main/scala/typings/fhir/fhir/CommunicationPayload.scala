package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message payload
  */
@js.native
trait CommunicationPayload extends BackboneElement {
  
  /**
    * Contains extended information for property 'contentString'.
    */
  var _contentString: js.UndefOr[Element] = js.native
  
  /**
    * Message part content
    */
  var contentAttachment: js.UndefOr[Attachment] = js.native
  
  /**
    * Message part content
    */
  var contentReference: js.UndefOr[Reference] = js.native
  
  /**
    * Message part content
    */
  var contentString: js.UndefOr[String] = js.native
}
object CommunicationPayload {
  
  @scala.inline
  def apply(): CommunicationPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommunicationPayload]
  }
  
  @scala.inline
  implicit class CommunicationPayloadOps[Self <: CommunicationPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_contentString(value: Element): Self = this.set("_contentString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_contentString: Self = this.set("_contentString", js.undefined)
    
    @scala.inline
    def setContentAttachment(value: Attachment): Self = this.set("contentAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentAttachment: Self = this.set("contentAttachment", js.undefined)
    
    @scala.inline
    def setContentReference(value: Reference): Self = this.set("contentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentReference: Self = this.set("contentReference", js.undefined)
    
    @scala.inline
    def setContentString(value: String): Self = this.set("contentString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentString: Self = this.set("contentString", js.undefined)
  }
}
