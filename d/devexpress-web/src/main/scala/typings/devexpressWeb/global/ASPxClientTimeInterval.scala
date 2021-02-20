package typings.devexpressWeb.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the TimeInterval class.
  */
@JSGlobal("ASPxClientTimeInterval")
@js.native
class ASPxClientTimeInterval protected ()
  extends typings.devexpressWeb.ASPxClientTimeInterval {
  /**
    * Initializes a new instance of the ASPxClientTimeInterval class with the specified start time and duration.
    * @param start A DateTime object, representing the beginning of the period.
    * @param duration A TimeSpan structure, representing a time interval.
    */
  def this(start: Date, duration: js.Any) = this()
}
object ASPxClientTimeInterval {
  
  /**
    * Calculates the time interval duration. An integer value specifying the interval duration in milliseconds.
    * @param start A DateTime value that specifies the start date time value.
    * @param end A DateTime value that specifies the end date time value.
    */
  /* static member */
  @JSGlobal("ASPxClientTimeInterval.CalculateDuration")
  @js.native
  def CalculateDuration(start: Date, end: Date): Double = js.native
}
