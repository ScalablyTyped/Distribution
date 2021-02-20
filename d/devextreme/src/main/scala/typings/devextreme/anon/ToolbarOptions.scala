package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxToolbarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarOptions[T] extends StObject {
  
  var component: js.UndefOr[T] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var toolbarOptions: js.UndefOr[dxToolbarOptions] = js.native
}
object ToolbarOptions {
  
  @scala.inline
  def apply[T](): ToolbarOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarOptions[T]]
  }
  
  @scala.inline
  implicit class ToolbarOptionsMutableBuilder[Self <: ToolbarOptions[_], T] (val x: Self with ToolbarOptions[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
    def setToolbarOptions(value: dxToolbarOptions): Self = StObject.set(x, "toolbarOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarOptionsUndefined: Self = StObject.set(x, "toolbarOptions", js.undefined)
  }
}
