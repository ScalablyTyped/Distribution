package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingValueSize extends js.Object {
  /** The height of the creative. */
  var height: js.UndefOr[Double] = js.undefined
  /** The width of the creative. */
  var width: js.UndefOr[Double] = js.undefined
}

object TargetingValueSize {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): TargetingValueSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetingValueSize]
  }
}

