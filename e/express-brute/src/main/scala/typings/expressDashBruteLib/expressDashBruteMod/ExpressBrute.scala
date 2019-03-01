package typings
package expressDashBruteLib.expressDashBruteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Middleware.
  * @class
  */
trait ExpressBrute extends js.Object {
  /**
    * @summary Generates middleware that will bounce requests with the same key and IP address that happen faster than the current wait time by calling failCallback.
    * @param {Object} options The options.
    */
  def getMiddleware(options: expressDashBruteLib.expressDashBruteMod.ExpressBruteNs.Middleware): expressLib.expressMod.eNs.RequestHandler
  /**
    * @summary Middleware that will bounce requests that happen faster than the current wait time by calling failCallback.
    * @param {Request}     request     The HTTP request.
    * @param {Response}    response    The HTTP response.
    * @param {Function}    next        The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  def prevent(
    request: expressLib.expressMod.eNs.Request,
    response: expressLib.expressMod.eNs.Response,
    next: js.Function
  ): expressLib.expressMod.eNs.RequestHandler
  /**
    * @summary Resets the wait time between requests back to its initial value.
    * @param {string}      ip      The IP address.
    * @param {string}      key     The key. response.
    * @param {Function}    next    The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  def reset(ip: java.lang.String, key: java.lang.String, next: js.Function): expressLib.expressMod.eNs.RequestHandler
}

object ExpressBrute {
  @scala.inline
  def apply(
    getMiddleware: js.Function1[
      expressDashBruteLib.expressDashBruteMod.ExpressBruteNs.Middleware, 
      expressLib.expressMod.eNs.RequestHandler
    ],
    prevent: js.Function3[
      expressLib.expressMod.eNs.Request, 
      expressLib.expressMod.eNs.Response, 
      js.Function, 
      expressLib.expressMod.eNs.RequestHandler
    ],
    reset: js.Function3[
      java.lang.String, 
      java.lang.String, 
      js.Function, 
      expressLib.expressMod.eNs.RequestHandler
    ]
  ): ExpressBrute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMiddleware")(getMiddleware)
    __obj.updateDynamic("prevent")(prevent)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[ExpressBrute]
  }
}

