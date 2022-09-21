package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditRowInserting event.
  */
@JSGlobal("ASPxClientGridViewBatchEditRowInsertingEventArgs")
@js.native
open class ASPxClientGridViewBatchEditRowInsertingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewBatchEditRowInsertingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditRowInsertingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed row's visible index.
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
