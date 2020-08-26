package typings.ecmarkdown.nodeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationRange extends js.Object {
  var end: Position = js.native
  var start: Position = js.native
}

object LocationRange {
  @scala.inline
  def apply(end: Position, start: Position): LocationRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRange]
  }
  @scala.inline
  implicit class LocationRangeOps[Self <: LocationRange] (val x: Self) extends AnyVal {
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
    def setEnd(value: Position): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Position): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

