package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BackendServicesScopedList extends js.Object {
  /**
    * A list of BackendServices contained in this scope.
    */
  var backendServices: js.UndefOr[js.Array[Schema$BackendService]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$BackendServicesScopedList {
  @scala.inline
  def apply(backendServices: js.Array[Schema$BackendService] = null, warning: Anon_Code = null): Schema$BackendServicesScopedList = {
    val __obj = js.Dynamic.literal()
    if (backendServices != null) __obj.updateDynamic("backendServices")(backendServices.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BackendServicesScopedList]
  }
}

