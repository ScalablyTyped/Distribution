package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Explicit extends js.Object {
  /** The values must be monotonically increasing. */
  var bounds: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Explicit {
  @scala.inline
  def apply(bounds: js.Array[scala.Double] = null): Explicit = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    __obj.asInstanceOf[Explicit]
  }
}

