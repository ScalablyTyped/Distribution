package typings.googleapis.buildSrcApisAccesscontextmanagerV1betaMod.accesscontextmanager_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to `ListAccessLevelsRequest`.
  */
@js.native
trait Schema$ListAccessLevelsResponse extends js.Object {
  /**
    * List of the Access Level instances.
    */
  var accessLevels: js.UndefOr[js.Array[Schema$AccessLevel]] = js.native
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListAccessLevelsResponse {
  @scala.inline
  def apply(accessLevels: js.Array[Schema$AccessLevel] = null, nextPageToken: String = null): Schema$ListAccessLevelsResponse = {
    val __obj = js.Dynamic.literal()
    if (accessLevels != null) __obj.updateDynamic("accessLevels")(accessLevels.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAccessLevelsResponse]
  }
}

