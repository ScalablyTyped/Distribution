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
  def apply(): Rects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rects]
  }
  @scala.inline
  implicit class RectsOps[Self <: Rects] (val x: Self) extends AnyVal {
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
    def setRectsVarargs(value: Left*): Self = this.set("rects", js.Array(value :_*))
    @scala.inline
    def setRects(value: js.Array[Left]): Self = this.set("rects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRects: Self = this.set("rects", js.undefined)
    @scala.inline
    def setSecondary_rectsVarargs(value: Left*): Self = this.set("secondary_rects", js.Array(value :_*))
    @scala.inline
    def setSecondary_rects(value: js.Array[Left]): Self = this.set("secondary_rects", value.asInstanceOf[js.Any])
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

