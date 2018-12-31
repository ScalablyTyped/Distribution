package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageRule extends js.Object {
  /** True, if the method allows unregistered calls; false otherwise. */
  var allowUnregisteredCalls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Selects the methods to which this rule applies. Use '&#42;' to indicate all
    * methods in all APIs.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * True, if the method should skip service control. If so, no control plane
    * feature (like quota and billing) will be enabled.
    */
  var skipServiceControl: js.UndefOr[scala.Boolean] = js.undefined
}

