package typings.draftJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<draft-js.draft-js.Draft.Model.ImmutableData.SelectionStateProperties> */
@js.native
trait PartialSelectionStateProp extends js.Object {
  
  var anchorKey: js.UndefOr[String] = js.native
  
  var anchorOffset: js.UndefOr[Double] = js.native
  
  var focusKey: js.UndefOr[String] = js.native
  
  var focusOffset: js.UndefOr[Double] = js.native
  
  var hasFocus: js.UndefOr[Boolean] = js.native
  
  var isBackward: js.UndefOr[Boolean] = js.native
}
object PartialSelectionStateProp {
  
  @scala.inline
  def apply(): PartialSelectionStateProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSelectionStateProp]
  }
  
  @scala.inline
  implicit class PartialSelectionStatePropOps[Self <: PartialSelectionStateProp] (val x: Self) extends AnyVal {
    
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
    def setAnchorKey(value: String): Self = this.set("anchorKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorKey: Self = this.set("anchorKey", js.undefined)
    
    @scala.inline
    def setAnchorOffset(value: Double): Self = this.set("anchorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorOffset: Self = this.set("anchorOffset", js.undefined)
    
    @scala.inline
    def setFocusKey(value: String): Self = this.set("focusKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusKey: Self = this.set("focusKey", js.undefined)
    
    @scala.inline
    def setFocusOffset(value: Double): Self = this.set("focusOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusOffset: Self = this.set("focusOffset", js.undefined)
    
    @scala.inline
    def setHasFocus(value: Boolean): Self = this.set("hasFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFocus: Self = this.set("hasFocus", js.undefined)
    
    @scala.inline
    def setIsBackward(value: Boolean): Self = this.set("isBackward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBackward: Self = this.set("isBackward", js.undefined)
  }
}
