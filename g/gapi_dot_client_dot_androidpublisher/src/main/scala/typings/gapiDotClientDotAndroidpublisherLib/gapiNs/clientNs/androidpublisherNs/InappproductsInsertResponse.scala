package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsInsertResponse extends js.Object {
  var inappproduct: js.UndefOr[InAppProduct] = js.undefined
}

object InappproductsInsertResponse {
  @scala.inline
  def apply(inappproduct: InAppProduct = null): InappproductsInsertResponse = {
    val __obj = js.Dynamic.literal()
    if (inappproduct != null) __obj.updateDynamic("inappproduct")(inappproduct)
    __obj.asInstanceOf[InappproductsInsertResponse]
  }
}

