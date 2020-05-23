package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreScroll extends js.Object {
  var ignoreScroll: js.UndefOr[Boolean] = js.undefined
  var ignoreSorting: js.UndefOr[Boolean] = js.undefined
  var partial: js.UndefOr[Boolean] = js.undefined
}

object IgnoreScroll {
  @scala.inline
  def apply(
    ignoreScroll: js.UndefOr[Boolean] = js.undefined,
    ignoreSorting: js.UndefOr[Boolean] = js.undefined,
    partial: js.UndefOr[Boolean] = js.undefined
  ): IgnoreScroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreScroll)) __obj.updateDynamic("ignoreScroll")(ignoreScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSorting)) __obj.updateDynamic("ignoreSorting")(ignoreSorting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreScroll]
  }
}

