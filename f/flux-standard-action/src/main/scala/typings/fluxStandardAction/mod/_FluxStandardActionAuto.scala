package typings.fluxStandardAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _FluxStandardActionAuto[Type /* <: String */, Payload, Meta] extends js.Object

object _FluxStandardActionAuto {
  @scala.inline
  def FluxStandardActionWithPayload[/* <: java.lang.String */ Type, Payload, Meta](payload: Payload, `type`: Type): _FluxStandardActionAuto[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FluxStandardActionAuto[Type, Payload, Meta]]
  }
  @scala.inline
  def FluxStandardActionWithMeta[/* <: java.lang.String */ Type, Payload, Meta](meta: Meta, `type`: Type): _FluxStandardActionAuto[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FluxStandardActionAuto[Type, Payload, Meta]]
  }
  @scala.inline
  def FluxStandardAction[/* <: java.lang.String */ Type, Payload, Meta](`type`: Type): _FluxStandardActionAuto[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FluxStandardActionAuto[Type, Payload, Meta]]
  }
}

