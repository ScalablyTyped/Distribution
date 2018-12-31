package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

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

