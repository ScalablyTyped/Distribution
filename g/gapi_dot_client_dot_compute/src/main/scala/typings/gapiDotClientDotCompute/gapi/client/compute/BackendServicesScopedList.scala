package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClientDotCompute.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServicesScopedList extends js.Object {
  /** List of BackendServices contained in this scope. */
  var backendServices: js.UndefOr[js.Array[BackendService]] = js.undefined
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Anon_Code] = js.undefined
}

object BackendServicesScopedList {
  @scala.inline
  def apply(backendServices: js.Array[BackendService] = null, warning: Anon_Code = null): BackendServicesScopedList = {
    val __obj = js.Dynamic.literal()
    if (backendServices != null) __obj.updateDynamic("backendServices")(backendServices.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendServicesScopedList]
  }
}

