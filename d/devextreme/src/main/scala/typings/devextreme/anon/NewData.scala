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
  
  @scala.inline
  def apply[T](): NewData[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewData[T]]
  }
  
  @scala.inline
  implicit class NewDataMutableBuilder[Self <: NewData[?], T] (val x: Self & NewData[T]) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean | typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setNewData(value: js.Any): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewDataUndefined: Self = StObject.set(x, "newData", js.undefined)
    
    @scala.inline
    def setOldData(value: js.Any): Self = StObject.set(x, "oldData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldDataUndefined: Self = StObject.set(x, "oldData", js.undefined)
  }
}
