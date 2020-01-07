package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Billing related configuration of the service.  The following example shows
  * how to configure monitored resources and metrics for billing:
  * monitored_resources:     - type: library.googleapis.com/branch labels: -
  * key: /city         description: The city where the library branch is
  * located in.       - key: /name         description: The name of the branch.
  * metrics:     - name: library.googleapis.com/book/borrowed_count
  * metric_kind: DELTA       value_type: INT64     billing:
  * consumer_destinations:       - monitored_resource:
  * library.googleapis.com/branch         metrics:         -
  * library.googleapis.com/book/borrowed_count
  */
@js.native
trait Schema$Billing extends js.Object {
  /**
    * Billing configurations for sending metrics to the consumer project. There
    * can be multiple consumer destinations per service, each one must have a
    * different monitored resource type. A metric can be used in at most one
    * consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[Schema$BillingDestination]] = js.native
}

object Schema$Billing {
  @scala.inline
  def apply(consumerDestinations: js.Array[Schema$BillingDestination] = null): Schema$Billing = {
    val __obj = js.Dynamic.literal()
    if (consumerDestinations != null) __obj.updateDynamic("consumerDestinations")(consumerDestinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Billing]
  }
}

