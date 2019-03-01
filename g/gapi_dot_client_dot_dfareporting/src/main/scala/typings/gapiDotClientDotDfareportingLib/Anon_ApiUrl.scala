package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiUrl extends js.Object {
  /** The URL for downloading the report data through the API. */
  var apiUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The URL for downloading the report data through a browser. */
  var browserUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ApiUrl {
  @scala.inline
  def apply(apiUrl: java.lang.String = null, browserUrl: java.lang.String = null): Anon_ApiUrl = {
    val __obj = js.Dynamic.literal()
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl)
    if (browserUrl != null) __obj.updateDynamic("browserUrl")(browserUrl)
    __obj.asInstanceOf[Anon_ApiUrl]
  }
}

