package typings.expoWebBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipRedirectCheck extends js.Object {
  var skipRedirectCheck: js.UndefOr[Boolean] = js.undefined
}

object SkipRedirectCheck {
  @scala.inline
  def apply(skipRedirectCheck: js.UndefOr[Boolean] = js.undefined): SkipRedirectCheck = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipRedirectCheck)) __obj.updateDynamic("skipRedirectCheck")(skipRedirectCheck.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipRedirectCheck]
  }
}

