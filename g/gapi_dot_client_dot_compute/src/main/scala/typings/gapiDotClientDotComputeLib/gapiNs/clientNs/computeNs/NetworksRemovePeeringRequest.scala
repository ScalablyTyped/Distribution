package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworksRemovePeeringRequest extends js.Object {
  /** Name of the peering, which should conform to RFC1035. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object NetworksRemovePeeringRequest {
  @scala.inline
  def apply(name: java.lang.String = null): NetworksRemovePeeringRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[NetworksRemovePeeringRequest]
  }
}

