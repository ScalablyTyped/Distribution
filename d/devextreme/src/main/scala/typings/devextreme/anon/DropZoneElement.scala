package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxFileUploader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropZoneElement extends StObject {
  
  var component: js.UndefOr[dxFileUploader] = js.native
  
  var dropZoneElement: js.UndefOr[dxElement] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
}
object DropZoneElement {
  
  @scala.inline
  def apply(): DropZoneElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropZoneElement]
  }
  
  @scala.inline
  implicit class DropZoneElementMutableBuilder[Self <: DropZoneElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxFileUploader): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setDropZoneElement(value: dxElement): Self = StObject.set(x, "dropZoneElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropZoneElementUndefined: Self = StObject.set(x, "dropZoneElement", js.undefined)
    
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
