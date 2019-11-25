package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/reveal.html
trait RevealCSSOptions extends js.Object {
  var display: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var visibility: js.UndefOr[String] = js.undefined
}

object RevealCSSOptions {
  @scala.inline
  def apply(display: String = null, opacity: Int | Double = null, visibility: String = null): RevealCSSOptions = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevealCSSOptions]
  }
}

