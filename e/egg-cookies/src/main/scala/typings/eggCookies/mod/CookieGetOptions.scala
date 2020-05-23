package typings.eggCookies.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieGetOptions extends js.Object {
  /**
    * Encrypt the cookie's value or not (The default value is false).
    */
  var encrypt: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to sign or not (The default value is true).
    */
  var signed: js.UndefOr[Boolean] = js.undefined
}

object CookieGetOptions {
  @scala.inline
  def apply(encrypt: js.UndefOr[Boolean] = js.undefined, signed: js.UndefOr[Boolean] = js.undefined): CookieGetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieGetOptions]
  }
}

