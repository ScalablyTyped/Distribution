package typings
package fluxDashStandardDashActionLib.fluxDashStandardDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fluxDashStandardDashActionLib.fluxDashStandardDashActionMod._FluxStandardActionAuto because Already inherited */ trait FluxStandardActionWithMeta[Type /* <: java.lang.String */, Payload, Meta] extends FluxStandardAction[Type, Payload, Meta] {
  /**
    * The required `meta` property MAY be any type of value.
    * It is intended for any extra information that is not part of the payload.
    */
  @JSName("meta")
  var meta_FluxStandardActionWithMeta: Meta
}

object FluxStandardActionWithMeta {
  @scala.inline
  def apply[Type /* <: java.lang.String */, Payload, Meta](meta: Meta, `type`: Type, error: js.UndefOr[scala.Boolean] = js.undefined, payload: Payload = null): FluxStandardActionWithMeta[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluxStandardActionWithMeta[Type, Payload, Meta]]
  }
}

