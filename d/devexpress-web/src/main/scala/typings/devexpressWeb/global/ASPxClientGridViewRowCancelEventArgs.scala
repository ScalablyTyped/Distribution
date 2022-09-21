package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.RowCollapsing and ASPxClientGridView.RowExpanding events.
  */
@JSGlobal("ASPxClientGridViewRowCancelEventArgs")
@js.native
open class ASPxClientGridViewRowCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewRowCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewRowCancelEventArgs class.
    * @param visibleIndex An integer value that identifies the processed row. This value is assigned to the ASPxClientGridViewRowCancelEventArgs.visibleIndex property.
    */
  def this(visibleIndex: Double) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the processed row's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
