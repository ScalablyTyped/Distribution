package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventParameter extends DataItem {
  var indexed: Boolean = js.native
}

object EventParameter {
  @scala.inline
  def apply(indexed: Boolean, name: String, `type`: String): EventParameter = {
    val __obj = js.Dynamic.literal(indexed = indexed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParameter]
  }
  @scala.inline
  implicit class EventParameterOps[Self <: EventParameter] (val x: Self) extends AnyVal {
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
    def setIndexed(value: Boolean): Self = this.set("indexed", value.asInstanceOf[js.Any])
  }
  
}

