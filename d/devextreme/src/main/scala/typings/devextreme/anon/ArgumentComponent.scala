package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.viz.dxPolarChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgumentComponent extends StObject {
  
  var argument: js.UndefOr[typings.std.Date | Double | String] = js.native
  
  var component: js.UndefOr[dxPolarChart] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
}
object ArgumentComponent {
  
  @scala.inline
  def apply(): ArgumentComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentComponent]
  }
  
  @scala.inline
  implicit class ArgumentComponentMutableBuilder[Self <: ArgumentComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: typings.std.Date | Double | String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    @scala.inline
    def setComponent(value: dxPolarChart): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
  }
}
