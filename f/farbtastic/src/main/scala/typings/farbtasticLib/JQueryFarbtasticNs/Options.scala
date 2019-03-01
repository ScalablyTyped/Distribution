package typings
package farbtasticLib.JQueryFarbtasticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var callback: js.UndefOr[Callback] = js.undefined
  var wheelWidth: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    callback: Callback = null,
    wheelWidth: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (wheelWidth != null) __obj.updateDynamic("wheelWidth")(wheelWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

