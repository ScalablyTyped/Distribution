package typings.foundation

import typings.foundation.FoundationNs.RevealCSSOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var close: js.UndefOr[RevealCSSOptions] = js.undefined
  var open: js.UndefOr[RevealCSSOptions] = js.undefined
}

object Anon_Close {
  @scala.inline
  def apply(close: RevealCSSOptions = null, open: RevealCSSOptions = null): Anon_Close = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[Anon_Close]
  }
}

