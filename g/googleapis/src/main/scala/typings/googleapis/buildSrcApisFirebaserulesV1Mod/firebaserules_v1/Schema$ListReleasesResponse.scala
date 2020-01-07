package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirebaseRulesService.ListReleases.
  */
@js.native
trait Schema$ListReleasesResponse extends js.Object {
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of `Release` instances.
    */
  var releases: js.UndefOr[js.Array[Schema$Release]] = js.native
}

object Schema$ListReleasesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, releases: js.Array[Schema$Release] = null): Schema$ListReleasesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (releases != null) __obj.updateDynamic("releases")(releases.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListReleasesResponse]
  }
}

