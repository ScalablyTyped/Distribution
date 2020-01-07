package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the ListVersions method.
  */
@js.native
trait Schema$GoogleCloudMlV1__ListVersionsResponse extends js.Object {
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of versions.
    */
  var versions: js.UndefOr[js.Array[Schema$GoogleCloudMlV1__Version]] = js.native
}

object Schema$GoogleCloudMlV1__ListVersionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, versions: js.Array[Schema$GoogleCloudMlV1__Version] = null): Schema$GoogleCloudMlV1__ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__ListVersionsResponse]
  }
}

