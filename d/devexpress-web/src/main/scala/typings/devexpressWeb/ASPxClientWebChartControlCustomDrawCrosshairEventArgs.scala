package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a chart control's ASPxClientWebChartControl.CustomDrawCrosshair event.
  */
@JSGlobal("ASPxClientWebChartControlCustomDrawCrosshairEventArgs")
@js.native
class ASPxClientWebChartControlCustomDrawCrosshairEventArgs protected () extends ASPxClientProcessingModeEventArgs {
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
    cursorCrosshairAxisLabelElements: js.Array[ASPxClientCrosshairAxisLabelElement],
    cursorCrosshairLineElement: ASPxClientCrosshairLineElement,
    crosshairElementGroups: js.Array[ASPxClientCrosshairElementGroup],
    crosshairLegendElements: js.Array[ASPxClientCrosshairLegendElement]
  ) = this()
  /**
    * Provides access to the settings of crosshair elements and crosshair group header elements to customize their appearance.
    */
  var crosshairElementGroups: js.Array[ASPxClientCrosshairElementGroup] = js.native
  /** @deprecated This property is now obsolete. Use the crosshairElementGroup.CrosshairElements property instead. */
  /**
    * Returns crosshair elements settings to custom draw a crosshair cursor.
    */
  var crosshairElements: js.Array[ASPxClientCrosshairElement] = js.native
  /** @deprecated This property is now obsolete. Use the crosshairElementGroup.HeaderElement property instead. */
  /**
    * Returns the crosshair group header elements to customize their appearance.
    */
  var crosshairGroupHeaderElements: js.Array[ASPxClientCrosshairGroupHeaderElement] = js.native
  /**
    * Returns the array of indicator elements that the Crosshair Cursor displays in a legend.
    */
  var crosshairIndicatorLegendElements: js.Array[ASPxClientCrosshairIndicatorLegendElement] = js.native
  /**
    * Returns the crosshair legend elements to custom draw the Crosshair.
    */
  var crosshairLegendElements: js.Array[ASPxClientCrosshairLegendElement] = js.native
  /**
    * Returns the crosshair axis label elements to customize their appearance.
    */
  var cursorCrosshairAxisLabelElements: js.Array[ASPxClientCrosshairAxisLabelElement] = js.native
  /**
    * Gets crosshair line element settings that are used to custom draw a crosshair cursor.
    */
  var cursorCrosshairLineElement: ASPxClientCrosshairLineElement = js.native
}

