package typings
package empowerLib.empowerMod.empowerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var destructive: js.UndefOr[scala.Boolean] = js.undefined
  var modifyMessageOnRethrow: js.UndefOr[scala.Boolean] = js.undefined
  var patterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var saveContextOnRethrow: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    destructive: js.UndefOr[scala.Boolean] = js.undefined,
    modifyMessageOnRethrow: js.UndefOr[scala.Boolean] = js.undefined,
    patterns: js.Array[java.lang.String] = null,
    saveContextOnRethrow: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(destructive)) __obj.updateDynamic("destructive")(destructive)
    if (!js.isUndefined(modifyMessageOnRethrow)) __obj.updateDynamic("modifyMessageOnRethrow")(modifyMessageOnRethrow)
    if (patterns != null) __obj.updateDynamic("patterns")(patterns)
    if (!js.isUndefined(saveContextOnRethrow)) __obj.updateDynamic("saveContextOnRethrow")(saveContextOnRethrow)
    __obj.asInstanceOf[Options]
  }
}

