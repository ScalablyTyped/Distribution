package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisTitle extends js.Object {
  /** Specifies the position of the axis title.
    * @Default {center. See Alignment}
    */
  var alignment: js.UndefOr[TextAlignment | java.lang.String] = js.undefined
  /** Specifies whether to trim the axis title when it exceeds the chart area or the maximum width of the title.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for customizing the title font.
    */
  var font: js.UndefOr[PrimaryXAxisTitleFont] = js.undefined
  /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
    * @Default {34}
    */
  var maximumTitleWidth: js.UndefOr[scala.Double] = js.undefined
  /** offset value for axis title.
    * @Default {0}
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the position of the axis title.
    * @Default {outside. See Position}
    */
  var position: js.UndefOr[LabelPosition | java.lang.String] = js.undefined
  /** Title for the axis.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Controls the visibility of axis title.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

