package typings
package expressDashValidatorLib.srcOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsMACAddressOptions extends js.Object {
  var no_colons: js.UndefOr[scala.Boolean] = js.undefined
}

object IsMACAddressOptions {
  @scala.inline
  def apply(no_colons: js.UndefOr[scala.Boolean] = js.undefined): IsMACAddressOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(no_colons)) __obj.updateDynamic("no_colons")(no_colons)
    __obj.asInstanceOf[IsMACAddressOptions]
  }
}

