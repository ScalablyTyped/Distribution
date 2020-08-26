package typings.googleSpreadsheet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insert extends js.Object {
  var insert: Boolean = js.native
  var raw: Boolean = js.native
}

object Insert {
  @scala.inline
  def apply(insert: Boolean, raw: Boolean): Insert = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insert]
  }
  @scala.inline
  implicit class InsertOps[Self <: Insert] (val x: Self) extends AnyVal {
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
    def setInsert(value: Boolean): Self = this.set("insert", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
  
}

