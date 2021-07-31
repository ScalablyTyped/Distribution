package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordDeleting event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditRecordDeletingEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditRecordDeletingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridBatchEditRecordDeletingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditRecordDeletingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed record's visible index.
    * @param recordValues A hashtable that stores information about the processed record's cells.
    */
  def this(visibleIndex: Double, recordValues: js.Any) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  /* CompleteClass */
  var recordValues: js.Any = js.native
  
  /**
    * Gets the processed record's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
