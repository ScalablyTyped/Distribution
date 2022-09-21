package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditCardInserting event.
  */
@JSGlobal("ASPxClientCardViewBatchEditCardInsertingEventArgs")
@js.native
open class ASPxClientCardViewBatchEditCardInsertingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCardViewBatchEditCardInsertingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditCardInsertingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed card visible index.
    */
  def this(visibleIndex: Double) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the processed card visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
