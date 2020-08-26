package typings.devtoolsProtocol.mod.Protocol.Target

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTargetsResponse extends js.Object {
  /**
    * The list of targets.
    */
  var targetInfos: js.Array[TargetInfo] = js.native
}

object GetTargetsResponse {
  @scala.inline
  def apply(targetInfos: js.Array[TargetInfo]): GetTargetsResponse = {
    val __obj = js.Dynamic.literal(targetInfos = targetInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetsResponse]
  }
  @scala.inline
  implicit class GetTargetsResponseOps[Self <: GetTargetsResponse] (val x: Self) extends AnyVal {
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
    def setTargetInfosVarargs(value: TargetInfo*): Self = this.set("targetInfos", js.Array(value :_*))
    @scala.inline
    def setTargetInfos(value: js.Array[TargetInfo]): Self = this.set("targetInfos", value.asInstanceOf[js.Any])
  }
  
}

