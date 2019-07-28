package typings.faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abbr extends js.Object {
  var abbr: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[Boolean] = js.undefined
}

object Anon_Abbr {
  @scala.inline
  def apply(abbr: js.UndefOr[Boolean] = js.undefined, context: js.UndefOr[Boolean] = js.undefined): Anon_Abbr = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abbr)) __obj.updateDynamic("abbr")(abbr)
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[Anon_Abbr]
  }
}

