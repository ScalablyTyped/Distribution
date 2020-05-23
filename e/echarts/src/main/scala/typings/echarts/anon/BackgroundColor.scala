package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColor extends js.Object {
  // Background color of exporting image, use backgroundColor in
  // option by default.
  var backgroundColor: js.UndefOr[String] = js.undefined
  // Excluded components list. e.g. ['toolbox']
  var excludeComponents: js.UndefOr[js.Array[String]] = js.undefined
  // Resolution ratio of exporting image, 1 by default.
  var pixelRatio: js.UndefOr[Double] = js.undefined
  // Exporting format, can be either png, or jpeg
  var `type`: js.UndefOr[String] = js.undefined
}

object BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    excludeComponents: js.Array[String] = null,
    pixelRatio: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (excludeComponents != null) __obj.updateDynamic("excludeComponents")(excludeComponents.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
}

