package typings.fsTreeDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticOptions extends js.Object {
  var sortAndExpand: js.UndefOr[Boolean] = js.undefined
}

object StaticOptions {
  @scala.inline
  def apply(sortAndExpand: js.UndefOr[Boolean] = js.undefined): StaticOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sortAndExpand)) __obj.updateDynamic("sortAndExpand")(sortAndExpand.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticOptions]
  }
}

