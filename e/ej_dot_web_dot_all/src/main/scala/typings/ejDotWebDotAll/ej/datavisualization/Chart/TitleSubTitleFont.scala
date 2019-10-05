package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleSubTitleFont extends js.Object {
  /** Font family of sub title.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Font style for sub title.
    * @Default {Normal. See FontStyle}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Font weight for sub title.
    * @Default {Regular. See FontWeight}
    */
  var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
  /** Opacity of the sub title.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Font size for sub title.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object TitleSubTitleFont {
  @scala.inline
  def apply(
    fontFamily: String = null,
    fontStyle: FontStyle | String = null,
    fontWeight: FontWeight | String = null,
    opacity: Int | Double = null,
    size: String = null
  ): TitleSubTitleFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[TitleSubTitleFont]
  }
}

