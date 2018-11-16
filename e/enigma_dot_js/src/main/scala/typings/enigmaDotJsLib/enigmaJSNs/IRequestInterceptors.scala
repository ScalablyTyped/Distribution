package typings
package enigmaDotJsLib.enigmaJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRequestInterceptors extends js.Object {
  /**
           * This method is invoked when a request is about to be sent to QIX Engine.
           * @param session refers to the session executing the interceptor.
           * @param request is the JSON-RPC request resulting in this error. You may use .retry() to retry sending it to QIX Engine.
           * @returns request the new request
           */
  var onFulfilled: js.UndefOr[
    js.Function3[/* session */ ISession, /* request */ js.Any, /* result */ js.Any, _]
  ] = js.undefined
}

