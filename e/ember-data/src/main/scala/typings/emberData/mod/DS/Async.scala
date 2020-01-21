package typings.emberData.mod.DS

import typings.emberData.emberDataBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Async extends js.Object {
  var async: js.UndefOr[`true`] = js.undefined
}

object Async {
  @scala.inline
  def apply(async: `true` = null): Async = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
}

