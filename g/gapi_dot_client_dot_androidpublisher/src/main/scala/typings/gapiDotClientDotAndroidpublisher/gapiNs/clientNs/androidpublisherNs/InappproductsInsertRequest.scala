package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsInsertRequest extends js.Object {
  var inappproduct: js.UndefOr[InAppProduct] = js.undefined
}

object InappproductsInsertRequest {
  @scala.inline
  def apply(inappproduct: InAppProduct = null): InappproductsInsertRequest = {
    val __obj = js.Dynamic.literal()
    if (inappproduct != null) __obj.updateDynamic("inappproduct")(inappproduct)
    __obj.asInstanceOf[InappproductsInsertRequest]
  }
}

