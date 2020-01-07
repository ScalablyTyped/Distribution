package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RoutersScopedList extends js.Object {
  /**
    * A list of routers contained in this scope.
    */
  var routers: js.UndefOr[js.Array[Schema$Router]] = js.native
  /**
    * Informational warning which replaces the list of routers when the list is
    * empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$RoutersScopedList {
  @scala.inline
  def apply(routers: js.Array[Schema$Router] = null, warning: Anon_Code = null): Schema$RoutersScopedList = {
    val __obj = js.Dynamic.literal()
    if (routers != null) __obj.updateDynamic("routers")(routers.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RoutersScopedList]
  }
}

