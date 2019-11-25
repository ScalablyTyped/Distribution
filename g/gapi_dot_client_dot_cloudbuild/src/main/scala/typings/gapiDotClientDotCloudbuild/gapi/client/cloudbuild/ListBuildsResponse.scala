package typings.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBuildsResponse extends js.Object {
  /** Builds will be sorted by create_time, descending. */
  var builds: js.UndefOr[js.Array[Build]] = js.undefined
  /** Token to receive the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListBuildsResponse {
  @scala.inline
  def apply(builds: js.Array[Build] = null, nextPageToken: String = null): ListBuildsResponse = {
    val __obj = js.Dynamic.literal()
    if (builds != null) __obj.updateDynamic("builds")(builds.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBuildsResponse]
  }
}

