package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanging event.
  */
@JSGlobal("ASPxClientVerticalGridRowExpandingEventArgs")
@js.native
open class ASPxClientVerticalGridRowExpandingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridRowExpandingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridRowExpandingEventArgs class with the specified row.
    * @param row An ASPxClientVerticalGridRowobject that represents the row to expand.
    */
  def this(row: typings.devexpressWeb.ASPxClientVerticalGridRow) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the expanded row.
    */
  /* CompleteClass */
  var row: typings.devexpressWeb.ASPxClientVerticalGridRow = js.native
}
