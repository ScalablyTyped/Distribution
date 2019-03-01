package typings
package giphyDashApiLib.giphyDashApiMod.giphyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GiphyOptions extends js.Object {
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  var https: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object GiphyOptions {
  @scala.inline
  def apply(
    apiKey: java.lang.String = null,
    https: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): GiphyOptions = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiphyOptions]
  }
}

