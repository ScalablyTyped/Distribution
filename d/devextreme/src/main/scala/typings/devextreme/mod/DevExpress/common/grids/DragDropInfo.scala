package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDropInfo extends StObject {
  
  val dropInsideItem: Boolean
}
object DragDropInfo {
  
  inline def apply(dropInsideItem: Boolean): DragDropInfo = {
    val __obj = js.Dynamic.literal(dropInsideItem = dropInsideItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragDropInfo] (val x: Self) extends AnyVal {
    
    inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
  }
}
