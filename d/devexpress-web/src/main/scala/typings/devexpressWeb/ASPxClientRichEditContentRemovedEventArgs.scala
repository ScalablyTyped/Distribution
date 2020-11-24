package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.ContentRemoved event.
  */
@js.native
trait ASPxClientRichEditContentRemovedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the text buffer interval related to the removed content.
    */
  var interval: Interval = js.native
  
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double = js.native
}
object ASPxClientRichEditContentRemovedEventArgs {
  
  @scala.inline
  def apply(interval: Interval, subDocumentId: Double): ASPxClientRichEditContentRemovedEventArgs = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditContentRemovedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditContentRemovedEventArgsOps[Self <: ASPxClientRichEditContentRemovedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setInterval(value: Interval): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDocumentId(value: Double): Self = this.set("subDocumentId", value.asInstanceOf[js.Any])
  }
}
