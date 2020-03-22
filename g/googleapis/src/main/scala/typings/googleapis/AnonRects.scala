package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRects extends js.Object {
  var key: js.UndefOr[String] = js.native
  var rects: js.UndefOr[js.Array[AnonLeft]] = js.native
  var secondary_rects: js.UndefOr[js.Array[AnonLeft]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object AnonRects {
  @scala.inline
  def apply(
    key: String = null,
    rects: js.Array[AnonLeft] = null,
    secondary_rects: js.Array[AnonLeft] = null,
    `type`: String = null,
    value: String = null
  ): AnonRects = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (rects != null) __obj.updateDynamic("rects")(rects.asInstanceOf[js.Any])
    if (secondary_rects != null) __obj.updateDynamic("secondary_rects")(secondary_rects.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRects]
  }
}

