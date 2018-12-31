package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

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

