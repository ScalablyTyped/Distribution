package typings.fastDiff.mod

import typings.fastDiff.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CursorInfo extends js.Object {
  var newRange: Index = js.native
  var oldRange: Index = js.native
}

object CursorInfo {
  @scala.inline
  def apply(newRange: Index, oldRange: Index): CursorInfo = {
    val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorInfo]
  }
  @scala.inline
  implicit class CursorInfoOps[Self <: CursorInfo] (val x: Self) extends AnyVal {
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
    def setNewRange(value: Index): Self = this.set("newRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldRange(value: Index): Self = this.set("oldRange", value.asInstanceOf[js.Any])
  }
  
}

