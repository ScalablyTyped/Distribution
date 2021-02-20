package typings.devexpressWeb.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateNavigator.DayCellCustomHighlight event.
  */
@JSGlobal("ASPxClientDateNavigatorDayCellCustomHighlightEventArgs")
@js.native
class ASPxClientDateNavigatorDayCellCustomHighlightEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientDateNavigatorDayCellCustomHighlightEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDateNavigatorDayCellCustomHighlightEventArgs class.
    * @param htmlElement An object representing the HTML element.
    * @param date A DateTime object that represents the highlighted date.
    * @param appointments An array of ASPxClientAppointment objects that the highlighted day cell contains.
    */
  def this(
    htmlElement: js.Any,
    date: Date,
    appointments: js.Array[typings.devexpressWeb.ASPxClientAppointment]
  ) = this()
}
