package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceReference extends js.Object {
  /** The URL for a specific instance. */
  var instance: js.UndefOr[java.lang.String] = js.undefined
}

object InstanceReference {
  @scala.inline
  def apply(instance: java.lang.String = null): InstanceReference = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance)
    __obj.asInstanceOf[InstanceReference]
  }
}

