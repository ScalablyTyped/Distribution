package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ReservationsResizeRequest extends js.Object {
  /**
    * Number of allocated resources can be resized with minimum = 1 and maximum
    * = 1000.
    */
  var specificSkuCount: js.UndefOr[String] = js.native
}

object Schema$ReservationsResizeRequest {
  @scala.inline
  def apply(specificSkuCount: String = null): Schema$ReservationsResizeRequest = {
    val __obj = js.Dynamic.literal()
    if (specificSkuCount != null) __obj.updateDynamic("specificSkuCount")(specificSkuCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReservationsResizeRequest]
  }
}

