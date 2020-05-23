package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a chart control's ASPxClientWebChartControl.CustomDrawCrosshair event.
  */
trait ASPxClientWebChartControlCustomDrawCrosshairEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Provides access to the settings of crosshair elements and crosshair group header elements to customize their appearance.
    */
  var crosshairElementGroups: js.Array[ASPxClientCrosshairElementGroup]
  /** @deprecated This property is now obsolete. Use the crosshairElementGroup.CrosshairElements property instead. */
  /**
    * Returns crosshair elements settings to custom draw a crosshair cursor.
    */
  var crosshairElements: js.Array[ASPxClientCrosshairElement]
  /** @deprecated This property is now obsolete. Use the crosshairElementGroup.HeaderElement property instead. */
  /**
    * Returns the crosshair group header elements to customize their appearance.
    */
  var crosshairGroupHeaderElements: js.Array[ASPxClientCrosshairGroupHeaderElement]
  /**
    * Returns the array of indicator elements that the Crosshair Cursor displays in a legend.
    */
  var crosshairIndicatorLegendElements: js.Array[ASPxClientCrosshairIndicatorLegendElement]
  /**
    * Returns the crosshair legend elements to custom draw the Crosshair.
    */
  var crosshairLegendElements: js.Array[ASPxClientCrosshairLegendElement]
  /**
    * Returns the crosshair axis label elements to customize their appearance.
    */
  var cursorCrosshairAxisLabelElements: js.Array[ASPxClientCrosshairAxisLabelElement]
  /**
    * Gets crosshair line element settings that are used to custom draw a crosshair cursor.
    */
  var cursorCrosshairLineElement: ASPxClientCrosshairLineElement
}

object ASPxClientWebChartControlCustomDrawCrosshairEventArgs {
  @scala.inline
  def apply(
    crosshairElementGroups: js.Array[ASPxClientCrosshairElementGroup],
    crosshairElements: js.Array[ASPxClientCrosshairElement],
    crosshairGroupHeaderElements: js.Array[ASPxClientCrosshairGroupHeaderElement],
    crosshairIndicatorLegendElements: js.Array[ASPxClientCrosshairIndicatorLegendElement],
    crosshairLegendElements: js.Array[ASPxClientCrosshairLegendElement],
    cursorCrosshairAxisLabelElements: js.Array[ASPxClientCrosshairAxisLabelElement],
    cursorCrosshairLineElement: ASPxClientCrosshairLineElement,
    processOnServer: Boolean
  ): ASPxClientWebChartControlCustomDrawCrosshairEventArgs = {
    val __obj = js.Dynamic.literal(crosshairElementGroups = crosshairElementGroups.asInstanceOf[js.Any], crosshairElements = crosshairElements.asInstanceOf[js.Any], crosshairGroupHeaderElements = crosshairGroupHeaderElements.asInstanceOf[js.Any], crosshairIndicatorLegendElements = crosshairIndicatorLegendElements.asInstanceOf[js.Any], crosshairLegendElements = crosshairLegendElements.asInstanceOf[js.Any], cursorCrosshairAxisLabelElements = cursorCrosshairAxisLabelElements.asInstanceOf[js.Any], cursorCrosshairLineElement = cursorCrosshairLineElement.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartControlCustomDrawCrosshairEventArgs]
  }
}

