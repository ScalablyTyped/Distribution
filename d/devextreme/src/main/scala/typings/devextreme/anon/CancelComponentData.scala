package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelComponentData[T] extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var component: js.UndefOr[T] = js.undefined
  
  var data: js.UndefOr[Blob] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
}
object CancelComponentData {
  
  inline def apply[T](): CancelComponentData[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelComponentData[T]]
  }
  
  extension [Self <: CancelComponentData[?], T](x: Self & CancelComponentData[T]) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setData(value: Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
