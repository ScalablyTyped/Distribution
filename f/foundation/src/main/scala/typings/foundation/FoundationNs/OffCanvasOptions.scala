package typings.foundation.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/offcanvas.html#optional-javascript-configuration
trait OffCanvasOptions extends js.Object {
  var close_on_click: js.UndefOr[Boolean] = js.undefined
  var open_method: js.UndefOr[String] = js.undefined
}

object OffCanvasOptions {
  @scala.inline
  def apply(close_on_click: js.UndefOr[Boolean] = js.undefined, open_method: String = null): OffCanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(close_on_click)) __obj.updateDynamic("close_on_click")(close_on_click)
    if (open_method != null) __obj.updateDynamic("open_method")(open_method)
    __obj.asInstanceOf[OffCanvasOptions]
  }
}

