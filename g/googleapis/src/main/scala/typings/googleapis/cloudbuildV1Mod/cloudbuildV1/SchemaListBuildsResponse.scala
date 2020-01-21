package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response including listed builds.
  */
@js.native
trait SchemaListBuildsResponse extends js.Object {
  /**
    * Builds will be sorted by `create_time`, descending.
    */
  var builds: js.UndefOr[js.Array[SchemaBuild]] = js.native
  /**
    * Token to receive the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListBuildsResponse {
  @scala.inline
  def apply(builds: js.Array[SchemaBuild] = null, nextPageToken: String = null): SchemaListBuildsResponse = {
    val __obj = js.Dynamic.literal()
    if (builds != null) __obj.updateDynamic("builds")(builds.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListBuildsResponse]
  }
}

