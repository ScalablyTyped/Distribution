package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Title extends js.Object {
  /** Background color for the chart title.
               * @Default {transparent}
               */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /** Options to customize the border of the title.
               */
  var border: js.UndefOr[TitleBorder] = js.undefined
  /** Specifies whether to trim the Chart Title when the width of the title exceeds the maximumWidth.
               * @Default {false}
               */
  var enableTrim: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for customizing the font of Chart title.
               */
  var font: js.UndefOr[TitleFont] = js.undefined
  /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
               * @Default {auto}
               */
  var maximumWidth: js.UndefOr[java.lang.String] = js.undefined
  /** Options to customize the sub title of Chart.
               */
  var subTitle: js.UndefOr[TitleSubTitle] = js.undefined
  /** Text to be displayed in Chart title.
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Alignment of the title text.
               * @Default {Center. See TextAlignment}
               */
  var textAlignment: js.UndefOr[Alignment | java.lang.String] = js.undefined
  /** Specifies the action taken when the Chart width is more than the titleWidth.
               * @Default {trim.}
               */
  var textOverflow: js.UndefOr[TextOverflow | java.lang.String] = js.undefined
  /** Controls the visibility of the Chart title
               * @Default {true}
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

