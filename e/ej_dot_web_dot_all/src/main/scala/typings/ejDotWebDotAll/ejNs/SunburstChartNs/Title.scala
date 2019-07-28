package typings.ejDotWebDotAll.ejNs.SunburstChartNs

import typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.SunburstAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  /** Options for customizing the font of sunburst title.
    */
  var font: js.UndefOr[TitleFont] = js.undefined
  /** Options to customize the sub title of Sunburst.
    */
  var subtitle: js.UndefOr[TitleSubtitle] = js.undefined
  /** Title text for sunburst
    */
  var text: js.UndefOr[String] = js.undefined
  /** Title text alignment
    * @Default {center. See TextAlignment}
    */
  var textAlignment: js.UndefOr[SunburstAlignment | String] = js.undefined
  /** Title text visibility for sunburst
    * @Default {true}
    */
  var visible: js.UndefOr[String] = js.undefined
}

object Title {
  @scala.inline
  def apply(
    font: TitleFont = null,
    subtitle: TitleSubtitle = null,
    text: String = null,
    textAlignment: SunburstAlignment | String = null,
    visible: String = null
  ): Title = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Title]
  }
}

