package typings.fluxStandardAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _FluxStandardActionAuto[Type /* <: String */, Payload, Meta] extends js.Object
object _FluxStandardActionAuto {
  
  @scala.inline
  def FluxStandardActionWithPayload[Type /* <: String */, Payload, Meta](payload: Payload, `type`: Type): _FluxStandardActionAuto[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FluxStandardActionAuto[Type, Payload, Meta]]
  }
  
  @scala.inline
  def FluxStandardActionWithMeta[Type /* <: String */, Payload, Meta](meta: Meta, `type`: Type): _FluxStandardActionAuto[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FluxStandardActionAuto[Type, Payload, Meta]]
  }
  
  @scala.inline
  def FluxStandardAction[Type /* <: String */, Payload, Meta](`type`: Type): _FluxStandardActionAuto[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FluxStandardActionAuto[Type, Payload, Meta]]
  }
}
