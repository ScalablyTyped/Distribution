package typings.dompurify

import typings.dompurify.dompurifyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var RETURN_DOM: js.UndefOr[`false`] = js.undefined
  var RETURN_DOM_FRAGMENT: js.UndefOr[`false`] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(RETURN_DOM: `false` = null, RETURN_DOM_FRAGMENT: `false` = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (RETURN_DOM != null) __obj.updateDynamic("RETURN_DOM")(RETURN_DOM.asInstanceOf[js.Any])
    if (RETURN_DOM_FRAGMENT != null) __obj.updateDynamic("RETURN_DOM_FRAGMENT")(RETURN_DOM_FRAGMENT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

