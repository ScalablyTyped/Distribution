package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AccountstatusesCustomBatchResponse extends js.Object {
  /**
    * The result of the execution of the batch requests.
    */
  var entries: js.UndefOr[js.Array[Schema$AccountstatusesCustomBatchResponseEntry]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountstatusesCustomBatchResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AccountstatusesCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[Schema$AccountstatusesCustomBatchResponseEntry] = null, kind: String = null): Schema$AccountstatusesCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountstatusesCustomBatchResponse]
  }
}

