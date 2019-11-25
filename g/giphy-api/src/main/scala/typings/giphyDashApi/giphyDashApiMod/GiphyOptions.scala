package typings.giphyDashApi.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GiphyOptions extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var https: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object GiphyOptions {
  @scala.inline
  def apply(apiKey: String = null, https: js.UndefOr[Boolean] = js.undefined, timeout: Int | Double = null): GiphyOptions = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiphyOptions]
  }
}

