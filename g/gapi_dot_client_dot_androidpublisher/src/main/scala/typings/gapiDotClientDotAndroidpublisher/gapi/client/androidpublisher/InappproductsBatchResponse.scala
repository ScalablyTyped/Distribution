package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsBatchResponse extends js.Object {
  var entrys: js.UndefOr[js.Array[InappproductsBatchResponseEntry]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidpublisher#inappproductsBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object InappproductsBatchResponse {
  @scala.inline
  def apply(entrys: js.Array[InappproductsBatchResponseEntry] = null, kind: String = null): InappproductsBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entrys != null) __obj.updateDynamic("entrys")(entrys)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[InappproductsBatchResponse]
  }
}

