package typings
package atEmotionUtilsLib.atEmotionUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedStyles extends js.Object {
  var map: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var next: js.UndefOr[SerializedStyles] = js.undefined
  var styles: java.lang.String
}

object SerializedStyles {
  @scala.inline
  def apply(
    name: java.lang.String,
    styles: java.lang.String,
    map: java.lang.String = null,
    next: SerializedStyles = null
  ): SerializedStyles = {
    val __obj = js.Dynamic.literal(name = name, styles = styles)
    if (map != null) __obj.updateDynamic("map")(map)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[SerializedStyles]
  }
}

