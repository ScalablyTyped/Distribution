package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import typings.devextreme.mod.global.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldData extends StObject {
  
  var cancel: js.UndefOr[
    Boolean | typings.devextreme.mod.global.Promise[Boolean] | JQueryPromise[Boolean]
  ] = js.native
  
  var component: js.UndefOr[dxScheduler] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var newData: js.UndefOr[js.Any] = js.native
  
  var oldData: js.UndefOr[js.Any] = js.native
}
object OldData {
  
  @scala.inline
  def apply(): OldData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OldData]
  }
  
  @scala.inline
  implicit class OldDataMutableBuilder[Self <: OldData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean | typings.devextreme.mod.global.Promise[Boolean] | JQueryPromise[Boolean]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: dxScheduler): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
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
