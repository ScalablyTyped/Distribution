package typings.googleapis.buildSrcApisCloudbuildV1Mod.cloudbuild_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response including listed builds.
  */
@js.native
trait Schema$ListBuildsResponse extends js.Object {
  /**
    * Builds will be sorted by `create_time`, descending.
    */
  var builds: js.UndefOr[js.Array[Schema$Build]] = js.native
  /**
    * Token to receive the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListBuildsResponse {
  @scala.inline
  def apply(builds: js.Array[Schema$Build] = null, nextPageToken: String = null): Schema$ListBuildsResponse = {
    val __obj = js.Dynamic.literal()
    if (builds != null) __obj.updateDynamic("builds")(builds.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListBuildsResponse]
  }
}

