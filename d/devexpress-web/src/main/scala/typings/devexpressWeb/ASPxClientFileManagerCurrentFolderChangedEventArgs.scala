package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.CurrentFolderChanged event.
  */
@js.native
trait ASPxClientFileManagerCurrentFolderChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the full name of the folder currently being processed.
    */
  var fullName: String = js.native
  
  /**
    * Gets the name of the currently processed folder.
    */
  var name: String = js.native
}
object ASPxClientFileManagerCurrentFolderChangedEventArgs {
  
  @scala.inline
  def apply(fullName: String, name: String): ASPxClientFileManagerCurrentFolderChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerCurrentFolderChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerCurrentFolderChangedEventArgsMutableBuilder[Self <: ASPxClientFileManagerCurrentFolderChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
