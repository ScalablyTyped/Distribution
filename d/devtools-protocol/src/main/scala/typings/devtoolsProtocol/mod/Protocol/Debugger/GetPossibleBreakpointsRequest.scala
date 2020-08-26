package typings.devtoolsProtocol.mod.Protocol.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPossibleBreakpointsRequest extends js.Object {
  /**
    * End of range to search possible breakpoint locations in (excluding). When not specified, end
    * of scripts is used as end of range.
    */
  var end: js.UndefOr[Location] = js.native
  /**
    * Only consider locations which are in the same (non-nested) function as start.
    */
  var restrictToFunction: js.UndefOr[Boolean] = js.native
  /**
    * Start of range to search possible breakpoint locations in.
    */
  var start: Location = js.native
}

object GetPossibleBreakpointsRequest {
  @scala.inline
  def apply(start: Location): GetPossibleBreakpointsRequest = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPossibleBreakpointsRequest]
  }
  @scala.inline
  implicit class GetPossibleBreakpointsRequestOps[Self <: GetPossibleBreakpointsRequest] (val x: Self) extends AnyVal {
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
    def setStart(value: Location): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Location): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setRestrictToFunction(value: Boolean): Self = this.set("restrictToFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictToFunction: Self = this.set("restrictToFunction", js.undefined)
  }
  
}

