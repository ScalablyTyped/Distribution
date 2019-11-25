package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldValuesListResponse extends js.Object {
  /** Creative field value collection. */
  var creativeFieldValues: js.UndefOr[js.Array[CreativeFieldValue]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeFieldValuesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object CreativeFieldValuesListResponse {
  @scala.inline
  def apply(
    creativeFieldValues: js.Array[CreativeFieldValue] = null,
    kind: String = null,
    nextPageToken: String = null
  ): CreativeFieldValuesListResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeFieldValues != null) __obj.updateDynamic("creativeFieldValues")(creativeFieldValues.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeFieldValuesListResponse]
  }
}

