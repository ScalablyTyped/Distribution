package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleSubTitleBorder extends js.Object {
  /** color of the subtitle border.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.undefined
  /** opacity of the subtitle border.
    * @Default {0.8}
    */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  /** opacity of the subtitle border.
    * @Default {0.8}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Width of the subtitle border.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object TitleSubTitleBorder {
  @scala.inline
  def apply(
    color: String = null,
    cornerRadius: Int | Double = null,
    opacity: Int | Double = null,
    width: Int | Double = null
  ): TitleSubTitleBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleSubTitleBorder]
  }
}

