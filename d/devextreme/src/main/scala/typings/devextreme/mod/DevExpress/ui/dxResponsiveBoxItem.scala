package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Col
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxResponsiveBoxItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies the item location and size against the UI component grid.
    */
  var location: js.UndefOr[Col | js.Array[Col]] = js.undefined
}
object dxResponsiveBoxItem {
  
  inline def apply(): dxResponsiveBoxItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxResponsiveBoxItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxResponsiveBoxItem] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Col | js.Array[Col]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: Col*): Self = StObject.set(x, "location", js.Array(value*))
  }
}
