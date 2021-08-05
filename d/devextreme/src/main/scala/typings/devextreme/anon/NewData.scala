package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewData[T] extends StObject {
  
  var cancel: js.UndefOr[Boolean | typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]] = js.undefined
  
  var component: js.UndefOr[T] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var key: js.UndefOr[js.Any] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var newData: js.UndefOr[js.Any] = js.undefined
  
  var oldData: js.UndefOr[js.Any] = js.undefined
}
object NewData {
  
  inline def apply[T](): NewData[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewData[T]]
  }
  
  extension [Self <: NewData[?], T](x: Self & NewData[T]) {
    
    inline def setCancel(value: Boolean | typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNewData(value: js.Any): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
    
    inline def setNewDataUndefined: Self = StObject.set(x, "newData", js.undefined)
    
    inline def setOldData(value: js.Any): Self = StObject.set(x, "oldData", value.asInstanceOf[js.Any])
    
    inline def setOldDataUndefined: Self = StObject.set(x, "oldData", js.undefined)
  }
}
