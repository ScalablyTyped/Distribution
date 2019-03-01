package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobList extends js.Object {
  /** A hash of this page of results. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** List of jobs that were requested. */
  var jobs: js.UndefOr[js.Array[gapiDotClientDotBigqueryLib.Anon_Configuration]] = js.undefined
  /** The resource type of the response. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object JobList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    jobs: js.Array[gapiDotClientDotBigqueryLib.Anon_Configuration] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): JobList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (jobs != null) __obj.updateDynamic("jobs")(jobs)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[JobList]
  }
}

