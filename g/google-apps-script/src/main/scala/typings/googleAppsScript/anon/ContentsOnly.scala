package typings.googleAppsScript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentsOnly extends js.Object {
  var contentsOnly: js.UndefOr[Boolean] = js.undefined
  var formatOnly: js.UndefOr[Boolean] = js.undefined
}

object ContentsOnly {
  @scala.inline
  def apply(contentsOnly: js.UndefOr[Boolean] = js.undefined, formatOnly: js.UndefOr[Boolean] = js.undefined): ContentsOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentsOnly)) __obj.updateDynamic("contentsOnly")(contentsOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formatOnly)) __obj.updateDynamic("formatOnly")(formatOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentsOnly]
  }
}

