package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancelable events of a client ASPxGridView column.
  */
@JSGlobal("ASPxClientGridViewColumnCancelEventArgs")
@js.native
class ASPxClientGridViewColumnCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewColumnCancelEventArgs {
  /**
    * Initializes a new isntance of the ASPxClientGridViewColumnCancelEventArgs class.
    * @param column An ASPxClientGridViewColumn object that represents the processed column.
    */
  def this(column: typings.devexpressWeb.ASPxClientGridViewColumn) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the processed client column.
    */
  /* CompleteClass */
  var column: typings.devexpressWeb.ASPxClientGridViewColumn = js.native
}
