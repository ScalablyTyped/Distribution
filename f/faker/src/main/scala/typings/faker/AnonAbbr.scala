package typings.faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbbr extends js.Object {
  var abbr: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[Boolean] = js.undefined
}

object AnonAbbr {
  @scala.inline
  def apply(abbr: js.UndefOr[Boolean] = js.undefined, context: js.UndefOr[Boolean] = js.undefined): AnonAbbr = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abbr)) __obj.updateDynamic("abbr")(abbr.asInstanceOf[js.Any])
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbbr]
  }
}

