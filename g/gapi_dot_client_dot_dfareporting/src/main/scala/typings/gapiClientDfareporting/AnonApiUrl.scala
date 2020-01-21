package typings.gapiClientDfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiUrl extends js.Object {
  /** The URL for downloading the report data through the API. */
  var apiUrl: js.UndefOr[String] = js.undefined
  /** The URL for downloading the report data through a browser. */
  var browserUrl: js.UndefOr[String] = js.undefined
}

object AnonApiUrl {
  @scala.inline
  def apply(apiUrl: String = null, browserUrl: String = null): AnonApiUrl = {
    val __obj = js.Dynamic.literal()
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl.asInstanceOf[js.Any])
    if (browserUrl != null) __obj.updateDynamic("browserUrl")(browserUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApiUrl]
  }
}

