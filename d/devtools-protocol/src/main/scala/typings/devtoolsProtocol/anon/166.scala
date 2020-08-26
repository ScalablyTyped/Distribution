package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.DispatchPeriodicSyncEventRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `166` extends js.Object {
  var paramsType: js.Array[DispatchPeriodicSyncEventRequest] = js.native
  var returnType: Unit = js.native
}

object `166` {
  @scala.inline
  def apply(paramsType: js.Array[DispatchPeriodicSyncEventRequest], returnType: Unit): `166` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`166`]
  }
  @scala.inline
  implicit class `166Ops`[Self <: `166`] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: DispatchPeriodicSyncEventRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[DispatchPeriodicSyncEventRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: Unit): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

