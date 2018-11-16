package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the ToolTipDisplaying event.
 */

trait MVCxClientSchedulerToolTipDisplayingEventArgs extends ASPxClientEventArgs {
  /**
       * Gets information about the tooltip related to the event.
       * Value: A ASPxClientSchedulerToolTipData object that specifies information about the tooltip.
       */
  var data: ASPxClientSchedulerToolTipData
  /**
       * Gets the tooltip related to the event.
       * Value: A MVCxClientSchedulerTemplateToolTip object that specifies the tooltip.
       */
  var toolTip: MVCxClientSchedulerTemplateToolTip
}

