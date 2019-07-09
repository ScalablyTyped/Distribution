package typings
package expressDashValidatorLib.srcOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsMobilePhoneOptions extends js.Object {
  var strictMode: js.UndefOr[scala.Boolean] = js.undefined
}

object IsMobilePhoneOptions {
  @scala.inline
  def apply(strictMode: js.UndefOr[scala.Boolean] = js.undefined): IsMobilePhoneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strictMode)) __obj.updateDynamic("strictMode")(strictMode)
    __obj.asInstanceOf[IsMobilePhoneOptions]
  }
}

