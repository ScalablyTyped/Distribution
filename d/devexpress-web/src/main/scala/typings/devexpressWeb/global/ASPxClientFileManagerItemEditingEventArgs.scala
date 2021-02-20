package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the item editing event.
  */
@JSGlobal("ASPxClientFileManagerItemEditingEventArgs")
@js.native
class ASPxClientFileManagerItemEditingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerItemEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemEditingEventArgs object with the specified parameters.
    * @param fullName A string value that is the folder's full name.
    * @param name A string value that specifies the item's name.
    * @param isFolder true if the current item is a folder; false if the current item is a file.
    */
  def this(fullName: String, name: String, isFolder: Boolean) = this()
}
