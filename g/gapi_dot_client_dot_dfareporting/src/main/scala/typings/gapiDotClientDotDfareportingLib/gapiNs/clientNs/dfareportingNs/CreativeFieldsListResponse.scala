package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldsListResponse extends js.Object {
  /** Creative field collection. */
  var creativeFields: js.UndefOr[js.Array[CreativeField]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeFieldsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeFieldsListResponse {
  @scala.inline
  def apply(
    creativeFields: js.Array[CreativeField] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): CreativeFieldsListResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeFields != null) __obj.updateDynamic("creativeFields")(creativeFields)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[CreativeFieldsListResponse]
  }
}

