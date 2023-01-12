package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.SelectionChanged event.
  */
trait ASPxClientFileManagerSelectionChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the full name of the file currently being processed.
    */
  var fullName: String
  
  /**
    * Gets whether the item has been selected.
    */
  var isSelected: Boolean
  
  /**
    * Gets the file manager item object related to the event.
    */
  var item: ASPxClientFileManagerItem
  
  /**
    * Gets the name of the currently processed file.
    */
  var name: String
}
object ASPxClientFileManagerSelectionChangedEventArgs {
  
  inline def apply(fullName: String, isSelected: Boolean, item: ASPxClientFileManagerItem, name: String): ASPxClientFileManagerSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientFileManagerSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setItem(value: ASPxClientFileManagerItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
