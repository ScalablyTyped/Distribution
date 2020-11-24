package typings.enigmaJs.enigmaJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResponseInterceptors extends js.Object {
  
  /**
    * This method is invoked when a promise has been successfully resolved, use this to modify the result or reject the promise chain before it is sent to mixins.
    * @param session refers to the session executing the interceptor.
    * @param request is the JSON-RPC request resulting in this error. You may use .retry() to retry sending it to QIX Engine.
    * @param error is whatever the previous interceptor resolved with.
    */
  var onFulfilled: js.UndefOr[
    js.Function3[/* session */ ISession, /* request */ js.Any, /* result */ js.Any, js.Promise[_]]
  ] = js.native
  
  /**
    * This method is invoked when a previous interceptor has rejected the promise, use this to handle for example errors before they are sent into mixins.
    * @param session refers to the session executing the interceptor.
    * @param request is the JSON-RPC request resulting in this error. You may use .retry() to retry sending it to QIX Engine.
    * @param error is whatever the previous interceptor rejected with.
    */
  var onRejected: js.UndefOr[
    js.Function3[/* session */ ISession, /* request */ js.Any, /* error */ js.Any, js.Promise[_]]
  ] = js.native
}
object IResponseInterceptors {
  
  @scala.inline
  def apply(): IResponseInterceptors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResponseInterceptors]
  }
  
  @scala.inline
  implicit class IResponseInterceptorsOps[Self <: IResponseInterceptors] (val x: Self) extends AnyVal {
    
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
    def setOnFulfilled(value: (/* session */ ISession, /* request */ js.Any, /* result */ js.Any) => js.Promise[_]): Self = this.set("onFulfilled", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnFulfilled: Self = this.set("onFulfilled", js.undefined)
    
    @scala.inline
    def setOnRejected(value: (/* session */ ISession, /* request */ js.Any, /* error */ js.Any) => js.Promise[_]): Self = this.set("onRejected", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRejected: Self = this.set("onRejected", js.undefined)
  }
}
