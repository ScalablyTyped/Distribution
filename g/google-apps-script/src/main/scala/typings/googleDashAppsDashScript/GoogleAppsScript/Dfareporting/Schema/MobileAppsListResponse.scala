package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileAppsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var mobileApps: js.UndefOr[js.Array[MobileApp]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object MobileAppsListResponse {
  @scala.inline
  def apply(kind: String = null, mobileApps: js.Array[MobileApp] = null, nextPageToken: String = null): MobileAppsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (mobileApps != null) __obj.updateDynamic("mobileApps")(mobileApps)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[MobileAppsListResponse]
  }
}

