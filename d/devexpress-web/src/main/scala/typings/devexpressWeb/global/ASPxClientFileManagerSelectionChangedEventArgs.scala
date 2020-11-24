package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.SelectionChanged event.
  */
@JSGlobal("ASPxClientFileManagerSelectionChangedEventArgs")
@js.native
class ASPxClientFileManagerSelectionChangedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerSelectionChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerSelectionChangedEventArgs class.
    * @param item A ASPxClientFileManagerItem object that is an item, manipulations on which forced the event to be raised.
    * @param name A string value that specifies the file's name.
    * @param fullName A string value that is the file's full name.
    * @param isSelected true if the file has been selected; otherwise, false.
    */
  def this(
    item: typings.devexpressWeb.ASPxClientFileManagerItem,
    name: String,
    fullName: String,
    isSelected: Boolean
  ) = this()
}
