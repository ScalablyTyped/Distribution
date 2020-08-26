package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIsolatedWorldResponse extends js.Object {
  /**
    * Execution context of the isolated world.
    */
  var executionContextId: ExecutionContextId = js.native
}

object CreateIsolatedWorldResponse {
  @scala.inline
  def apply(executionContextId: ExecutionContextId): CreateIsolatedWorldResponse = {
    val __obj = js.Dynamic.literal(executionContextId = executionContextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIsolatedWorldResponse]
  }
  @scala.inline
  implicit class CreateIsolatedWorldResponseOps[Self <: CreateIsolatedWorldResponse] (val x: Self) extends AnyVal {
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
    def setExecutionContextId(value: ExecutionContextId): Self = this.set("executionContextId", value.asInstanceOf[js.Any])
  }
  
}

