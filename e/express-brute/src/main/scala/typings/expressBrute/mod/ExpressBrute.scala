package typings.expressBrute.mod

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
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
  def getMiddleware(options: Middleware): RequestHandler[ParamsDictionary, _, _, Query]
  /**
    * @summary Middleware that will bounce requests that happen faster than the current wait time by calling failCallback.
    * @param {Request}     request     The HTTP request.
    * @param {Response}    response    The HTTP response.
    * @param {Function}    next        The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  def prevent(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_], next: js.Function): RequestHandler[ParamsDictionary, _, _, Query]
  /**
    * @summary Resets the wait time between requests back to its initial value.
    * @param {string}      ip      The IP address.
    * @param {string}      key     The key. response.
    * @param {Function}    next    The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  def reset(ip: String, key: String, next: js.Function): RequestHandler[ParamsDictionary, _, _, Query]
}

object ExpressBrute {
  @scala.inline
  def apply(
    getMiddleware: Middleware => RequestHandler[ParamsDictionary, _, _, Query],
    prevent: (Request_[ParamsDictionary, _, _, Query], Response_[_], js.Function) => RequestHandler[ParamsDictionary, _, _, Query],
    reset: (String, String, js.Function) => RequestHandler[ParamsDictionary, _, _, Query]
  ): ExpressBrute = {
    val __obj = js.Dynamic.literal(getMiddleware = js.Any.fromFunction1(getMiddleware), prevent = js.Any.fromFunction3(prevent), reset = js.Any.fromFunction3(reset))
    __obj.asInstanceOf[ExpressBrute]
  }
}

