package typings.gapiDotClientDotServiceuser.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monitoring extends js.Object {
  /**
    * Monitoring configurations for sending metrics to the consumer project.
    * There can be multiple consumer destinations, each one must have a
    * different monitored resource type. A metric can be used in at most
    * one consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[MonitoringDestination]] = js.undefined
  /**
    * Monitoring configurations for sending metrics to the producer project.
    * There can be multiple producer destinations, each one must have a
    * different monitored resource type. A metric can be used in at most
    * one producer destination.
    */
  var producerDestinations: js.UndefOr[js.Array[MonitoringDestination]] = js.undefined
}

object Monitoring {
  @scala.inline
  def apply(
    consumerDestinations: js.Array[MonitoringDestination] = null,
    producerDestinations: js.Array[MonitoringDestination] = null
  ): Monitoring = {
    val __obj = js.Dynamic.literal()
    if (consumerDestinations != null) __obj.updateDynamic("consumerDestinations")(consumerDestinations)
    if (producerDestinations != null) __obj.updateDynamic("producerDestinations")(producerDestinations)
    __obj.asInstanceOf[Monitoring]
  }
}

