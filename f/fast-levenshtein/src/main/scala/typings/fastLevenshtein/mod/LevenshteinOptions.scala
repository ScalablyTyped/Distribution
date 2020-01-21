package typings.fastLevenshtein.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevenshteinOptions extends js.Object {
  var useCollator: js.UndefOr[Boolean] = js.undefined
}

object LevenshteinOptions {
  @scala.inline
  def apply(useCollator: js.UndefOr[Boolean] = js.undefined): LevenshteinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useCollator)) __obj.updateDynamic("useCollator")(useCollator.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevenshteinOptions]
  }
}

