package typings.foundationDashSites.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInterchangeOptions extends js.Object {
  var rules: js.UndefOr[js.Array[_]] = js.undefined
}

object IInterchangeOptions {
  @scala.inline
  def apply(rules: js.Array[_] = null): IInterchangeOptions = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[IInterchangeOptions]
  }
}

