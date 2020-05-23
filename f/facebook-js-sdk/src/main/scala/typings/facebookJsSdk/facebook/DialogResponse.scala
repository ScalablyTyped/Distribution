package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogResponse extends js.Object {
  var error_code: js.UndefOr[Double] = js.undefined
  var error_message: js.UndefOr[String] = js.undefined
}

object DialogResponse {
  @scala.inline
  def apply(error_code: js.UndefOr[Double] = js.undefined, error_message: String = null): DialogResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error_code)) __obj.updateDynamic("error_code")(error_code.get.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogResponse]
  }
}

