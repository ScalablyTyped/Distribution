package typings.fastDashHtmlDashParser.fastDashHtmlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var lowerCaseTagName: js.UndefOr[Boolean] = js.undefined
  var pre: js.UndefOr[Boolean] = js.undefined
  var script: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    lowerCaseTagName: js.UndefOr[Boolean] = js.undefined,
    pre: js.UndefOr[Boolean] = js.undefined,
    script: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lowerCaseTagName)) __obj.updateDynamic("lowerCaseTagName")(lowerCaseTagName.asInstanceOf[js.Any])
    if (!js.isUndefined(pre)) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    if (!js.isUndefined(script)) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

