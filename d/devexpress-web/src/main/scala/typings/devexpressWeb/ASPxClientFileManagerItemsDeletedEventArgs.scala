package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ItemsDeleted event.
  */
@js.native
trait ASPxClientFileManagerItemsDeletedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets an array of the currently processed items.
    */
  var items: js.Array[ASPxClientFileManagerItem] = js.native
}
object ASPxClientFileManagerItemsDeletedEventArgs {
  
  @scala.inline
  def apply(items: js.Array[ASPxClientFileManagerItem]): ASPxClientFileManagerItemsDeletedEventArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemsDeletedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerItemsDeletedEventArgsMutableBuilder[Self <: ASPxClientFileManagerItemsDeletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ASPxClientFileManagerItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ASPxClientFileManagerItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
