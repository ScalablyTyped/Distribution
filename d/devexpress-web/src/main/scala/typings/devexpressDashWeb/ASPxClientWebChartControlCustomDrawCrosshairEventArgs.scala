package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a chart control's CustomDrawCrosshair event.
  */
trait ASPxClientWebChartControlCustomDrawCrosshairEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Provides access to the settings of crosshair elements and crosshair group header elements to customize their appearance.
    * Value: An array of ASPxClientCrosshairElementGroup objects.
    */
  var crosshairElementGroups: js.Array[ASPxClientCrosshairElementGroup]
  /**
    * Returns crosshair elements settings to custom draw a crosshair cursor.
    * Value: An array of ASPxClientCrosshairElement objects.
    */
  var crosshairElements: js.Array[ASPxClientCrosshairElement]
  /**
    * Returns the crosshair group header elements to customize their appearance.
    * Value: An array of ASPxClientCrosshairGroupHeaderElement objects.
    */
  var crosshairGroupHeaderElements: js.Array[ASPxClientCrosshairGroupHeaderElement]
  /**
    * Returns the crosshair legend elements to custom draw the Crosshair.
    * Value: An array of the ASPxClientCrosshairLegendElement objects.
    */
  var crosshairLegendElements: js.Array[ASPxClientCrosshairLegendElement]
  /**
    * Returns the crosshair axis label elements to customize their appearance.
    * Value: An array of ASPxClientCrosshairAxisLabelElement objects.
    */
  var cursorCrosshairAxisLabelElements: js.Array[ASPxClientCrosshairAxisLabelElement]
  /**
    * Gets crosshair line element settings that are used to custom draw a crosshair cursor.
    * Value: An ASPxClientCrosshairLineElement object that contains crosshair line element settings.
    */
  var cursorCrosshairLineElement: ASPxClientCrosshairLineElement
}

object ASPxClientWebChartControlCustomDrawCrosshairEventArgs {
  @scala.inline
  def apply(
    crosshairElementGroups: js.Array[ASPxClientCrosshairElementGroup],
    crosshairElements: js.Array[ASPxClientCrosshairElement],
    crosshairGroupHeaderElements: js.Array[ASPxClientCrosshairGroupHeaderElement],
    crosshairLegendElements: js.Array[ASPxClientCrosshairLegendElement],
    cursorCrosshairAxisLabelElements: js.Array[ASPxClientCrosshairAxisLabelElement],
    cursorCrosshairLineElement: ASPxClientCrosshairLineElement,
    processOnServer: Boolean
  ): ASPxClientWebChartControlCustomDrawCrosshairEventArgs = {
    val __obj = js.Dynamic.literal(crosshairElementGroups = crosshairElementGroups, crosshairElements = crosshairElements, crosshairGroupHeaderElements = crosshairGroupHeaderElements, crosshairLegendElements = crosshairLegendElements, cursorCrosshairAxisLabelElements = cursorCrosshairAxisLabelElements, cursorCrosshairLineElement = cursorCrosshairLineElement, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientWebChartControlCustomDrawCrosshairEventArgs]
  }
}

