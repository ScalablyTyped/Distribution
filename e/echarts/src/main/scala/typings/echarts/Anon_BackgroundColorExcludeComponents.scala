package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorExcludeComponents extends js.Object {
  // Background color of exporting image, use backgroundColor in
  // option by default.
  var backgroundColor: String
  // Excluded components list. e.g. ['toolbox']
  var excludeComponents: js.UndefOr[js.Array[String]] = js.undefined
  // Resolution ratio of exporting image, 1 by default.
  var pixelRatio: Double
  // Exporting format, can be either png, or jpeg
  var `type`: String
}

object Anon_BackgroundColorExcludeComponents {
  @scala.inline
  def apply(
    backgroundColor: String,
    pixelRatio: Double,
    `type`: String,
    excludeComponents: js.Array[String] = null
  ): Anon_BackgroundColorExcludeComponents = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (excludeComponents != null) __obj.updateDynamic("excludeComponents")(excludeComponents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColorExcludeComponents]
  }
}

