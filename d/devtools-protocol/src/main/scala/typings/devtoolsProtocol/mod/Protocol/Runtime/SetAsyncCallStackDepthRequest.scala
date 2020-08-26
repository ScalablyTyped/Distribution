package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetAsyncCallStackDepthRequest extends js.Object {
  /**
    * Maximum depth of async call stacks. Setting to `0` will effectively disable collecting async
    * call stacks (default).
    */
  var maxDepth: integer = js.native
}

object SetAsyncCallStackDepthRequest {
  @scala.inline
  def apply(maxDepth: integer): SetAsyncCallStackDepthRequest = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAsyncCallStackDepthRequest]
  }
  @scala.inline
  implicit class SetAsyncCallStackDepthRequestOps[Self <: SetAsyncCallStackDepthRequest] (val x: Self) extends AnyVal {
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
    def setMaxDepth(value: integer): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
  }
  
}

