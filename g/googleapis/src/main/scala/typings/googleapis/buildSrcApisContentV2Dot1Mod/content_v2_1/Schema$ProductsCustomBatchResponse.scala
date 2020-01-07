package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProductsCustomBatchResponse extends js.Object {
  /**
    * The result of the execution of the batch requests.
    */
  var entries: js.UndefOr[js.Array[Schema$ProductsCustomBatchResponseEntry]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#productsCustomBatchResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ProductsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[Schema$ProductsCustomBatchResponseEntry] = null, kind: String = null): Schema$ProductsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductsCustomBatchResponse]
  }
}

