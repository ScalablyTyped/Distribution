package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for a chart control's CustomDrawCrosshair event.
 */

trait ASPxClientWebChartControlCustomDrawCrosshairEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
       * Provides access to the settings of crosshair elements and crosshair group header elements to customize their appearance.
       * Value: An ASPxClientCrosshairElementGroup object.
       */
  var crosshairElementGroups: ASPxClientCrosshairElementGroup
  /**
       * Gets crosshair elements settings  to custom draw a crosshair cursor.
       * Value: An  ASPxClientCrosshairElement object.
       */
  var crosshairElements: ASPxClientCrosshairElement
  /**
       * Gets the settings of crosshair group header elements to customize their appearance.
       * Value: An ASPxClientCrosshairGroupHeaderElement object.
       */
  var crosshairGroupHeaderElements: ASPxClientCrosshairGroupHeaderElement
  /**
       * Gets the settings of crosshair axis label elements to customize their appearance.
       * Value: An ASPxClientCrosshairAxisLabelElement object.
       */
  var cursorCrosshairAxisLabelElements: ASPxClientCrosshairAxisLabelElement
  /**
       * Gets crosshair line element settings that are used to custom draw a crosshair cursor.
       * Value: An ASPxClientCrosshairLineElement object that contains crosshair line element settings.
       */
  var cursorCrosshairLineElement: ASPxClientCrosshairLineElement
}

