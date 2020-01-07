package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderLineItemShippingDetails extends js.Object {
  /**
    * The delivery by date, in ISO 8601 format.
    */
  var deliverByDate: js.UndefOr[String] = js.native
  /**
    * Details of the shipping method.
    */
  var method: js.UndefOr[Schema$OrderLineItemShippingDetailsMethod] = js.native
  /**
    * The ship by date, in ISO 8601 format.
    */
  var shipByDate: js.UndefOr[String] = js.native
}

object Schema$OrderLineItemShippingDetails {
  @scala.inline
  def apply(
    deliverByDate: String = null,
    method: Schema$OrderLineItemShippingDetailsMethod = null,
    shipByDate: String = null
  ): Schema$OrderLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    if (deliverByDate != null) __obj.updateDynamic("deliverByDate")(deliverByDate.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (shipByDate != null) __obj.updateDynamic("shipByDate")(shipByDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderLineItemShippingDetails]
  }
}

