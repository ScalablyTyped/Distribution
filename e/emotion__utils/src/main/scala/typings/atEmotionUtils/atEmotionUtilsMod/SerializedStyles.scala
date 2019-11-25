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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedStyles]
  }
}

