package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
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

object Anon_BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    excludeComponents: js.Array[String] = null,
    pixelRatio: Int | Double = null,
    `type`: String = null
  ): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (excludeComponents != null) __obj.updateDynamic("excludeComponents")(excludeComponents)
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

