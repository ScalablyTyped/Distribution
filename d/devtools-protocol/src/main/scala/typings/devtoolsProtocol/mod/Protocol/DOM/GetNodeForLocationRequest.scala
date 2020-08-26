package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNodeForLocationRequest extends js.Object {
  /**
    * Whether to ignore pointer-events: none on elements and hit test them.
    */
  var ignorePointerEventsNone: js.UndefOr[Boolean] = js.native
  /**
    * False to skip to the nearest non-UA shadow root ancestor (default: false).
    */
  var includeUserAgentShadowDOM: js.UndefOr[Boolean] = js.native
  /**
    * X coordinate.
    */
  var x: integer = js.native
  /**
    * Y coordinate.
    */
  var y: integer = js.native
}

object GetNodeForLocationRequest {
  @scala.inline
  def apply(x: integer, y: integer): GetNodeForLocationRequest = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNodeForLocationRequest]
  }
  @scala.inline
  implicit class GetNodeForLocationRequestOps[Self <: GetNodeForLocationRequest] (val x: Self) extends AnyVal {
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
    def setX(value: integer): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: integer): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnorePointerEventsNone(value: Boolean): Self = this.set("ignorePointerEventsNone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePointerEventsNone: Self = this.set("ignorePointerEventsNone", js.undefined)
    @scala.inline
    def setIncludeUserAgentShadowDOM(value: Boolean): Self = this.set("includeUserAgentShadowDOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeUserAgentShadowDOM: Self = this.set("includeUserAgentShadowDOM", js.undefined)
  }
  
}

