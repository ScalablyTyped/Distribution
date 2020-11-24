package typings.devextreme.anon

import typings.devextreme.devextremeStrings.alt
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.ctrl
import typings.devextreme.devextremeStrings.meta
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.pan
import typings.devextreme.devextremeStrings.shift
import typings.devextreme.devextremeStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowMouseWheel extends js.Object {
  
  var allowMouseWheel: js.UndefOr[Boolean] = js.native
  
  var allowTouchGestures: js.UndefOr[Boolean] = js.native
  
  var argumentAxis: js.UndefOr[both | none | pan | zoom] = js.native
  
  var dragBoxStyle: js.UndefOr[Opacity] = js.native
  
  var dragToZoom: js.UndefOr[Boolean] = js.native
  
  var panKey: js.UndefOr[alt | ctrl | meta | shift] = js.native
  
  var valueAxis: js.UndefOr[both | none | pan | zoom] = js.native
}
object AllowMouseWheel {
  
  @scala.inline
  def apply(): AllowMouseWheel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowMouseWheel]
  }
  
  @scala.inline
  implicit class AllowMouseWheelOps[Self <: AllowMouseWheel] (val x: Self) extends AnyVal {
    
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
    def setAllowMouseWheel(value: Boolean): Self = this.set("allowMouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMouseWheel: Self = this.set("allowMouseWheel", js.undefined)
    
    @scala.inline
    def setAllowTouchGestures(value: Boolean): Self = this.set("allowTouchGestures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTouchGestures: Self = this.set("allowTouchGestures", js.undefined)
    
    @scala.inline
    def setArgumentAxis(value: both | none | pan | zoom): Self = this.set("argumentAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgumentAxis: Self = this.set("argumentAxis", js.undefined)
    
    @scala.inline
    def setDragBoxStyle(value: Opacity): Self = this.set("dragBoxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragBoxStyle: Self = this.set("dragBoxStyle", js.undefined)
    
    @scala.inline
    def setDragToZoom(value: Boolean): Self = this.set("dragToZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragToZoom: Self = this.set("dragToZoom", js.undefined)
    
    @scala.inline
    def setPanKey(value: alt | ctrl | meta | shift): Self = this.set("panKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanKey: Self = this.set("panKey", js.undefined)
    
    @scala.inline
    def setValueAxis(value: both | none | pan | zoom): Self = this.set("valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAxis: Self = this.set("valueAxis", js.undefined)
  }
}
