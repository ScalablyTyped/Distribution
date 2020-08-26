package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRequestInterceptionRequest extends js.Object {
  /**
    * Requests matching any of these patterns will be forwarded and wait for the corresponding
    * continueInterceptedRequest call.
    */
  var patterns: js.Array[RequestPattern] = js.native
}

object SetRequestInterceptionRequest {
  @scala.inline
  def apply(patterns: js.Array[RequestPattern]): SetRequestInterceptionRequest = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRequestInterceptionRequest]
  }
  @scala.inline
  implicit class SetRequestInterceptionRequestOps[Self <: SetRequestInterceptionRequest] (val x: Self) extends AnyVal {
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
    def setPatternsVarargs(value: RequestPattern*): Self = this.set("patterns", js.Array(value :_*))
    @scala.inline
    def setPatterns(value: js.Array[RequestPattern]): Self = this.set("patterns", value.asInstanceOf[js.Any])
  }
  
}

