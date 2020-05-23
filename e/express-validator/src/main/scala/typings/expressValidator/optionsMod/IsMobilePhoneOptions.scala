package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsMobilePhoneOptions extends js.Object {
  var strictMode: js.UndefOr[Boolean] = js.undefined
}

object IsMobilePhoneOptions {
  @scala.inline
  def apply(strictMode: js.UndefOr[Boolean] = js.undefined): IsMobilePhoneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strictMode)) __obj.updateDynamic("strictMode")(strictMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMobilePhoneOptions]
  }
}

