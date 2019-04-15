package typings
package fluxDashStandardDashActionLib.fluxDashStandardDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fluxDashStandardDashActionLib.fluxDashStandardDashActionMod._FluxStandardActionAuto because Already inherited */ trait FluxStandardActionWithPayload[Type /* <: java.lang.String */, Payload, Meta] extends FluxStandardAction[Type, Payload, Meta] {
  /**
    * The required `payload` property MAY be any type of value.
    * It represents the payload of the action.
    * Any information about the action that is not the type or status of the action should be part of the `payload` field.
    * By convention, if `error` is `true`, the `payload` SHOULD be an error object.
    * This is akin to rejecting a promise with an error object.
    */
  @JSName("payload")
  var payload_FluxStandardActionWithPayload: Payload
}

object FluxStandardActionWithPayload {
  @scala.inline
  def apply[Type /* <: java.lang.String */, Payload, Meta](payload: Payload, `type`: Type, error: js.UndefOr[scala.Boolean] = js.undefined, meta: Meta = null): FluxStandardActionWithPayload[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluxStandardActionWithPayload[Type, Payload, Meta]]
  }
}

