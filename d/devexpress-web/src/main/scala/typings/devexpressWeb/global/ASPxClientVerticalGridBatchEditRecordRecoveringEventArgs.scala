package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordRecovering event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs")
@js.native
open class ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs class.
    * @param visibleIndex An integer value specifying a record's visible index.
    * @param recordValues An object representing record values.
    */
  def this(visibleIndex: Double, recordValues: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  /* CompleteClass */
  var recordValues: Any = js.native
  
  /**
    * Gets the processed record's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
