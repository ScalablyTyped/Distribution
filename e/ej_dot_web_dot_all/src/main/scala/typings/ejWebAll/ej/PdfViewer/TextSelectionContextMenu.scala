package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextSelectionContextMenu extends js.Object {
  
  /** Enables/disables the copy menu in the text selection context menu.
    */
  var isCopyEnable: js.UndefOr[Boolean] = js.native
  
  /** Enables/ disables the text selection context menu.
    */
  var isEnable: js.UndefOr[Boolean] = js.native
  
  /** Enables/disables the highlight annotation menu in the text selection context menu.
    */
  var isHighlightEnable: js.UndefOr[Boolean] = js.native
  
  /** Enables/disables the search menu in the text selection context menu.
    */
  var isSearchEnable: js.UndefOr[Boolean] = js.native
  
  /** Enables/disables the strikeout annotation menu in the text selection context menu.
    */
  var isStrikeoutEnable: js.UndefOr[Boolean] = js.native
}
object TextSelectionContextMenu {
  
  @scala.inline
  def apply(): TextSelectionContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSelectionContextMenu]
  }
  
  @scala.inline
  implicit class TextSelectionContextMenuOps[Self <: TextSelectionContextMenu] (val x: Self) extends AnyVal {
    
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
    def setIsCopyEnable(value: Boolean): Self = this.set("isCopyEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCopyEnable: Self = this.set("isCopyEnable", js.undefined)
    
    @scala.inline
    def setIsEnable(value: Boolean): Self = this.set("isEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnable: Self = this.set("isEnable", js.undefined)
    
    @scala.inline
    def setIsHighlightEnable(value: Boolean): Self = this.set("isHighlightEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHighlightEnable: Self = this.set("isHighlightEnable", js.undefined)
    
    @scala.inline
    def setIsSearchEnable(value: Boolean): Self = this.set("isSearchEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSearchEnable: Self = this.set("isSearchEnable", js.undefined)
    
    @scala.inline
    def setIsStrikeoutEnable(value: Boolean): Self = this.set("isStrikeoutEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStrikeoutEnable: Self = this.set("isStrikeoutEnable", js.undefined)
  }
}
