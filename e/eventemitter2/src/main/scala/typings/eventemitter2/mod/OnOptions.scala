package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var nextTick: js.UndefOr[Boolean] = js.undefined
  var objectify: js.UndefOr[Boolean] = js.undefined
  var promisify: js.UndefOr[Boolean] = js.undefined
}

object OnOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    nextTick: js.UndefOr[Boolean] = js.undefined,
    objectify: js.UndefOr[Boolean] = js.undefined,
    promisify: js.UndefOr[Boolean] = js.undefined
  ): OnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nextTick)) __obj.updateDynamic("nextTick")(nextTick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectify)) __obj.updateDynamic("objectify")(objectify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(promisify)) __obj.updateDynamic("promisify")(promisify.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOptions]
  }
}

