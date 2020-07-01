package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rects extends js.Object {
  var key: js.UndefOr[String] = js.native
  var rects: js.UndefOr[js.Array[Left]] = js.native
  var secondary_rects: js.UndefOr[js.Array[Left]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object Rects {
  @scala.inline
  def apply(
    key: String = null,
    rects: js.Array[Left] = null,
    secondary_rects: js.Array[Left] = null,
    `type`: String = null,
    value: String = null
  ): Rects = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (rects != null) __obj.updateDynamic("rects")(rects.asInstanceOf[js.Any])
    if (secondary_rects != null) __obj.updateDynamic("secondary_rects")(secondary_rects.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rects]
  }
}

