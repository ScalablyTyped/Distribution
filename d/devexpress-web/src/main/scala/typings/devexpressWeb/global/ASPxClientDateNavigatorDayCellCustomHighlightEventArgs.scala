package typings.devexpressWeb.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDateNavigator.DayCellCustomHighlight event.
  */
@JSGlobal("ASPxClientDateNavigatorDayCellCustomHighlightEventArgs")
@js.native
class ASPxClientDateNavigatorDayCellCustomHighlightEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDateNavigatorDayCellCustomHighlightEventArgs {
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
  
  /**
    * Provides access to the processed appointments.
    */
  /* CompleteClass */
  var appointments: js.Array[typings.devexpressWeb.ASPxClientAppointment] = js.native
  
  /**
    * Provides access to the date object of the processed cell.
    */
  /* CompleteClass */
  var date: Date = js.native
  
  /**
    * Gets the HTML element that the event was triggered on.
    */
  /* CompleteClass */
  var htmlElement: js.Any = js.native
}
