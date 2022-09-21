package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditEndEditing event.
  */
@JSGlobal("ASPxClientCardViewBatchEditEndEditingEventArgs")
@js.native
open class ASPxClientCardViewBatchEditEndEditingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCardViewBatchEditEndEditingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditEndEditingEventArgs class with specified settings.
    */
  def this(
    visibleIndex: Double,
    cardValues: Any,
    focusedColumn: typings.devexpressWeb.ASPxClientCardViewColumn
  ) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  /* CompleteClass */
  var cardValues: Any = js.native
  
  /**
    * Gets the column to which the edited cell belongs.
    */
  /* CompleteClass */
  var focusedColumn: typings.devexpressWeb.ASPxClientCardViewColumn = js.native
  
  /**
    * Gets the visible index of the card whose cells have been edited.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
