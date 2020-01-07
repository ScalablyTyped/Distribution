package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiasettingsCustomBatchResponse extends js.Object {
  /**
    * The result of the execution of the batch requests.
    */
  var entries: js.UndefOr[js.Array[Schema$LiasettingsCustomBatchResponseEntry]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsCustomBatchResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$LiasettingsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[Schema$LiasettingsCustomBatchResponseEntry] = null, kind: String = null): Schema$LiasettingsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiasettingsCustomBatchResponse]
  }
}

