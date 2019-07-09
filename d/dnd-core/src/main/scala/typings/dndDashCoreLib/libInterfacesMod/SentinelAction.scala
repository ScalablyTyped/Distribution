package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentinelAction extends js.Object {
  var `type`: Identifier
}

object SentinelAction {
  @scala.inline
  def apply(`type`: Identifier): SentinelAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentinelAction]
  }
}

