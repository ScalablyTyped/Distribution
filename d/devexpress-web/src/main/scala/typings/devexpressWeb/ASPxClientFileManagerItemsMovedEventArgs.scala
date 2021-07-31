package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ItemsMoved event.
  */
trait ASPxClientFileManagerItemsMovedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets an array of the currently processed items.
    */
  var items: js.Array[ASPxClientFileManagerItem]
  
  /**
    * Gets the full name of the folder from which items are moved.
    */
  var oldFolderFullName: String
}
object ASPxClientFileManagerItemsMovedEventArgs {
  
  @scala.inline
  def apply(items: js.Array[ASPxClientFileManagerItem], oldFolderFullName: String): ASPxClientFileManagerItemsMovedEventArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], oldFolderFullName = oldFolderFullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemsMovedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerItemsMovedEventArgsMutableBuilder[Self <: ASPxClientFileManagerItemsMovedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ASPxClientFileManagerItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ASPxClientFileManagerItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setOldFolderFullName(value: String): Self = StObject.set(x, "oldFolderFullName", value.asInstanceOf[js.Any])
  }
}
