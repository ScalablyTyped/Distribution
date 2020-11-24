package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScroll extends js.Object {
  
  var autoScroll: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var onAdd: js.UndefOr[js.Function1[/* e */ EventFromComponent, _]] = js.native
  
  var onDragEnd: js.UndefOr[js.Function1[/* e */ CancelEvent, _]] = js.native
  
  var onDragMove: js.UndefOr[js.Function1[/* e */ CancelEvent, _]] = js.native
  
  var onDragStart: js.UndefOr[js.Function1[/* e */ FromDataItemData, _]] = js.native
  
  var onRemove: js.UndefOr[js.Function1[/* e */ FromComponentFromData, _]] = js.native
  
  var scrollSensitivity: js.UndefOr[Double] = js.native
  
  var scrollSpeed: js.UndefOr[Double] = js.native
}
object AutoScroll {
  
  @scala.inline
  def apply(): AutoScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScroll]
  }
  
  @scala.inline
  implicit class AutoScrollOps[Self <: AutoScroll] (val x: Self) extends AnyVal {
    
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
    def setAutoScroll(value: Boolean): Self = this.set("autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScroll: Self = this.set("autoScroll", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setOnAdd(value: /* e */ EventFromComponent => _): Self = this.set("onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: /* e */ CancelEvent => _): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragMove(value: /* e */ CancelEvent => _): Self = this.set("onDragMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragMove: Self = this.set("onDragMove", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* e */ FromDataItemData => _): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnRemove(value: /* e */ FromComponentFromData => _): Self = this.set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setScrollSensitivity(value: Double): Self = this.set("scrollSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSensitivity: Self = this.set("scrollSensitivity", js.undefined)
    
    @scala.inline
    def setScrollSpeed(value: Double): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
  }
}
