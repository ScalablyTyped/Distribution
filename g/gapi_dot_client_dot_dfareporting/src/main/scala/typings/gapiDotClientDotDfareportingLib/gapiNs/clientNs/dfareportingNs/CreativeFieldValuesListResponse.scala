package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldValuesListResponse extends js.Object {
  /** Creative field value collection. */
  var creativeFieldValues: js.UndefOr[js.Array[CreativeFieldValue]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeFieldValuesListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeFieldValuesListResponse {
  @scala.inline
  def apply(
    creativeFieldValues: js.Array[CreativeFieldValue] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): CreativeFieldValuesListResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeFieldValues != null) __obj.updateDynamic("creativeFieldValues")(creativeFieldValues)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[CreativeFieldValuesListResponse]
  }
}

