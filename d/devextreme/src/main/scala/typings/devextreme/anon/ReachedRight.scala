package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReachedRight[T] extends StObject {
  
  var component: js.UndefOr[T] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var reachedBottom: js.UndefOr[Boolean] = js.undefined
  
  var reachedLeft: js.UndefOr[Boolean] = js.undefined
  
  var reachedRight: js.UndefOr[Boolean] = js.undefined
  
  var reachedTop: js.UndefOr[Boolean] = js.undefined
  
  var scrollOffset: js.UndefOr[js.Any] = js.undefined
}
object ReachedRight {
  
  @scala.inline
  def apply[T](): ReachedRight[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachedRight[T]]
  }
  
  @scala.inline
  implicit class ReachedRightMutableBuilder[Self <: ReachedRight[?], T] (val x: Self & ReachedRight[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setReachedBottom(value: Boolean): Self = StObject.set(x, "reachedBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachedBottomUndefined: Self = StObject.set(x, "reachedBottom", js.undefined)
    
    @scala.inline
    def setReachedLeft(value: Boolean): Self = StObject.set(x, "reachedLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachedLeftUndefined: Self = StObject.set(x, "reachedLeft", js.undefined)
    
    @scala.inline
    def setReachedRight(value: Boolean): Self = StObject.set(x, "reachedRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachedRightUndefined: Self = StObject.set(x, "reachedRight", js.undefined)
    
    @scala.inline
    def setReachedTop(value: Boolean): Self = StObject.set(x, "reachedTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachedTopUndefined: Self = StObject.set(x, "reachedTop", js.undefined)
    
    @scala.inline
    def setScrollOffset(value: js.Any): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
  }
}
