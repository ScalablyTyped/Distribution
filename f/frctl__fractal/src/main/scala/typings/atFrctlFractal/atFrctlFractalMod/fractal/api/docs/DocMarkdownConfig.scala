package typings.atFrctlFractal.atFrctlFractalMod.fractal.api.docs

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
    if (!js.isUndefined(breaks)) __obj.updateDynamic("breaks")(breaks)
    if (!js.isUndefined(gfm)) __obj.updateDynamic("gfm")(gfm)
    if (!js.isUndefined(pedantic)) __obj.updateDynamic("pedantic")(pedantic)
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize)
    if (!js.isUndefined(smartLists)) __obj.updateDynamic("smartLists")(smartLists)
    if (!js.isUndefined(smartypants)) __obj.updateDynamic("smartypants")(smartypants)
    if (!js.isUndefined(tables)) __obj.updateDynamic("tables")(tables)
    __obj.asInstanceOf[DocMarkdownConfig]
  }
}

