package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleSubtitle extends js.Object {
  /** Options for customizing the font of sub title.
    */
  var font: js.UndefOr[TitleSubtitleFont] = js.undefined
  /** Subtitle text for sunburst
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Sub title text alignment
    * @Default {far. See TextAlignment}
    */
  var textAlignment: js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstAlignment | java.lang.String
  ] = js.undefined
  /** Sub title text visibility for sunburst
    * @Default {true}
    */
  var visible: js.UndefOr[java.lang.String] = js.undefined
}

object TitleSubtitle {
  @scala.inline
  def apply(
    font: TitleSubtitleFont = null,
    text: java.lang.String = null,
    textAlignment: ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstAlignment | java.lang.String = null,
    visible: java.lang.String = null
  ): TitleSubtitle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TitleSubtitle]
  }
}

