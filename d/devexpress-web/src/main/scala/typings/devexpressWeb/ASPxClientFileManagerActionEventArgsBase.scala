package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for classes that are used as arguments for events generated on the client side.
  */
@js.native
trait ASPxClientFileManagerActionEventArgsBase extends ASPxClientEventArgs {
  
  /**
    * Gets the full name of the item currently being processed.
    */
  var fullName: String = js.native
  
  /**
    * Gets a value specifying whether the current processed item is a folder.
    */
  var isFolder: Boolean = js.native
  
  /**
    * Gets the name of the currently processed item.
    */
  var name: String = js.native
}
object ASPxClientFileManagerActionEventArgsBase {
  
  @scala.inline
  def apply(fullName: String, isFolder: Boolean, name: String): ASPxClientFileManagerActionEventArgsBase = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerActionEventArgsBase]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerActionEventArgsBaseOps[Self <: ASPxClientFileManagerActionEventArgsBase] (val x: Self) extends AnyVal {
    
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
    def setIsFolder(value: Boolean): Self = this.set("isFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
