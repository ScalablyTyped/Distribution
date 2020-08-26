package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDataSizeLimitsForTestRequest extends js.Object {
  /**
    * Maximum per-resource size.
    */
  var maxResourceSize: integer = js.native
  /**
    * Maximum total buffer size.
    */
  var maxTotalSize: integer = js.native
}

object SetDataSizeLimitsForTestRequest {
  @scala.inline
  def apply(maxResourceSize: integer, maxTotalSize: integer): SetDataSizeLimitsForTestRequest = {
    val __obj = js.Dynamic.literal(maxResourceSize = maxResourceSize.asInstanceOf[js.Any], maxTotalSize = maxTotalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDataSizeLimitsForTestRequest]
  }
  @scala.inline
  implicit class SetDataSizeLimitsForTestRequestOps[Self <: SetDataSizeLimitsForTestRequest] (val x: Self) extends AnyVal {
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
    def setMaxResourceSize(value: integer): Self = this.set("maxResourceSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTotalSize(value: integer): Self = this.set("maxTotalSize", value.asInstanceOf[js.Any])
  }
  
}

