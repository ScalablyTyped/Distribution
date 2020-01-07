package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message contains details about how the deals will be paced.
  */
@js.native
trait Schema$DeliveryControl extends js.Object {
  /**
    * Specified the creative blocking levels to be applied. @OutputOnly
    */
  var creativeBlockingLevel: js.UndefOr[String] = js.native
  /**
    * Specifies how the impression delivery will be paced. @OutputOnly
    */
  var deliveryRateType: js.UndefOr[String] = js.native
  /**
    * Specifies any frequency caps. @OutputOnly
    */
  var frequencyCaps: js.UndefOr[js.Array[Schema$FrequencyCap]] = js.native
}

object Schema$DeliveryControl {
  @scala.inline
  def apply(
    creativeBlockingLevel: String = null,
    deliveryRateType: String = null,
    frequencyCaps: js.Array[Schema$FrequencyCap] = null
  ): Schema$DeliveryControl = {
    val __obj = js.Dynamic.literal()
    if (creativeBlockingLevel != null) __obj.updateDynamic("creativeBlockingLevel")(creativeBlockingLevel.asInstanceOf[js.Any])
    if (deliveryRateType != null) __obj.updateDynamic("deliveryRateType")(deliveryRateType.asInstanceOf[js.Any])
    if (frequencyCaps != null) __obj.updateDynamic("frequencyCaps")(frequencyCaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeliveryControl]
  }
}

