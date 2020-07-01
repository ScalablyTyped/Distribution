package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRoutersScopedList extends js.Object {
  /**
    * A list of routers contained in this scope.
    */
  var routers: js.UndefOr[js.Array[SchemaRouter]] = js.native
  /**
    * Informational warning which replaces the list of routers when the list is
    * empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaRoutersScopedList {
  @scala.inline
  def apply(routers: js.Array[SchemaRouter] = null, warning: Code = null): SchemaRoutersScopedList = {
    val __obj = js.Dynamic.literal()
    if (routers != null) __obj.updateDynamic("routers")(routers.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoutersScopedList]
  }
}

