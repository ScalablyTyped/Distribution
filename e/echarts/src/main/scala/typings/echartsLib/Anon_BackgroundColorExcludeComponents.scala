package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorExcludeComponents extends js.Object {
  // Background color of exporting image, use backgroundColor in
  // option by default.
  var backgroundColor: java.lang.String
  // Excluded components list. e.g. ['toolbox']
  var excludeComponents: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Resolution ratio of exporting image, 1 by default.
  var pixelRatio: scala.Double
  // Exporting format, can be either png, or jpeg
  var `type`: java.lang.String
}

object Anon_BackgroundColorExcludeComponents {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    pixelRatio: scala.Double,
    `type`: java.lang.String,
    excludeComponents: js.Array[java.lang.String] = null
  ): Anon_BackgroundColorExcludeComponents = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("pixelRatio")(pixelRatio)
    if (excludeComponents != null) __obj.updateDynamic("excludeComponents")(excludeComponents)
    __obj.asInstanceOf[Anon_BackgroundColorExcludeComponents]
  }
}

