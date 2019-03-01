package typings
package foundationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var close: js.UndefOr[foundationLib.FoundationNs.RevealCSSOptions] = js.undefined
  var open: js.UndefOr[foundationLib.FoundationNs.RevealCSSOptions] = js.undefined
}

object Anon_Close {
  @scala.inline
  def apply(
    close: foundationLib.FoundationNs.RevealCSSOptions = null,
    open: foundationLib.FoundationNs.RevealCSSOptions = null
  ): Anon_Close = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[Anon_Close]
  }
}

