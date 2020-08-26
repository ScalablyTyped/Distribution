package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetProduceCompilationCacheRequest extends js.Object {
  var enabled: Boolean = js.native
}

object SetProduceCompilationCacheRequest {
  @scala.inline
  def apply(enabled: Boolean): SetProduceCompilationCacheRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetProduceCompilationCacheRequest]
  }
  @scala.inline
  implicit class SetProduceCompilationCacheRequestOps[Self <: SetProduceCompilationCacheRequest] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
  
}

