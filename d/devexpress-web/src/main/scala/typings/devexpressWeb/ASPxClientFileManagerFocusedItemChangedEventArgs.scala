package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FocusedItemChanged event.
  */
trait ASPxClientFileManagerFocusedItemChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the full name of the item currently being processed.
    */
  var fullName: String
  
  /**
    * Gets the file manager item object related to the event.
    */
  var item: ASPxClientFileManagerItem
  
  /**
    * Gets the name of the focused item.
    */
  var name: String
}
object ASPxClientFileManagerFocusedItemChangedEventArgs {
  
  @scala.inline
  def apply(fullName: String, item: ASPxClientFileManagerItem, name: String): ASPxClientFileManagerFocusedItemChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFocusedItemChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerFocusedItemChangedEventArgsMutableBuilder[Self <: ASPxClientFileManagerFocusedItemChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ASPxClientFileManagerItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
