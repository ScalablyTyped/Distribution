package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordRecovering event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs class.
    * @param visibleIndex An integer value specifying a record's visible index.
    * @param recordValues An object representing record values.
    */
  def this(visibleIndex: Double, recordValues: js.Any) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  /* CompleteClass */
  var recordValues: js.Any = js.native
  
  /**
    * Gets the processed record's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
