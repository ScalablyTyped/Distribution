package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDateBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDate extends StObject {
  
  var component: js.UndefOr[dxDateBox] = js.undefined
  
  var date: js.UndefOr[typings.std.Date] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
}
object ComponentDate {
  
  inline def apply(): ComponentDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentDate]
  }
  
  extension [Self <: ComponentDate](x: Self) {
    
    inline def setComponent(value: dxDateBox): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDate(value: typings.std.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
