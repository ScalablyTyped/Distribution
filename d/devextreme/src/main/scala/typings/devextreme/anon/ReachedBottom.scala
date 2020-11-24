package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReachedBottom extends js.Object {
  
  var component: js.UndefOr[dxList] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var reachedBottom: js.UndefOr[Boolean] = js.native
  
  var reachedLeft: js.UndefOr[Boolean] = js.native
  
  var reachedRight: js.UndefOr[Boolean] = js.native
  
  var reachedTop: js.UndefOr[Boolean] = js.native
  
  var scrollOffset: js.UndefOr[js.Any] = js.native
}
object ReachedBottom {
  
  @scala.inline
  def apply(): ReachedBottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachedBottom]
  }
  
  @scala.inline
  implicit class ReachedBottomOps[Self <: ReachedBottom] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: dxList): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setReachedBottom(value: Boolean): Self = this.set("reachedBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReachedBottom: Self = this.set("reachedBottom", js.undefined)
    
    @scala.inline
    def setReachedLeft(value: Boolean): Self = this.set("reachedLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReachedLeft: Self = this.set("reachedLeft", js.undefined)
    
    @scala.inline
    def setReachedRight(value: Boolean): Self = this.set("reachedRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReachedRight: Self = this.set("reachedRight", js.undefined)
    
    @scala.inline
    def setReachedTop(value: Boolean): Self = this.set("reachedTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReachedTop: Self = this.set("reachedTop", js.undefined)
    
    @scala.inline
    def setScrollOffset(value: js.Any): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollOffset: Self = this.set("scrollOffset", js.undefined)
  }
}
