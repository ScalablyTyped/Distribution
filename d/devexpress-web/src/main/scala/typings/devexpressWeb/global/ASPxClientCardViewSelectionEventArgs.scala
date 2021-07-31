package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.SelectionChanged event.
  */
@JSGlobal("ASPxClientCardViewSelectionEventArgs")
@js.native
class ASPxClientCardViewSelectionEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCardViewSelectionEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewSelectionEventArgs class.
    * @param visibleIndex An integer value that specifies the visible index of the card whose selected state has been changed. This value is assigned to the ASPxClientCardViewSelectionEventArgs.visibleIndex property.
    */
  def this(visibleIndex: Double) = this()
  
  /**
    * Gets whether all cards displayed within a page have been selected or unselected.
    */
  /* CompleteClass */
  var isAllRecordsOnPage: Boolean = js.native
  
  /**
    * Gets whether a selection has been changed on the server.
    */
  /* CompleteClass */
  var isChangedOnServer: Boolean = js.native
  
  /**
    * Gets whether the card has been selected.
    */
  /* CompleteClass */
  var isSelected: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
  
  /**
    * Gets the visible index of the card whose selected state has been changed.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
