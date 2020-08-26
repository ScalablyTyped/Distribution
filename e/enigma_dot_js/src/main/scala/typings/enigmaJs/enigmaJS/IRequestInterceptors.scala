package typings.enigmaJs.enigmaJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestInterceptors extends js.Object {
  /**
    * This method is invoked when a request is about to be sent to QIX Engine.
    * @param session refers to the session executing the interceptor.
    * @param request is the JSON-RPC request resulting in this error. You may use .retry() to retry sending it to QIX Engine.
    * @returns request the new request
    */
  var onFulfilled: js.UndefOr[
    js.Function3[/* session */ ISession, /* request */ js.Any, /* result */ js.Any, _]
  ] = js.native
}

object IRequestInterceptors {
  @scala.inline
  def apply(): IRequestInterceptors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequestInterceptors]
  }
  @scala.inline
  implicit class IRequestInterceptorsOps[Self <: IRequestInterceptors] (val x: Self) extends AnyVal {
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
    def setOnFulfilled(value: (/* session */ ISession, /* request */ js.Any, /* result */ js.Any) => _): Self = this.set("onFulfilled", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnFulfilled: Self = this.set("onFulfilled", js.undefined)
  }
  
}

