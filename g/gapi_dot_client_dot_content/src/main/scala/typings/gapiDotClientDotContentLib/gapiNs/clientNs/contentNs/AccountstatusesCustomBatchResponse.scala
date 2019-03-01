package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesCustomBatchResponse extends js.Object {
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[AccountstatusesCustomBatchResponseEntry]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountstatusesCustomBatchResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AccountstatusesCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[AccountstatusesCustomBatchResponseEntry] = null, kind: java.lang.String = null): AccountstatusesCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountstatusesCustomBatchResponse]
  }
}

