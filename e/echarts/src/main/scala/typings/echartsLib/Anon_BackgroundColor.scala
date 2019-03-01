package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  // Background color of exporting image, use backgroundColor in
  // option by default.
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  // Excluded components list. e.g. ['toolbox']
  var excludeComponents: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Resolution ratio of exporting image, 1 by default.
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  // Exporting format, can be either png, or jpeg
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    excludeComponents: js.Array[java.lang.String] = null,
    pixelRatio: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (excludeComponents != null) __obj.updateDynamic("excludeComponents")(excludeComponents)
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

