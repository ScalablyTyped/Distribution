package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditCardRecovering event.
  */
@JSGlobal("ASPxClientCardViewBatchEditCardRecoveringEventArgs")
@js.native
class ASPxClientCardViewBatchEditCardRecoveringEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCardViewBatchEditCardRecoveringEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditCardRecoveringEventArgs class.
    * @param visibleIndex An integer value specifying a card's visible index.
    * @param cardValues An object representing card values.
    */
  def this(visibleIndex: Double, cardValues: js.Any) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  /* CompleteClass */
  var cardValues: js.Any = js.native
  
  /**
    * Gets the visible index of the card whose cells has been recovered.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
