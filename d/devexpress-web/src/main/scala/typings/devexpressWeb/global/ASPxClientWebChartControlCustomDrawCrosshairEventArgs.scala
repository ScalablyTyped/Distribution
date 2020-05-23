package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /**
    * Provides access to the settings of crosshair elements and crosshair group header elements to customize their appearance.
    */
  /* CompleteClass */
  override var crosshairElementGroups: js.Array[typings.devexpressWeb.ASPxClientCrosshairElementGroup] = js.native
  /** @deprecated This property is now obsolete. Use the crosshairElementGroup.CrosshairElements property instead. */
  /**
    * Returns crosshair elements settings to custom draw a crosshair cursor.
    */
  /* CompleteClass */
  override var crosshairElements: js.Array[typings.devexpressWeb.ASPxClientCrosshairElement] = js.native
  /** @deprecated This property is now obsolete. Use the crosshairElementGroup.HeaderElement property instead. */
  /**
    * Returns the crosshair group header elements to customize their appearance.
    */
  /* CompleteClass */
  override var crosshairGroupHeaderElements: js.Array[typings.devexpressWeb.ASPxClientCrosshairGroupHeaderElement] = js.native
  /**
    * Returns the array of indicator elements that the Crosshair Cursor displays in a legend.
    */
  /* CompleteClass */
  override var crosshairIndicatorLegendElements: js.Array[typings.devexpressWeb.ASPxClientCrosshairIndicatorLegendElement] = js.native
  /**
    * Returns the crosshair legend elements to custom draw the Crosshair.
    */
  /* CompleteClass */
  override var crosshairLegendElements: js.Array[typings.devexpressWeb.ASPxClientCrosshairLegendElement] = js.native
  /**
    * Returns the crosshair axis label elements to customize their appearance.
    */
  /* CompleteClass */
  override var cursorCrosshairAxisLabelElements: js.Array[typings.devexpressWeb.ASPxClientCrosshairAxisLabelElement] = js.native
  /**
    * Gets crosshair line element settings that are used to custom draw a crosshair cursor.
    */
  /* CompleteClass */
  override var cursorCrosshairLineElement: typings.devexpressWeb.ASPxClientCrosshairLineElement = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}

