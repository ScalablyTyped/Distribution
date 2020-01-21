package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1ListVersionsResponse extends js.Object {
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of versions. */
  var versions: js.UndefOr[js.Array[GoogleCloudMlV1Version]] = js.undefined
}

object GoogleCloudMlV1ListVersionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, versions: js.Array[GoogleCloudMlV1Version] = null): GoogleCloudMlV1ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudMlV1ListVersionsResponse]
  }
}

