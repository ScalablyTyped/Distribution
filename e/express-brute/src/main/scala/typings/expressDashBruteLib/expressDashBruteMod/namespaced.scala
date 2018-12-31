package typings
package expressDashBruteLib.expressDashBruteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Middleware.
  * @class
  */
@JSImport("express-brute", JSImport.Namespace)
@js.native
class namespaced protected () extends ExpressBrute {
  /**
    * @summary Constructor.
    * @constructor
    * @param {any} store The store.
    */
  def this(store: js.Any) = this()
  def this(store: js.Any, options: expressDashBruteLib.expressDashBruteMod.ExpressBruteNs.Options) = this()
  /**
    * @summary Generates middleware that will bounce requests with the same key and IP address that happen faster than the current wait time by calling failCallback.
    * @param {Object} options The options.
    */
  /* CompleteClass */
  override def getMiddleware(options: expressDashBruteLib.expressDashBruteMod.ExpressBruteNs.Middleware): expressLib.expressMod.eNs.RequestHandler = js.native
  /**
    * @summary Middleware that will bounce requests that happen faster than the current wait time by calling failCallback.
    * @param {Request}     request     The HTTP request.
    * @param {Response}    response    The HTTP response.
    * @param {Function}    next        The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  /* CompleteClass */
  override def prevent(
    request: expressLib.expressMod.eNs.Request,
    response: expressLib.expressMod.eNs.Response,
    next: js.Function
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  /**
    * @summary Resets the wait time between requests back to its initial value.
    * @param {string}      ip      The IP address.
    * @param {string}      key     The key. response.
    * @param {Function}    next    The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  /* CompleteClass */
  override def reset(ip: java.lang.String, key: java.lang.String, next: js.Function): expressLib.expressMod.eNs.RequestHandler = js.native
}

