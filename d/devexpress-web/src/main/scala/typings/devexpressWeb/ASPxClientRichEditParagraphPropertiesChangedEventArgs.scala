package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.ParagraphPropertiesChanged event.
  */
@js.native
trait ASPxClientRichEditParagraphPropertiesChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the changed paragraph's index.
    */
  var paragraphIndex: Double = js.native
  
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double = js.native
}
object ASPxClientRichEditParagraphPropertiesChangedEventArgs {
  
  @scala.inline
  def apply(paragraphIndex: Double, subDocumentId: Double): ASPxClientRichEditParagraphPropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal(paragraphIndex = paragraphIndex.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditParagraphPropertiesChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditParagraphPropertiesChangedEventArgsOps[Self <: ASPxClientRichEditParagraphPropertiesChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setParagraphIndex(value: Double): Self = this.set("paragraphIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDocumentId(value: Double): Self = this.set("subDocumentId", value.asInstanceOf[js.Any])
  }
}
