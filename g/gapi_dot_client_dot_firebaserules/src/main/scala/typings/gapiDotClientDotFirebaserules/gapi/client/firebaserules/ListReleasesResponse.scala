package typings.gapiDotClientDotFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReleasesResponse extends js.Object {
  /**
    * The pagination token to retrieve the next page of results. If the value is
    * empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** List of `Release` instances. */
  var releases: js.UndefOr[js.Array[Release]] = js.undefined
}

object ListReleasesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, releases: js.Array[Release] = null): ListReleasesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (releases != null) __obj.updateDynamic("releases")(releases)
    __obj.asInstanceOf[ListReleasesResponse]
  }
}

