package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to list web apps for a given enterprise.
  */
@js.native
trait SchemaListWebAppsResponse extends js.Object {
  /**
    * If there are more results, a token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of web apps.
    */
  var webApps: js.UndefOr[js.Array[SchemaWebApp]] = js.native
}

object SchemaListWebAppsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, webApps: js.Array[SchemaWebApp] = null): SchemaListWebAppsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (webApps != null) __obj.updateDynamic("webApps")(webApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListWebAppsResponse]
  }
}

