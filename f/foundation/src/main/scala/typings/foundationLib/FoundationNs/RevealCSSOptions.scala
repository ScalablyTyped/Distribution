package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/reveal.html
trait RevealCSSOptions extends js.Object {
  var display: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

object RevealCSSOptions {
  @scala.inline
  def apply(
    display: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    visibility: java.lang.String = null
  ): RevealCSSOptions = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[RevealCSSOptions]
  }
}

