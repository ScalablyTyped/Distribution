package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancelable events of a client ASPxVerticalGrid row.
  */
@JSGlobal("ASPxClientVerticalGridRowCancelEventArgs")
@js.native
open class ASPxClientVerticalGridRowCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridRowCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridRowCancelEventArgs class.
    * @param row An ASPxClientVerticalGridRowCancelEventArgs object that represents the processed row.
    */
  def this(row: typings.devexpressWeb.ASPxClientVerticalGridRow) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the processed client row.
    */
  /* CompleteClass */
  var row: typings.devexpressWeb.ASPxClientVerticalGridRow = js.native
}
