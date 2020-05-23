package typings.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryXHR extends js.Object {
  /**
    * Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
}

object JQueryXHR {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined): JQueryXHR = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryXHR]
  }
}

