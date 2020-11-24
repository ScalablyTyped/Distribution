package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTrackBar.PositionChanging event.
  */
@JSGlobal("ASPxClientTrackBarPositionChangingEventArgs")
@js.native
class ASPxClientTrackBarPositionChangingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTrackBarPositionChangingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTrackBarPositionChangingEventArgs object with the specified setting.
    * @param currentPositionStart A Decimal value specifying the current main drag handle position.
    * @param currentPositionEnd A Decimal value specifying the current secondary drag handle position.
    * @param newPositionStart A Decimal value specifying a position where the main drag handle is being moved.
    * @param newPositionEnd A Decimal value specifying a position where the secondary drag handle is being moved.
    */
  def this(
    currentPositionStart: Double,
    currentPositionEnd: Double,
    newPositionStart: Double,
    newPositionEnd: Double
  ) = this()
}
