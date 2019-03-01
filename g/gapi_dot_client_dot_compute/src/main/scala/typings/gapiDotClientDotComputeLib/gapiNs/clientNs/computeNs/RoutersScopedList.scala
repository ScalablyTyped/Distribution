package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutersScopedList extends js.Object {
  /** List of routers contained in this scope. */
  var routers: js.UndefOr[js.Array[Router]] = js.undefined
  /** Informational warning which replaces the list of routers when the list is empty. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Code] = js.undefined
}

object RoutersScopedList {
  @scala.inline
  def apply(routers: js.Array[Router] = null, warning: gapiDotClientDotComputeLib.Anon_Code = null): RoutersScopedList = {
    val __obj = js.Dynamic.literal()
    if (routers != null) __obj.updateDynamic("routers")(routers)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[RoutersScopedList]
  }
}

