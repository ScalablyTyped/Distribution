package typings.gapiClientAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWidth extends js.Object {
  /** Height in pixels. */
  var height: js.UndefOr[String] = js.undefined
  /** Width in pixels. */
  var width: js.UndefOr[String] = js.undefined
}

object AnonWidth {
  @scala.inline
  def apply(height: String = null, width: String = null): AnonWidth = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWidth]
  }
}

