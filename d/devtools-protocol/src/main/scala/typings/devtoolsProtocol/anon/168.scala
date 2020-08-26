package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.SetForceUpdateOnPageLoadRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `168` extends js.Object {
  var paramsType: js.Array[SetForceUpdateOnPageLoadRequest] = js.native
  var returnType: Unit = js.native
}

object `168` {
  @scala.inline
  def apply(paramsType: js.Array[SetForceUpdateOnPageLoadRequest], returnType: Unit): `168` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`168`]
  }
  @scala.inline
  implicit class `168Ops`[Self <: `168`] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: SetForceUpdateOnPageLoadRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[SetForceUpdateOnPageLoadRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: Unit): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

