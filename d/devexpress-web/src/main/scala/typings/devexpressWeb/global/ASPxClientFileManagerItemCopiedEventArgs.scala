package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ItemCopied event.
  */
@JSGlobal("ASPxClientFileManagerItemCopiedEventArgs")
@js.native
class ASPxClientFileManagerItemCopiedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerItemCopiedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemCopiedEventArgs object with the specified parameters.
    * @param fullName A string value that is the item's full name.
    * @param name A string value that specifies the item's name.
    * @param oldFolderFullName A string value that specifies the folder's full name.
    * @param isFolder true if the processed item is a folder; false if the processed item is a file.
    */
  def this(fullName: String, name: String, oldFolderFullName: String, isFolder: Boolean) = this()
}
