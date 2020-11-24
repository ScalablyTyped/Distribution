package typings.draftJs.mod.Draft.Model.ImmutableData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionStateProperties extends js.Object {
  
  var anchorKey: String = js.native
  
  var anchorOffset: Double = js.native
  
  var focusKey: String = js.native
  
  var focusOffset: Double = js.native
  
  var hasFocus: Boolean = js.native
  
  var isBackward: Boolean = js.native
}
object SelectionStateProperties {
  
  @scala.inline
  def apply(
    anchorKey: String,
    anchorOffset: Double,
    focusKey: String,
    focusOffset: Double,
    hasFocus: Boolean,
    isBackward: Boolean
  ): SelectionStateProperties = {
    val __obj = js.Dynamic.literal(anchorKey = anchorKey.asInstanceOf[js.Any], anchorOffset = anchorOffset.asInstanceOf[js.Any], focusKey = focusKey.asInstanceOf[js.Any], focusOffset = focusOffset.asInstanceOf[js.Any], hasFocus = hasFocus.asInstanceOf[js.Any], isBackward = isBackward.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionStateProperties]
  }
  
  @scala.inline
  implicit class SelectionStatePropertiesOps[Self <: SelectionStateProperties] (val x: Self) extends AnyVal {
    
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
    def setAnchorOffset(value: Double): Self = this.set("anchorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusKey(value: String): Self = this.set("focusKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusOffset(value: Double): Self = this.set("focusOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFocus(value: Boolean): Self = this.set("hasFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBackward(value: Boolean): Self = this.set("isBackward", value.asInstanceOf[js.Any])
  }
}
