package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ItemsCopied event.
  */
trait ASPxClientFileManagerItemsCopiedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets an array of the currently processed items.
    */
  var items: js.Array[ASPxClientFileManagerItem]
  
  /**
    * Gets the full name of the folder from which items are copied.
    */
  var oldFolderFullName: String
}
object ASPxClientFileManagerItemsCopiedEventArgs {
  
  @scala.inline
  def apply(items: js.Array[ASPxClientFileManagerItem], oldFolderFullName: String): ASPxClientFileManagerItemsCopiedEventArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], oldFolderFullName = oldFolderFullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemsCopiedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerItemsCopiedEventArgsMutableBuilder[Self <: ASPxClientFileManagerItemsCopiedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ASPxClientFileManagerItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ASPxClientFileManagerItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setOldFolderFullName(value: String): Self = StObject.set(x, "oldFolderFullName", value.asInstanceOf[js.Any])
  }
}
