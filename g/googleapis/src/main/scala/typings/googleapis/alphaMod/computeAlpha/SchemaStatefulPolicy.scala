package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStatefulPolicy extends js.Object {
  var preservedResources: js.UndefOr[SchemaStatefulPolicyPreservedResources] = js.native
  var preservedState: js.UndefOr[SchemaStatefulPolicyPreservedState] = js.native
}

object SchemaStatefulPolicy {
  @scala.inline
  def apply(
    preservedResources: SchemaStatefulPolicyPreservedResources = null,
    preservedState: SchemaStatefulPolicyPreservedState = null
  ): SchemaStatefulPolicy = {
    val __obj = js.Dynamic.literal()
    if (preservedResources != null) __obj.updateDynamic("preservedResources")(preservedResources.asInstanceOf[js.Any])
    if (preservedState != null) __obj.updateDynamic("preservedState")(preservedState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStatefulPolicy]
  }
}

