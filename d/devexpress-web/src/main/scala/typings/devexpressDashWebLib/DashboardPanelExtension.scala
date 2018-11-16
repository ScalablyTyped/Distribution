package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The Dashboard Panel extension that allows users to switch between dashboards and enable the Designer mode.
 */

trait DashboardPanelExtension extends IExtension {
  /**
       * Gets or sets whether you can switch into the designer mode.
       * Value: true, to display the Edit in Designer button on the dashboard panel; otherwise, false.
       */
  var allowSwitchToDesigner: KnockoutObservableBoolean
  /**
       * Gets or sets the width of the Dashboard Panel extension.
       * Value: An integer value that specifies the Dashboard Panel's width.
       */
  var panelWidth: scala.Double
  /**
       * Gets or sets whether the Dashboard Panel is visible.
       * Value: true, to display the Dashboard Panel; otherwise, false.
       */
  var visible: KnockoutObservableBoolean
}

