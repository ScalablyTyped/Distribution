package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Billing extends js.Object {
  /**
    * Billing configurations for sending metrics to the consumer project.
    * There can be multiple consumer destinations per service, each one must have
    * a different monitored resource type. A metric can be used in at most
    * one consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[BillingDestination]] = js.undefined
}

object Billing {
  @scala.inline
  def apply(consumerDestinations: js.Array[BillingDestination] = null): Billing = {
    val __obj = js.Dynamic.literal()
    if (consumerDestinations != null) __obj.updateDynamic("consumerDestinations")(consumerDestinations)
    __obj.asInstanceOf[Billing]
  }
}

