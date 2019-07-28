package typings.farbtastic.JQueryFarbtasticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var callback: js.UndefOr[Callback] = js.undefined
  var wheelWidth: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(callback: Callback = null, wheelWidth: Int | Double = null, width: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (wheelWidth != null) __obj.updateDynamic("wheelWidth")(wheelWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

