package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendRule extends js.Object {
  /** The address of the API backend. */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of seconds to wait for a response from a request.  The default
    * deadline for gRPC is infinite (no deadline) and HTTP requests is 5 seconds.
    */
  var deadline: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum deadline in seconds needed for this method. Calls having deadline
    * value lower than this will be rejected.
    */
  var minDeadline: js.UndefOr[scala.Double] = js.undefined
  /**
    * Selects the methods to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

object BackendRule {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    deadline: scala.Int | scala.Double = null,
    minDeadline: scala.Int | scala.Double = null,
    selector: java.lang.String = null
  ): BackendRule = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    if (minDeadline != null) __obj.updateDynamic("minDeadline")(minDeadline.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[BackendRule]
  }
}

