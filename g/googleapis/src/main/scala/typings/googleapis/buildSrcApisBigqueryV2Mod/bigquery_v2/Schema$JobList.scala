package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import typings.googleapis.Anon_Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$JobList extends js.Object {
  /**
    * A hash of this page of results.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * List of jobs that were requested.
    */
  var jobs: js.UndefOr[js.Array[Anon_Configuration]] = js.native
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A token to request the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$JobList {
  @scala.inline
  def apply(
    etag: String = null,
    jobs: js.Array[Anon_Configuration] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$JobList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$JobList]
  }
}

