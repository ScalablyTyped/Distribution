package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.SelectionChanged event.
  */
@JSGlobal("ASPxClientFileManagerSelectionChangedEventArgs")
@js.native
open class ASPxClientFileManagerSelectionChangedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerSelectionChangedEventArgs {
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
  
  /**
    * Gets the full name of the file currently being processed.
    */
  /* CompleteClass */
  var fullName: String = js.native
  
  /**
    * Gets whether the item has been selected.
    */
  /* CompleteClass */
  var isSelected: Boolean = js.native
  
  /**
    * Gets the file manager item object related to the event.
    */
  /* CompleteClass */
  var item: typings.devexpressWeb.ASPxClientFileManagerItem = js.native
  
  /**
    * Gets the name of the currently processed file.
    */
  /* CompleteClass */
  var name: String = js.native
}
