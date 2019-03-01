package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#accounttaxListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The token for the retrieval of the next page of account tax settings. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var resources: js.UndefOr[js.Array[AccountTax]] = js.undefined
}

object AccounttaxListResponse {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    resources: js.Array[AccountTax] = null
  ): AccounttaxListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[AccounttaxListResponse]
  }
}

