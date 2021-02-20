package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDateBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDate extends StObject {
  
  var component: js.UndefOr[dxDateBox] = js.native
  
  var date: js.UndefOr[typings.std.Date] = js.native
  
  var view: js.UndefOr[String] = js.native
}
object ComponentDate {
  
  @scala.inline
  def apply(): ComponentDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentDate]
  }
  
  @scala.inline
  implicit class ComponentDateMutableBuilder[Self <: ComponentDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxDateBox): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setDate(value: typings.std.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
