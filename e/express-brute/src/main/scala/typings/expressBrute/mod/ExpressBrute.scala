package typings.expressBrute.mod

import typings.express.mod.NextFunction
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Middleware.
  * @class
  */
@js.native
trait ExpressBrute extends js.Object {
  
  /**
    * @summary Generates middleware that will bounce requests with the same key and IP address that happen faster than the current wait time by calling failCallback.
    * @param {Object} options The options.
    */
  def getMiddleware(options: Middleware): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * @summary Middleware that will bounce requests that happen faster than the current wait time by calling failCallback.
    * @param {Request}     request     The HTTP request.
    * @param {Response}    response    The HTTP response.
    * @param {Function}    next        The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  def prevent(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_], next: NextFunction): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * @summary Resets the wait time between requests back to its initial value.
    * @param {string}      ip      The IP address.
    * @param {string}      key     The key. response.
    * @param {Function}    next    The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  def reset(ip: String, key: String, next: NextFunction): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
object ExpressBrute {
  
  @scala.inline
  def apply(
    getMiddleware: Middleware => RequestHandler[ParamsDictionary, _, _, Query],
    prevent: (Request_[ParamsDictionary, _, _, Query], Response_[_], NextFunction) => RequestHandler[ParamsDictionary, _, _, Query],
    reset: (String, String, NextFunction) => RequestHandler[ParamsDictionary, _, _, Query]
  ): ExpressBrute = {
    val __obj = js.Dynamic.literal(getMiddleware = js.Any.fromFunction1(getMiddleware), prevent = js.Any.fromFunction3(prevent), reset = js.Any.fromFunction3(reset))
    __obj.asInstanceOf[ExpressBrute]
  }
  
  @scala.inline
  implicit class ExpressBruteOps[Self <: ExpressBrute] (val x: Self) extends AnyVal {
    
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
    def setGetMiddleware(value: Middleware => RequestHandler[ParamsDictionary, _, _, Query]): Self = this.set("getMiddleware", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrevent(
      value: (Request_[ParamsDictionary, _, _, Query], Response_[_], NextFunction) => RequestHandler[ParamsDictionary, _, _, Query]
    ): Self = this.set("prevent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReset(value: (String, String, NextFunction) => RequestHandler[ParamsDictionary, _, _, Query]): Self = this.set("reset", js.Any.fromFunction3(value))
  }
}
