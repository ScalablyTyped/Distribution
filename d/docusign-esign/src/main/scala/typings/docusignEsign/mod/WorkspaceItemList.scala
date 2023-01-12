package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceItemList extends StObject {
  
  /**
    * A list of workspace items.
    */
  var items: js.UndefOr[
    js.Array[
      /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
    ]
  ] = js.undefined
}
object WorkspaceItemList {
  
  inline def apply(): WorkspaceItemList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceItemList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceItemList] (val x: Self) extends AnyVal {
    
    inline def setItems(
      value: js.Array[
          /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(
      value: (/* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem)*
    ): Self = StObject.set(x, "items", js.Array(value*))
  }
}
