package typings.devextreme.anon

import typings.devextreme.devextremeStrings.onMoving
import typings.devextreme.devextremeStrings.onMovingComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowSlidersSwap extends js.Object {
  
  var allowSlidersSwap: js.UndefOr[Boolean] = js.native
  
  var animationEnabled: js.UndefOr[Boolean] = js.native
  
  var callValueChanged: js.UndefOr[onMoving | onMovingComplete] = js.native
  
  var manualRangeSelectionEnabled: js.UndefOr[Boolean] = js.native
  
  var moveSelectedRangeByClick: js.UndefOr[Boolean] = js.native
  
  var snapToTicks: js.UndefOr[Boolean] = js.native
}
object AllowSlidersSwap {
  
  @scala.inline
  def apply(): AllowSlidersSwap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowSlidersSwap]
  }
  
  @scala.inline
  implicit class AllowSlidersSwapOps[Self <: AllowSlidersSwap] (val x: Self) extends AnyVal {
    
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
    def setAllowSlidersSwap(value: Boolean): Self = this.set("allowSlidersSwap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSlidersSwap: Self = this.set("allowSlidersSwap", js.undefined)
    
    @scala.inline
    def setAnimationEnabled(value: Boolean): Self = this.set("animationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEnabled: Self = this.set("animationEnabled", js.undefined)
    
    @scala.inline
    def setCallValueChanged(value: onMoving | onMovingComplete): Self = this.set("callValueChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallValueChanged: Self = this.set("callValueChanged", js.undefined)
    
    @scala.inline
    def setManualRangeSelectionEnabled(value: Boolean): Self = this.set("manualRangeSelectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualRangeSelectionEnabled: Self = this.set("manualRangeSelectionEnabled", js.undefined)
    
    @scala.inline
    def setMoveSelectedRangeByClick(value: Boolean): Self = this.set("moveSelectedRangeByClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveSelectedRangeByClick: Self = this.set("moveSelectedRangeByClick", js.undefined)
    
    @scala.inline
    def setSnapToTicks(value: Boolean): Self = this.set("snapToTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapToTicks: Self = this.set("snapToTicks", js.undefined)
  }
}
