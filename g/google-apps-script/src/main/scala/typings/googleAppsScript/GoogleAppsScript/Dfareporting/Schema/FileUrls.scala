package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUrls extends js.Object {
  var apiUrl: js.UndefOr[String] = js.undefined
  var browserUrl: js.UndefOr[String] = js.undefined
}

object FileUrls {
  @scala.inline
  def apply(apiUrl: String = null, browserUrl: String = null): FileUrls = {
    val __obj = js.Dynamic.literal()
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl.asInstanceOf[js.Any])
    if (browserUrl != null) __obj.updateDynamic("browserUrl")(browserUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUrls]
  }
}

