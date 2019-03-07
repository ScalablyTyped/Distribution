package typings
package dndDashCoreLib.libCjsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[Payload] extends js.Object {
  var payload: Payload
  var `type`: java.lang.String
}

object Action {
  @scala.inline
  def apply[Payload](payload: Payload, `type`: java.lang.String): Action[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Action[Payload]]
  }
}

