package typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstChartNs

import typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleSubtitle extends js.Object {
  /** Options for customizing the font of sub title.
    */
  var font: js.UndefOr[TitleSubtitleFont] = js.undefined
  /** Subtitle text for sunburst
    */
  var text: js.UndefOr[String] = js.undefined
  /** Sub title text alignment
    * @Default {far. See TextAlignment}
    */
  var textAlignment: js.UndefOr[SunburstAlignment | String] = js.undefined
  /** Sub title text visibility for sunburst
    * @Default {true}
    */
  var visible: js.UndefOr[String] = js.undefined
}

object TitleSubtitle {
  @scala.inline
  def apply(
    font: TitleSubtitleFont = null,
    text: String = null,
    textAlignment: SunburstAlignment | String = null,
    visible: String = null
  ): TitleSubtitle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TitleSubtitle]
  }
}

