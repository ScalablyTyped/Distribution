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
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): TargetingValueSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetingValueSize]
  }
}

