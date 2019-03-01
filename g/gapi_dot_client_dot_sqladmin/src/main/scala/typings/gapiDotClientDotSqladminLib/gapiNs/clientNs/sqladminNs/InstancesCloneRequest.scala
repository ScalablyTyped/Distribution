package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesCloneRequest extends js.Object {
  /** Contains details about the clone operation. */
  var cloneContext: js.UndefOr[CloneContext] = js.undefined
}

object InstancesCloneRequest {
  @scala.inline
  def apply(cloneContext: CloneContext = null): InstancesCloneRequest = {
    val __obj = js.Dynamic.literal()
    if (cloneContext != null) __obj.updateDynamic("cloneContext")(cloneContext)
    __obj.asInstanceOf[InstancesCloneRequest]
  }
}

