package typings.fuzzyDashSearch.fuzzyDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(caseSensitive: js.UndefOr[Boolean] = js.undefined, sort: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[Options]
  }
}

