package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AccountsCustomBatchResponse extends js.Object {
  /**
    * The result of the execution of the batch requests.
    */
  var entries: js.UndefOr[js.Array[Schema$AccountsCustomBatchResponseEntry]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountsCustomBatchResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AccountsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[Schema$AccountsCustomBatchResponseEntry] = null, kind: String = null): Schema$AccountsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountsCustomBatchResponse]
  }
}

