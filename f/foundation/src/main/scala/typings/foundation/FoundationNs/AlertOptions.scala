package typings.foundation.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/alert_boxes.html
trait AlertOptions extends js.Object {
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(callback: () => _ = null): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    __obj.asInstanceOf[AlertOptions]
  }
}

