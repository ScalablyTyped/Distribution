package typings.expressDashBrute.expressDashBruteMod

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Middleware.
  * @class
  */
@JSImport("express-brute", JSImport.Namespace)
@js.native
class ^ protected () extends ExpressBrute {
  /**
    * @summary Constructor.
    * @constructor
    * @param {any} store The store.
    */
  def this(store: js.Any) = this()
  def this(store: js.Any, options: Options) = this()
  /**
    * @summary Generates middleware that will bounce requests with the same key and IP address that happen faster than the current wait time by calling failCallback.
    * @param {Object} options The options.
    */
  /* CompleteClass */
  override def getMiddleware(options: Middleware): RequestHandler[ParamsDictionary] = js.native
  /**
    * @summary Middleware that will bounce requests that happen faster than the current wait time by calling failCallback.
    * @param {Request}     request     The HTTP request.
    * @param {Response}    response    The HTTP response.
    * @param {Function}    next        The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  /* CompleteClass */
  override def prevent(request: Request[ParamsDictionary], response: Response, next: js.Function): RequestHandler[ParamsDictionary] = js.native
  /**
    * @summary Resets the wait time between requests back to its initial value.
    * @param {string}      ip      The IP address.
    * @param {string}      key     The key. response.
    * @param {Function}    next    The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  /* CompleteClass */
  override def reset(ip: String, key: String, next: js.Function): RequestHandler[ParamsDictionary] = js.native
}

