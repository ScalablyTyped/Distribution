package typings.frctlFractal.mod.fractal.api.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocMarkdownConfig extends js.Object {
  var breaks: js.UndefOr[Boolean] = js.undefined
  var gfm: js.UndefOr[Boolean] = js.undefined
  var pedantic: js.UndefOr[Boolean] = js.undefined
  var sanitize: js.UndefOr[Boolean] = js.undefined
  var smartLists: js.UndefOr[Boolean] = js.undefined
  var smartypants: js.UndefOr[Boolean] = js.undefined
  var tables: js.UndefOr[Boolean] = js.undefined
}

object DocMarkdownConfig {
  @scala.inline
  def apply(
    breaks: js.UndefOr[Boolean] = js.undefined,
    gfm: js.UndefOr[Boolean] = js.undefined,
    pedantic: js.UndefOr[Boolean] = js.undefined,
    sanitize: js.UndefOr[Boolean] = js.undefined,
    smartLists: js.UndefOr[Boolean] = js.undefined,
    smartypants: js.UndefOr[Boolean] = js.undefined,
    tables: js.UndefOr[Boolean] = js.undefined
  ): DocMarkdownConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breaks)) __obj.updateDynamic("breaks")(breaks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gfm)) __obj.updateDynamic("gfm")(gfm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pedantic)) __obj.updateDynamic("pedantic")(pedantic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smartLists)) __obj.updateDynamic("smartLists")(smartLists.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smartypants)) __obj.updateDynamic("smartypants")(smartypants.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tables)) __obj.updateDynamic("tables")(tables.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocMarkdownConfig]
  }
}

