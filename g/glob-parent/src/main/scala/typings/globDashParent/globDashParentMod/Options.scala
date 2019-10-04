package typings.globDashParent.globDashParentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var flipBackslashes: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(flipBackslashes: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flipBackslashes)) __obj.updateDynamic("flipBackslashes")(flipBackslashes)
    __obj.asInstanceOf[Options]
  }
}

