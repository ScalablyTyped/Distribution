package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesStripLine extends js.Object {
  /** Border color of the strip line.
    * @Default {gray}
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Background color of the strip line.
    * @Default {gray}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** End value of the strip line.
    * @Default {null}
    */
  var end: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the font of the text.
    */
  var font: js.UndefOr[AxesStripLineFont] = js.undefined
  /** Start value of the strip line.
    * @Default {null}
    */
  var start: js.UndefOr[scala.Double] = js.undefined
  /** Indicates whether to render the strip line from the minimum/start value of the axis. This property does not work when start property is set.
    * @Default {false}
    */
  var startFromAxis: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies text to be displayed inside the strip line.
    * @Default {stripLine}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the alignment of the text inside the strip line.
    * @Default {middlecenter. See TextAlignment}
    */
  var textAlignment: js.UndefOr[TextAlignment | java.lang.String] = js.undefined
  /** Show/hides the strip line.
    * @Default {false}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Width of the strip line.
    * @Default {0}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the order where the strip line and the series have to be rendered. When Z-order is â€œbehindâ€, strip line is rendered under the series and when it is â€œoverâ€, it is
    * rendered above the series.
    * @Default {over. See ZIndex}
    */
  var zIndex: js.UndefOr[ZIndex | java.lang.String] = js.undefined
}

