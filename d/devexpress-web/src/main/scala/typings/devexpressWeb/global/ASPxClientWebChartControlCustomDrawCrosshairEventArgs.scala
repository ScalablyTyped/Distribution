package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for a chart control's ASPxClientWebChartControl.CustomDrawCrosshair event.
  */
@JSGlobal("ASPxClientWebChartControlCustomDrawCrosshairEventArgs")
@js.native
class ASPxClientWebChartControlCustomDrawCrosshairEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientWebChartControlCustomDrawCrosshairEventArgs {
  /**
    * Initializes a new object of the ASPxClientWebChartControlCustomDrawCrosshairEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param cursorCrosshairAxisLabelElements An array of ASPxClientCrosshairAxisLabelElement objects that contain the crosshair axis label elements for custom drawing a crosshair cursor.
    * @param cursorCrosshairLineElement An ASPxClientCrosshairLineElement object that contains the crosshair line element for custom drawing a crosshair cursor.
    * @param crosshairElementGroups An array of ASPxClientCrosshairElementGroup objects that contain crosshair element groups for custom drawing a crosshair cursor.
    * @param crosshairLegendElements An array of ASPxClientCrosshairLegendElement objects that contain crosshair legend elements for custom drawing a crosshair cursor.
    */
  def this(
    processOnServer: Boolean,
    cursorCrosshairAxisLabelElements: js.Array[typings.devexpressWeb.ASPxClientCrosshairAxisLabelElement],
    cursorCrosshairLineElement: typings.devexpressWeb.ASPxClientCrosshairLineElement,
    crosshairElementGroups: js.Array[typings.devexpressWeb.ASPxClientCrosshairElementGroup],
    crosshairLegendElements: js.Array[typings.devexpressWeb.ASPxClientCrosshairLegendElement]
  ) = this()
}
