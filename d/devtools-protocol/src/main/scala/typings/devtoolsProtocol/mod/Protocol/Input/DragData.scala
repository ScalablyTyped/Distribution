package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragData extends StObject {
  
  /**
    * Bit field representing allowed drag operations. Copy = 1, Link = 2, Move = 16
    */
  var dragOperationsMask: integer
  
  /**
    * List of filenames that should be included when dropping
    */
  var files: js.UndefOr[js.Array[String]] = js.undefined
  
  var items: js.Array[DragDataItem]
}
object DragData {
  
  inline def apply(dragOperationsMask: integer, items: js.Array[DragDataItem]): DragData = {
    val __obj = js.Dynamic.literal(dragOperationsMask = dragOperationsMask.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragData]
  }
  
  extension [Self <: DragData](x: Self) {
    
    inline def setDragOperationsMask(value: integer): Self = StObject.set(x, "dragOperationsMask", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setItems(value: js.Array[DragDataItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: DragDataItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
