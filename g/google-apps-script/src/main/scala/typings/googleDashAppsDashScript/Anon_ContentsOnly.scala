package typings.googleDashAppsDashScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentsOnly extends js.Object {
  var contentsOnly: js.UndefOr[Boolean] = js.undefined
  var formatOnly: js.UndefOr[Boolean] = js.undefined
}

object Anon_ContentsOnly {
  @scala.inline
  def apply(contentsOnly: js.UndefOr[Boolean] = js.undefined, formatOnly: js.UndefOr[Boolean] = js.undefined): Anon_ContentsOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentsOnly)) __obj.updateDynamic("contentsOnly")(contentsOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(formatOnly)) __obj.updateDynamic("formatOnly")(formatOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContentsOnly]
  }
}

