package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutersScopedList extends js.Object {
  /** List of routers contained in this scope. */
  var routers: js.UndefOr[js.Array[Router]] = js.undefined
  /** Informational warning which replaces the list of routers when the list is empty. */
  var warning: js.UndefOr[AnonCode] = js.undefined
}

object RoutersScopedList {
  @scala.inline
  def apply(routers: js.Array[Router] = null, warning: AnonCode = null): RoutersScopedList = {
    val __obj = js.Dynamic.literal()
    if (routers != null) __obj.updateDynamic("routers")(routers.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutersScopedList]
  }
}

