package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicScaling extends js.Object {
  /** Duration of time after the last request that an instance must wait before the instance is shut down. */
  var idleTimeout: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of instances to create for this version. */
  var maxInstances: js.UndefOr[scala.Double] = js.undefined
}

object BasicScaling {
  @scala.inline
  def apply(idleTimeout: java.lang.String = null, maxInstances: scala.Int | scala.Double = null): BasicScaling = {
    val __obj = js.Dynamic.literal()
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout)
    if (maxInstances != null) __obj.updateDynamic("maxInstances")(maxInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicScaling]
  }
}

