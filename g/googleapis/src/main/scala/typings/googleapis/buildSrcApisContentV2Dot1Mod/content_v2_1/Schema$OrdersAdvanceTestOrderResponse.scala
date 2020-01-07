package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersAdvanceTestOrderResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersAdvanceTestOrderResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$OrdersAdvanceTestOrderResponse {
  @scala.inline
  def apply(kind: String = null): Schema$OrdersAdvanceTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersAdvanceTestOrderResponse]
  }
}

