package typings.firebaseTokenGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenOptions extends js.Object {
  var admin: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var iat: js.UndefOr[Double] = js.undefined
  var notBefore: js.UndefOr[Double] = js.undefined
  var simulate: js.UndefOr[Boolean] = js.undefined
}

object TokenOptions {
  @scala.inline
  def apply(
    admin: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    expires: js.UndefOr[Double] = js.undefined,
    iat: js.UndefOr[Double] = js.undefined,
    notBefore: js.UndefOr[Double] = js.undefined,
    simulate: js.UndefOr[Boolean] = js.undefined
  ): TokenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(admin)) __obj.updateDynamic("admin")(admin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iat)) __obj.updateDynamic("iat")(iat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notBefore)) __obj.updateDynamic("notBefore")(notBefore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simulate)) __obj.updateDynamic("simulate")(simulate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenOptions]
  }
}

