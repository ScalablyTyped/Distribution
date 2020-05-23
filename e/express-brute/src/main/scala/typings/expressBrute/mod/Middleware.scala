package typings.expressBrute.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  /**
    * @summary Allows you to override the value of failCallback for this middleware.
    * @type {Function}
    */
  var failCallback: js.UndefOr[js.Function] = js.undefined
  /**
    * @summary Disregard IP address when matching requests if set to true. Defaults to false.
    * @type {boolean}
    */
  var ignoreIP: js.UndefOr[Boolean] = js.undefined
  /**
    * @summary Key.
    * @type {any}
    */
  var key: js.UndefOr[js.Any] = js.undefined
}

object Middleware {
  @scala.inline
  def apply(failCallback: js.Function = null, ignoreIP: js.UndefOr[Boolean] = js.undefined, key: js.Any = null): Middleware = {
    val __obj = js.Dynamic.literal()
    if (failCallback != null) __obj.updateDynamic("failCallback")(failCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreIP)) __obj.updateDynamic("ignoreIP")(ignoreIP.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middleware]
  }
}

