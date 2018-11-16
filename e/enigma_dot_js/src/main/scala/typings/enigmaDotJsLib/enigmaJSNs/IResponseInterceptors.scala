package typings
package enigmaDotJsLib.enigmaJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IResponseInterceptors extends js.Object {
  /**
           * This method is invoked when a promise has been successfully resolved, use this to modify the result or reject the promise chain before it is sent to mixins.
           * @param session refers to the session executing the interceptor.
           * @param request is the JSON-RPC request resulting in this error. You may use .retry() to retry sending it to QIX Engine.
           * @param error is whatever the previous interceptor resolved with.
           */
  var onFulfilled: js.UndefOr[
    js.Function3[/* session */ ISession, /* request */ js.Any, /* result */ js.Any, stdLib.Promise[_]]
  ] = js.undefined
  /**
           * This method is invoked when a previous interceptor has rejected the promise, use this to handle for example errors before they are sent into mixins.
           * @param session refers to the session executing the interceptor.
           * @param request is the JSON-RPC request resulting in this error. You may use .retry() to retry sending it to QIX Engine.
           * @param error is whatever the previous interceptor rejected with.
           */
  var onRejected: js.UndefOr[
    js.Function3[/* session */ ISession, /* request */ js.Any, /* error */ js.Any, stdLib.Promise[_]]
  ] = js.undefined
}

