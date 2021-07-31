package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxSpeedDialAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionElement extends StObject {
  
  var actionElement: js.UndefOr[dxElement] = js.undefined
  
  var component: js.UndefOr[dxSpeedDialAction] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
}
object ActionElement {
  
  @scala.inline
  def apply(): ActionElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionElement]
  }
  
  @scala.inline
  implicit class ActionElementMutableBuilder[Self <: ActionElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionElement(value: dxElement): Self = StObject.set(x, "actionElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionElementUndefined: Self = StObject.set(x, "actionElement", js.undefined)
    
    @scala.inline
    def setComponent(value: dxSpeedDialAction): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
  }
}
