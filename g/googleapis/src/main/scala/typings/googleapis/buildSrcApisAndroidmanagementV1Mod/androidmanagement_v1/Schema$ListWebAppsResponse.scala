package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to list web apps for a given enterprise.
  */
@js.native
trait Schema$ListWebAppsResponse extends js.Object {
  /**
    * If there are more results, a token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of web apps.
    */
  var webApps: js.UndefOr[js.Array[Schema$WebApp]] = js.native
}

object Schema$ListWebAppsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, webApps: js.Array[Schema$WebApp] = null): Schema$ListWebAppsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (webApps != null) __obj.updateDynamic("webApps")(webApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListWebAppsResponse]
  }
}

