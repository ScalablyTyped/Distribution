package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ItemsDeleted event.
  */
@JSGlobal("ASPxClientFileManagerItemsDeletedEventArgs")
@js.native
class ASPxClientFileManagerItemsDeletedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerItemsDeletedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemsDeletedEventArgs object.
    * @param items An array of ASPxClientFileManagerItem objects that are items currently being processed.
    */
  def this(items: js.Array[typings.devexpressWeb.ASPxClientFileManagerItem]) = this()
  
  /**
    * Gets an array of the currently processed items.
    */
  /* CompleteClass */
  var items: js.Array[typings.devexpressWeb.ASPxClientFileManagerItem] = js.native
}
