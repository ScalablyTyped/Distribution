package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InventoryPickup extends js.Object {
  /**
               * Whether store pickup is available for this offer and whether the pickup option should be shown as buy, reserve, or not supported. Only supported for
               * local inventory. Unless the value is "not supported", must be submitted together with pickupSla.
               */
  var pickupMethod: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The expected date that an order will be ready for pickup, relative to when the order is placed. Only supported for local inventory. Must be submitted
               * together with pickupMethod.
               */
  var pickupSla: js.UndefOr[java.lang.String] = js.undefined
}

