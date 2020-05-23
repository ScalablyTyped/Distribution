package typings.expressValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DryRun extends js.Object {
  var dryRun: js.UndefOr[Boolean] = js.undefined
}

object DryRun {
  @scala.inline
  def apply(dryRun: js.UndefOr[Boolean] = js.undefined): DryRun = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DryRun]
  }
}

