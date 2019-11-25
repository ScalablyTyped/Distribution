package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreScroll extends js.Object {
  var ignoreScroll: js.UndefOr[Boolean] = js.undefined
  var ignoreSorting: js.UndefOr[Boolean] = js.undefined
  var partial: js.UndefOr[Boolean] = js.undefined
}

object Anon_IgnoreScroll {
  @scala.inline
  def apply(
    ignoreScroll: js.UndefOr[Boolean] = js.undefined,
    ignoreSorting: js.UndefOr[Boolean] = js.undefined,
    partial: js.UndefOr[Boolean] = js.undefined
  ): Anon_IgnoreScroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreScroll)) __obj.updateDynamic("ignoreScroll")(ignoreScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSorting)) __obj.updateDynamic("ignoreSorting")(ignoreSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IgnoreScroll]
  }
}

