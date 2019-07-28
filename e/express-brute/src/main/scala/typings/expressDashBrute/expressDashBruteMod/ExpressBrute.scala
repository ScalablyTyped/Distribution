package typings.expressDashBrute.expressDashBruteMod

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.Response
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
  def getMiddleware(options: Middleware): RequestHandler
  /**
    * @summary Middleware that will bounce requests that happen faster than the current wait time by calling failCallback.
    * @param {Request}     request     The HTTP request.
    * @param {Response}    response    The HTTP response.
    * @param {Function}    next        The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  def prevent(request: Request, response: Response, next: js.Function): RequestHandler
  /**
    * @summary Resets the wait time between requests back to its initial value.
    * @param {string}      ip      The IP address.
    * @param {string}      key     The key. response.
    * @param {Function}    next    The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  def reset(ip: String, key: String, next: js.Function): RequestHandler
}

object ExpressBrute {
  @scala.inline
  def apply(
    getMiddleware: Middleware => RequestHandler,
    prevent: (Request, Response, js.Function) => RequestHandler,
    reset: (String, String, js.Function) => RequestHandler
  ): ExpressBrute = {
    val __obj = js.Dynamic.literal(getMiddleware = js.Any.fromFunction1(getMiddleware), prevent = js.Any.fromFunction3(prevent), reset = js.Any.fromFunction3(reset))
  
    __obj.asInstanceOf[ExpressBrute]
  }
}

