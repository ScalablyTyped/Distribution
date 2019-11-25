package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowsersListResponse extends js.Object {
  var browsers: js.UndefOr[
    js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.Browser]
  ] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object BrowsersListResponse {
  @scala.inline
  def apply(
    browsers: js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.Browser] = null,
    kind: String = null
  ): BrowsersListResponse = {
    val __obj = js.Dynamic.literal()
    if (browsers != null) __obj.updateDynamic("browsers")(browsers.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowsersListResponse]
  }
}

