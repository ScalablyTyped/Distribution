package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxis extends js.Object {
  var allowContainerBoundaryTextCufoff: js.UndefOr[scala.Boolean] = js.undefined
  var baseline: js.UndefOr[scala.Double] = js.undefined
   // This option is only supported for a continuous axis. https://developers.google.com/chart/interactive/docs/customizing_axes#Terminology
  var baselineColor: js.UndefOr[java.lang.String] = js.undefined
   // google's documentation on this is wrong, specifies it as a number. The color of the baseline for the horizontal axis. Can be any HTML color string, for example: 'red' or '#00cc00'
  var direction: js.UndefOr[scala.Double] = js.undefined
   // The direction in which the values along the horizontal axis grow. Specify -1 to reverse the order of the values.
  var format: js.UndefOr[java.lang.String] = js.undefined
   // icu pattern set http://icu-project.org/apiref/icu4c/classDecimalFormat.html#_details
  var gridlines: js.UndefOr[ChartGridlines] = js.undefined
  var logScale: js.UndefOr[scala.Boolean] = js.undefined
  var maxAlternation: js.UndefOr[scala.Double] = js.undefined
  var maxTextLines: js.UndefOr[scala.Double] = js.undefined
  var maxValue: js.UndefOr[scala.Double | stdLib.Date | js.Array[scala.Double]] = js.undefined
  var minTextSpacing: js.UndefOr[scala.Double] = js.undefined
  var minValue: js.UndefOr[scala.Double | stdLib.Date | js.Array[scala.Double]] = js.undefined
  var minorGridlines: js.UndefOr[ChartGridlines] = js.undefined
  var showTextEvery: js.UndefOr[scala.Double] = js.undefined
  var slantedText: js.UndefOr[scala.Boolean] = js.undefined
  var slantedTextAngle: js.UndefOr[scala.Double] = js.undefined
  var textPosition: js.UndefOr[java.lang.String] = js.undefined
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var viewWindow: js.UndefOr[ChartViewWindow] = js.undefined
  var viewWindowMode: js.UndefOr[java.lang.String] = js.undefined
}

