package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordDeleting event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditRecordDeletingEventArgs")
@js.native
open class ASPxClientVerticalGridBatchEditRecordDeletingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridBatchEditRecordDeletingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditRecordDeletingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed record's visible index.
    * @param recordValues A hashtable that stores information about the processed record's cells.
    */
  def this(visibleIndex: Double, recordValues: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  /* CompleteClass */
  var recordValues: Any = js.native
  
  /**
    * Gets the processed record's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
