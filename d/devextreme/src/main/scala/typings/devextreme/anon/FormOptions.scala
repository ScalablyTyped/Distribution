package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormOptions[T] extends StObject {
  
  var component: js.UndefOr[T] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var formOptions: js.UndefOr[js.Any] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
}
object FormOptions {
  
  @scala.inline
  def apply[T](): FormOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormOptions[T]]
  }
  
  @scala.inline
  implicit class FormOptionsMutableBuilder[Self <: FormOptions[_], T] (val x: Self with FormOptions[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setFormOptions(value: js.Any): Self = StObject.set(x, "formOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormOptionsUndefined: Self = StObject.set(x, "formOptions", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
