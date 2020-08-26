package typings.expressBrute.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Middleware extends js.Object {
  /**
    * @summary Allows you to override the value of failCallback for this middleware.
    * @type {Function}
    */
  var failCallback: js.UndefOr[js.Function] = js.native
  /**
    * @summary Disregard IP address when matching requests if set to true. Defaults to false.
    * @type {boolean}
    */
  var ignoreIP: js.UndefOr[Boolean] = js.native
  /**
    * @summary Key.
    * @type {any}
    */
  var key: js.UndefOr[js.Any] = js.native
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
    def setFailCallback(value: js.Function): Self = this.set("failCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailCallback: Self = this.set("failCallback", js.undefined)
    @scala.inline
    def setIgnoreIP(value: Boolean): Self = this.set("ignoreIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreIP: Self = this.set("ignoreIP", js.undefined)
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

