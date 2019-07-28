package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#datafeedstatusesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The token for the retrieval of the next page of datafeed statuses. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  var resources: js.UndefOr[js.Array[DatafeedStatus]] = js.undefined
}

object DatafeedstatusesListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, resources: js.Array[DatafeedStatus] = null): DatafeedstatusesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[DatafeedstatusesListResponse]
  }
}

