package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersAdvanceTestOrderResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersAdvanceTestOrderResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object OrdersAdvanceTestOrderResponse {
  @scala.inline
  def apply(kind: String = null): OrdersAdvanceTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[OrdersAdvanceTestOrderResponse]
  }
}

