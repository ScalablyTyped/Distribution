package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.SelectionChanged event.
  */
@JSGlobal("ASPxClientGridViewSelectionEventArgs")
@js.native
open class ASPxClientGridViewSelectionEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewSelectionEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewSelectionEventArgs class.
    * @param visibleIndex An integer value that specifies the visible index of the row whose selected state has been changed. This value is assigned to the ASPxClientGridViewSelectionEventArgs.visibleIndex property.
    */
  def this(visibleIndex: Double) = this()
  
  /**
    * Gets whether all rows displayed within a page have been selected or unselected.
    */
  /* CompleteClass */
  var isAllRecordsOnPage: Boolean = js.native
  
  /**
    * Gets whether a selection has been changed on the server.
    */
  /* CompleteClass */
  var isChangedOnServer: Boolean = js.native
  
  /**
    * Gets whether the row has been selected.
    */
  /* CompleteClass */
  var isSelected: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
  
  /**
    * Gets the visible index of the row whose selected state has been changed.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
