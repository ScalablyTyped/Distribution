package typings.atEmotionUtils.atEmotionUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedStyles extends js.Object {
  var map: js.UndefOr[String] = js.undefined
  var name: String
  var next: js.UndefOr[SerializedStyles] = js.undefined
  var styles: String
}

object SerializedStyles {
  @scala.inline
  def apply(name: String, styles: String, map: String = null, next: SerializedStyles = null): SerializedStyles = {
    val __obj = js.Dynamic.literal(name = name, styles = styles)
    if (map != null) __obj.updateDynamic("map")(map)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[SerializedStyles]
  }
}

