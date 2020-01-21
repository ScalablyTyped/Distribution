package typings.empower.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var destructive: js.UndefOr[Boolean] = js.undefined
  var modifyMessageOnRethrow: js.UndefOr[Boolean] = js.undefined
  var patterns: js.UndefOr[js.Array[String]] = js.undefined
  var saveContextOnRethrow: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    destructive: js.UndefOr[Boolean] = js.undefined,
    modifyMessageOnRethrow: js.UndefOr[Boolean] = js.undefined,
    patterns: js.Array[String] = null,
    saveContextOnRethrow: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(destructive)) __obj.updateDynamic("destructive")(destructive.asInstanceOf[js.Any])
    if (!js.isUndefined(modifyMessageOnRethrow)) __obj.updateDynamic("modifyMessageOnRethrow")(modifyMessageOnRethrow.asInstanceOf[js.Any])
    if (patterns != null) __obj.updateDynamic("patterns")(patterns.asInstanceOf[js.Any])
    if (!js.isUndefined(saveContextOnRethrow)) __obj.updateDynamic("saveContextOnRethrow")(saveContextOnRethrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

