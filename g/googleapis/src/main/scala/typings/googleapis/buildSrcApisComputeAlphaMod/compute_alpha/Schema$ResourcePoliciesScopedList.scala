package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ResourcePoliciesScopedList extends js.Object {
  /**
    * A list of resourcePolicies contained in this scope.
    */
  var resourcePolicies: js.UndefOr[js.Array[Schema$ResourcePolicy]] = js.native
  /**
    * Informational warning which replaces the list of resourcePolicies when
    * the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$ResourcePoliciesScopedList {
  @scala.inline
  def apply(resourcePolicies: js.Array[Schema$ResourcePolicy] = null, warning: Anon_Code = null): Schema$ResourcePoliciesScopedList = {
    val __obj = js.Dynamic.literal()
    if (resourcePolicies != null) __obj.updateDynamic("resourcePolicies")(resourcePolicies.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourcePoliciesScopedList]
  }
}

