package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxFileUploader
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BytesLoaded extends StObject {
  
  var bytesLoaded: js.UndefOr[Double] = js.native
  
  var bytesTotal: js.UndefOr[Double] = js.native
  
  var component: js.UndefOr[dxFileUploader] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  
  var file: js.UndefOr[typings.std.File] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var request: js.UndefOr[XMLHttpRequest] = js.native
  
  var segmentSize: js.UndefOr[Double] = js.native
}
object BytesLoaded {
  
  @scala.inline
  def apply(): BytesLoaded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BytesLoaded]
  }
  
  @scala.inline
  implicit class BytesLoadedMutableBuilder[Self <: BytesLoaded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesLoaded(value: Double): Self = StObject.set(x, "bytesLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesLoadedUndefined: Self = StObject.set(x, "bytesLoaded", js.undefined)
    
    @scala.inline
    def setBytesTotal(value: Double): Self = StObject.set(x, "bytesTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesTotalUndefined: Self = StObject.set(x, "bytesTotal", js.undefined)
    
    @scala.inline
    def setComponent(value: dxFileUploader): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
    def setFile(value: typings.std.File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setSegmentSize(value: Double): Self = StObject.set(x, "segmentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentSizeUndefined: Self = StObject.set(x, "segmentSize", js.undefined)
  }
}
