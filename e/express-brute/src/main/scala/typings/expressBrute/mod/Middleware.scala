package typings.expressBrute.mod

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Middleware extends js.Object {
  
  /**
    * @summary Allows you to override the value of failCallback for this middleware.
    * @type {FailCallback}
    */
  var failCallback: js.UndefOr[FailCallback] = js.native
  
  /**
    * @summary Disregard IP address when matching requests if set to true. Defaults to false.
    * @type {boolean}
    */
  var ignoreIP: js.UndefOr[Boolean] = js.native
  
  /**
    * @summary Key.
    * @type {Function}
    */
  var key: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      /* next */ NextFunction, 
      _
    ]
  ] = js.native
}
object Middleware {
  
  @scala.inline
  def apply(): Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Middleware]
  }
  
  @scala.inline
  implicit class MiddlewareOps[Self <: Middleware] (val x: Self) extends AnyVal {
    
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
    def setFailCallback(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* next */ NextFunction, /* nextValidRequestDate */ Date) => Unit
    ): Self = this.set("failCallback", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteFailCallback: Self = this.set("failCallback", js.undefined)
    
    @scala.inline
    def setIgnoreIP(value: Boolean): Self = this.set("ignoreIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreIP: Self = this.set("ignoreIP", js.undefined)
    
    @scala.inline
    def setKey(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ NextFunction) => _
    ): Self = this.set("key", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
