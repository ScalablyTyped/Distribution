package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.RecordClick event.
  */
@JSGlobal("ASPxClientVerticalGridRecordClickEventArgs")
@js.native
open class ASPxClientVerticalGridRecordClickEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridRecordClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridRecordClickEventArgs class.
    * @param visibleIndex A zero-based integer index that identifies the clicked record.
    * @param htmlEvent An object that contains parameters associated with the event. This value is assigned to the ASPxClientVerticalGridRecordClickEventArgs.htmlEvent property.
    */
  def this(visibleIndex: Double, htmlEvent: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides access to the parameters associated with the ASPxClientVerticalGrid.RecordClick event.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
  
  /**
    * Gets the processed record's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
