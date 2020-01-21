package typings.foundation

import typings.foundation.Foundation.RevealCSSOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  var close: js.UndefOr[RevealCSSOptions] = js.undefined
  var open: js.UndefOr[RevealCSSOptions] = js.undefined
}

object AnonClose {
  @scala.inline
  def apply(close: RevealCSSOptions = null, open: RevealCSSOptions = null): AnonClose = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClose]
  }
}

