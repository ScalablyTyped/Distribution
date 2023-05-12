package typings.devextreme.mod.DevExpress.common.grids

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragReorderInfo extends StObject {
  
  val dropInsideItem: Boolean
  
  var promise: js.UndefOr[PromiseLike[Unit]] = js.undefined
}
object DragReorderInfo {
  
  inline def apply(dropInsideItem: Boolean): DragReorderInfo = {
    val __obj = js.Dynamic.literal(dropInsideItem = dropInsideItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragReorderInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragReorderInfo] (val x: Self) extends AnyVal {
    
    inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
    
    inline def setPromise(value: PromiseLike[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
