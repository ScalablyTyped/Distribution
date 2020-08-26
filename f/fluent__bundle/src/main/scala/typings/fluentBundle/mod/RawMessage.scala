package typings.fluentBundle.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawMessage extends js.Object {
  var attributes: Record[String, Pattern] = js.native
  var value: Pattern | Null = js.native
}

object RawMessage {
  @scala.inline
  def apply(attributes: Record[String, Pattern]): RawMessage = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawMessage]
  }
  @scala.inline
  implicit class RawMessageOps[Self <: RawMessage] (val x: Self) extends AnyVal {
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
    def setAttributes(value: Record[String, Pattern]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Pattern): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

