package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxFileUploader
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesLoaded extends StObject {
  
  var bytesLoaded: js.UndefOr[Double] = js.undefined
  
  var bytesTotal: js.UndefOr[Double] = js.undefined
  
  var component: js.UndefOr[dxFileUploader] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var file: js.UndefOr[typings.std.File] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var request: js.UndefOr[XMLHttpRequest] = js.undefined
  
  var segmentSize: js.UndefOr[Double] = js.undefined
}
object BytesLoaded {
  
  inline def apply(): BytesLoaded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BytesLoaded]
  }
  
  extension [Self <: BytesLoaded](x: Self) {
    
    inline def setBytesLoaded(value: Double): Self = StObject.set(x, "bytesLoaded", value.asInstanceOf[js.Any])
    
    inline def setBytesLoadedUndefined: Self = StObject.set(x, "bytesLoaded", js.undefined)
    
    inline def setBytesTotal(value: Double): Self = StObject.set(x, "bytesTotal", value.asInstanceOf[js.Any])
    
    inline def setBytesTotalUndefined: Self = StObject.set(x, "bytesTotal", js.undefined)
    
    inline def setComponent(value: dxFileUploader): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setFile(value: typings.std.File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setRequest(value: XMLHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setSegmentSize(value: Double): Self = StObject.set(x, "segmentSize", value.asInstanceOf[js.Any])
    
    inline def setSegmentSizeUndefined: Self = StObject.set(x, "segmentSize", js.undefined)
  }
}
