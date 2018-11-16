package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SeriesErrorBar extends js.Object {
  /** Options for customizing the error bar cap.
               */
  var cap: js.UndefOr[SeriesErrorBarCap] = js.undefined
  /** Specifies the direction of error bar.
               * @Default {both}
               */
  var direction: js.UndefOr[ErrorBarDirection | java.lang.String] = js.undefined
  /** Fill color of the error bar.
               * @Default {#000000}
               */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Value of horizontal  error bar.
               * @Default {1}
               */
  var horizontalErrorValue: js.UndefOr[scala.Double] = js.undefined
  /** Value of negative horizontal error bar.
               * @Default {1}
               */
  var horizontalNegativeErrorValue: js.UndefOr[scala.Double] = js.undefined
  /** Value of positive horizontal error bar.
               * @Default {1}
               */
  var horizontalPositiveErrorValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the mode of error bar.
               * @Default {vertical}
               */
  var mode: js.UndefOr[ErrorBarMode | java.lang.String] = js.undefined
  /** Specifies the type of error bar.
               * @Default {FixedValue}
               */
  var `type`: js.UndefOr[ErrorBarType | java.lang.String] = js.undefined
  /** Value of vertical error bar.
               * @Default {3}
               */
  var verticalErrorValue: js.UndefOr[scala.Double] = js.undefined
  /** Value of negative vertical error bar.
               * @Default {5}
               */
  var verticalNegativeErrorValue: js.UndefOr[scala.Double] = js.undefined
  /** Value of positive vertical error bar.
               * @Default {5}
               */
  var verticalPositiveErrorValue: js.UndefOr[scala.Double] = js.undefined
  /** Show/hides the error bar
               * @Default {visible}
               */
  var visibility: js.UndefOr[scala.Boolean] = js.undefined
  /** Width of the error bar.
               * @Default {1}
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

