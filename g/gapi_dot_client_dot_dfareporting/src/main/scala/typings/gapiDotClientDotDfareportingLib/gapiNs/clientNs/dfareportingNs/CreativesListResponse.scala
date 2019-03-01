package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesListResponse extends js.Object {
  /** Creative collection. */
  var creatives: js.UndefOr[js.Array[Creative]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativesListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object CreativesListResponse {
  @scala.inline
  def apply(
    creatives: js.Array[Creative] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): CreativesListResponse = {
    val __obj = js.Dynamic.literal()
    if (creatives != null) __obj.updateDynamic("creatives")(creatives)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[CreativesListResponse]
  }
}

