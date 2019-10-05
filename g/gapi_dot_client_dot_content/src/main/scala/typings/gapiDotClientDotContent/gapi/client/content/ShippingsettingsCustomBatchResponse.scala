package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsCustomBatchResponse extends js.Object {
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[ShippingsettingsCustomBatchResponseEntry]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object ShippingsettingsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[ShippingsettingsCustomBatchResponseEntry] = null, kind: String = null): ShippingsettingsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ShippingsettingsCustomBatchResponse]
  }
}

