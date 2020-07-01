package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResourcePoliciesScopedList extends js.Object {
  /**
    * A list of resourcePolicies contained in this scope.
    */
  var resourcePolicies: js.UndefOr[js.Array[SchemaResourcePolicy]] = js.native
  /**
    * Informational warning which replaces the list of resourcePolicies when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaResourcePoliciesScopedList {
  @scala.inline
  def apply(resourcePolicies: js.Array[SchemaResourcePolicy] = null, warning: Code = null): SchemaResourcePoliciesScopedList = {
    val __obj = js.Dynamic.literal()
    if (resourcePolicies != null) __obj.updateDynamic("resourcePolicies")(resourcePolicies.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourcePoliciesScopedList]
  }
}

