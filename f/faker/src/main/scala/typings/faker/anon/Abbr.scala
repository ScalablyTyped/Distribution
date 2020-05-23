package typings.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Abbr extends js.Object {
  var abbr: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[Boolean] = js.undefined
}

object Abbr {
  @scala.inline
  def apply(abbr: js.UndefOr[Boolean] = js.undefined, context: js.UndefOr[Boolean] = js.undefined): Abbr = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abbr)) __obj.updateDynamic("abbr")(abbr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abbr]
  }
}

