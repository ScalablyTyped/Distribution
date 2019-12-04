package typings.dndDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  var payload: Anon_ClientOffset
  var `type`: String
}

object Anon_Payload {
  @scala.inline
  def apply(payload: Anon_ClientOffset, `type`: String): Anon_Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Payload]
  }
}

