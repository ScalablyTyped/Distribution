package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancelable events of a client ASPxCardView column.
  */
@JSGlobal("ASPxClientCardViewColumnCancelEventArgs")
@js.native
open class ASPxClientCardViewColumnCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCardViewColumnCancelEventArgs {
  /**
    * Initializes a new isntance of the ASPxClientCardViewColumnCancelEventArgs class.
    * @param column An ASPxClientCardViewColumn object that represents the processed column.
    */
  def this(column: typings.devexpressWeb.ASPxClientCardViewColumn) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the processed client column.
    */
  /* CompleteClass */
  var column: typings.devexpressWeb.ASPxClientCardViewColumn = js.native
}
