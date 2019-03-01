package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServicesScopedList extends js.Object {
  /** List of BackendServices contained in this scope. */
  var backendServices: js.UndefOr[js.Array[BackendService]] = js.undefined
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Code] = js.undefined
}

object BackendServicesScopedList {
  @scala.inline
  def apply(
    backendServices: js.Array[BackendService] = null,
    warning: gapiDotClientDotComputeLib.Anon_Code = null
  ): BackendServicesScopedList = {
    val __obj = js.Dynamic.literal()
    if (backendServices != null) __obj.updateDynamic("backendServices")(backendServices)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[BackendServicesScopedList]
  }
}

