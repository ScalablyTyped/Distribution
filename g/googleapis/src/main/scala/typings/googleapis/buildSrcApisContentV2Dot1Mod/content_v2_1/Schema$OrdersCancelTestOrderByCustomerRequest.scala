package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersCancelTestOrderByCustomerRequest extends js.Object {
  /**
    * The reason for the cancellation.
    */
  var reason: js.UndefOr[String] = js.native
}

object Schema$OrdersCancelTestOrderByCustomerRequest {
  @scala.inline
  def apply(reason: String = null): Schema$OrdersCancelTestOrderByCustomerRequest = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersCancelTestOrderByCustomerRequest]
  }
}

