package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordInserting event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditRecordInsertingEventArgs")
@js.native
open class ASPxClientVerticalGridBatchEditRecordInsertingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridBatchEditRecordInsertingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditRecordInsertingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed record's visible index.
    */
  def this(visibleIndex: Double) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the processed record's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
