package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_KeyRects extends js.Object {
  var key: js.UndefOr[String] = js.native
  var rects: js.UndefOr[js.Array[Anon_HeightLeft]] = js.native
  var secondary_rects: js.UndefOr[js.Array[Anon_HeightLeft]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object Anon_KeyRects {
  @scala.inline
  def apply(
    key: String = null,
    rects: js.Array[Anon_HeightLeft] = null,
    secondary_rects: js.Array[Anon_HeightLeft] = null,
    `type`: String = null,
    value: String = null
  ): Anon_KeyRects = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (rects != null) __obj.updateDynamic("rects")(rects.asInstanceOf[js.Any])
    if (secondary_rects != null) __obj.updateDynamic("secondary_rects")(secondary_rects.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyRects]
  }
}

