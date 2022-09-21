package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.RowClick event.
  */
@JSGlobal("ASPxClientGridViewRowClickEventArgs")
@js.native
open class ASPxClientGridViewRowClickEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewRowClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewRowClickEventArgs class.
    * @param visibleIndex A zero-based integer index that identifies the clicked row.
    * @param htmlEvent An object that contains parameters associated with the event. This value is assigned to the ASPxClientGridViewRowClickEventArgs.htmlEvent property.
    */
  def this(visibleIndex: Double, htmlEvent: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.RowClick event.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
  
  /**
    * Gets the processed row's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
