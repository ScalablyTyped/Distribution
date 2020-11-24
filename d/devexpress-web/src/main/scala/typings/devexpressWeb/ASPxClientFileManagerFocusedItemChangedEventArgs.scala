package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FocusedItemChanged event.
  */
@js.native
trait ASPxClientFileManagerFocusedItemChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the full name of the item currently being processed.
    */
  var fullName: String = js.native
  
  /**
    * Gets the file manager item object related to the event.
    */
  var item: ASPxClientFileManagerItem = js.native
  
  /**
    * Gets the name of the focused item.
    */
  var name: String = js.native
}
object ASPxClientFileManagerFocusedItemChangedEventArgs {
  
  @scala.inline
  def apply(fullName: String, item: ASPxClientFileManagerItem, name: String): ASPxClientFileManagerFocusedItemChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFocusedItemChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerFocusedItemChangedEventArgsOps[Self <: ASPxClientFileManagerFocusedItemChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ASPxClientFileManagerItem): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
