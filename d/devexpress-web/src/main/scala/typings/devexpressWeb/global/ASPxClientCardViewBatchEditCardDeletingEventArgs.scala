package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditCardDeleting event.
  */
@JSGlobal("ASPxClientCardViewBatchEditCardDeletingEventArgs")
@js.native
class ASPxClientCardViewBatchEditCardDeletingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCardViewBatchEditCardDeletingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditCardDeletingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed card visible index.
    * @param cardValues A hashtable that stores information about the processed card's cells.
    */
  def this(visibleIndex: Double, cardValues: js.Any) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  /* CompleteClass */
  var cardValues: js.Any = js.native
  
  /**
    * Gets the processed card visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
