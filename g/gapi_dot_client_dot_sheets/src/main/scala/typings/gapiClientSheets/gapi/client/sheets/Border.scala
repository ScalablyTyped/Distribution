package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  /** The color of the border. */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * The color of the border.
    * If color is also set, this field takes precedence.
    */
  var colorStyle: js.UndefOr[ColorStyle] = js.undefined
  /** The style of the border. */
  var style: js.UndefOr[String] = js.undefined
  /**
    * The width of the border, in pixels.
    * Deprecated; the width is determined by the "style" field.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Border {
  @scala.inline
  def apply(
    color: Color = null,
    colorStyle: ColorStyle = null,
    style: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Border = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorStyle != null) __obj.updateDynamic("colorStyle")(colorStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

