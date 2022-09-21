package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDropDownList[TProperties]
  extends StObject
     with dxDropDownEditor[TProperties] {
  
  def getDataSource(): DataSource[Any, Any] = js.native
}
object dxDropDownList {
  
  trait SelectionChangedInfo[T] extends StObject {
    
    val selectedItem: T
  }
  object SelectionChangedInfo {
    
    inline def apply[T](selectedItem: T): SelectionChangedInfo[T] = {
      val __obj = js.Dynamic.literal(selectedItem = selectedItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedInfo[T]]
    }
    
    extension [Self <: SelectionChangedInfo[?], T](x: Self & SelectionChangedInfo[T]) {
      
      inline def setSelectedItem(value: T): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    }
  }
}
