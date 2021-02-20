package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDropDownBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentValue extends StObject {
  
  var component: js.UndefOr[dxDropDownBox] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object ComponentValue {
  
  @scala.inline
  def apply(): ComponentValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentValue]
  }
  
  @scala.inline
  implicit class ComponentValueMutableBuilder[Self <: ComponentValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxDropDownBox): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
