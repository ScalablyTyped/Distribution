package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientVerticalGrid.RowExpandedChanged event.
  */
@JSGlobal("ASPxClientVerticalGridRowExpandedEventArgs")
@js.native
class ASPxClientVerticalGridRowExpandedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientVerticalGridRowExpandedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridRowExpandedEventArgs class with specified settings.
    * @param row A ASPxClientVerticalGridRow object that uniquely identifies the expanded row. This value is assigned to the ASPxClientVerticalGridRowExpandedEventArgs.row property.
    */
  def this(row: typings.devexpressWeb.ASPxClientVerticalGridRow) = this()
  
  /**
    * Gets the expanded row.
    */
  /* CompleteClass */
  var row: typings.devexpressWeb.ASPxClientVerticalGridRow = js.native
}
