package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ItemRenamed event.
  */
@JSGlobal("ASPxClientFileManagerItemRenamedEventArgs")
@js.native
class ASPxClientFileManagerItemRenamedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerItemRenamedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemRenamedEventArgs object with the specified parameters.
    * @param fullName A string value that is the item's full name.
    * @param name A string value that specifies the item's name.
    * @param oldName A string value that specifies the item name.
    * @param isFolder true if the processed item is a folder; false if the processed item is a file.
    */
  def this(fullName: String, name: String, oldName: String, isFolder: Boolean) = this()
}
