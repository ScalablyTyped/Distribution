package typings.gapiClientPagespeedonline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  /** The placeholder key for this arg, as a string. */
  var key: js.UndefOr[String] = js.native
  /**
    * The screen rectangles being referred to, with dimensions measured in CSS pixels. This is only ever used for SNAPSHOT_RECT arguments. If this is absent
    * for a SNAPSHOT_RECT argument, it means that that argument refers to the entire snapshot.
    */
  var rects: js.UndefOr[js.Array[Height]] = js.native
  /** Secondary screen rectangles being referred to, with dimensions measured in CSS pixels. This is only ever used for SNAPSHOT_RECT arguments. */
  var secondary_rects: js.UndefOr[js.Array[Height]] = js.native
  /** Type of argument. One of URL, STRING_LITERAL, INT_LITERAL, BYTES, DURATION, VERBATIM_STRING, PERCENTAGE, HYPERLINK, or SNAPSHOT_RECT. */
  var `type`: js.UndefOr[String] = js.native
  /** Argument value, as a localized string. */
  var value: js.UndefOr[String] = js.native
}

object Key {
  @scala.inline
  def apply(): Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setRectsVarargs(value: Height*): Self = this.set("rects", js.Array(value :_*))
    @scala.inline
    def setRects(value: js.Array[Height]): Self = this.set("rects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRects: Self = this.set("rects", js.undefined)
    @scala.inline
    def setSecondary_rectsVarargs(value: Height*): Self = this.set("secondary_rects", js.Array(value :_*))
    @scala.inline
    def setSecondary_rects(value: js.Array[Height]): Self = this.set("secondary_rects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary_rects: Self = this.set("secondary_rects", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

