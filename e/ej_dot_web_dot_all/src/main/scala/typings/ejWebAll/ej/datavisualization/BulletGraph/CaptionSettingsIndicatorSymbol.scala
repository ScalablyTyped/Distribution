package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsIndicatorSymbol extends js.Object {
  /** Contains property to customize the border of indicator symbol.
    */
  var border: js.UndefOr[CaptionSettingsIndicatorSymbolBorder] = js.undefined
  /** Specifies the color of indicator symbol.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the URL of image that represents indicator symbol.
    */
  var imageURL: js.UndefOr[String] = js.undefined
  /** Specifies the opacity of indicator symbol.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the shape of indicator symbol.
    */
  var shape: js.UndefOr[String] = js.undefined
  /** Contains property to customize the size of indicator symbol.
    */
  var size: js.UndefOr[CaptionSettingsIndicatorSymbolSize] = js.undefined
}

object CaptionSettingsIndicatorSymbol {
  @scala.inline
  def apply(
    border: CaptionSettingsIndicatorSymbolBorder = null,
    color: String = null,
    imageURL: String = null,
    opacity: Int | Double = null,
    shape: String = null,
    size: CaptionSettingsIndicatorSymbolSize = null
  ): CaptionSettingsIndicatorSymbol = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (imageURL != null) __obj.updateDynamic("imageURL")(imageURL.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsIndicatorSymbol]
  }
}

