package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$StatefulPolicy extends js.Object {
  var preservedResources: js.UndefOr[Schema$StatefulPolicyPreservedResources] = js.native
  var preservedState: js.UndefOr[Schema$StatefulPolicyPreservedState] = js.native
}

object Schema$StatefulPolicy {
  @scala.inline
  def apply(
    preservedResources: Schema$StatefulPolicyPreservedResources = null,
    preservedState: Schema$StatefulPolicyPreservedState = null
  ): Schema$StatefulPolicy = {
    val __obj = js.Dynamic.literal()
    if (preservedResources != null) __obj.updateDynamic("preservedResources")(preservedResources.asInstanceOf[js.Any])
    if (preservedState != null) __obj.updateDynamic("preservedState")(preservedState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StatefulPolicy]
  }
}

