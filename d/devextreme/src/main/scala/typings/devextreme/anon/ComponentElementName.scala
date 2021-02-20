package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxGantt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentElementName extends StObject {
  
  var component: js.UndefOr[dxGantt] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object ComponentElementName {
  
  @scala.inline
  def apply(): ComponentElementName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentElementName]
  }
  
  @scala.inline
  implicit class ComponentElementNameMutableBuilder[Self <: ComponentElementName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxGantt): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
