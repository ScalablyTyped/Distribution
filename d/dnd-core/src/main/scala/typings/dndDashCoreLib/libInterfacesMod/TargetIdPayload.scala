package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetIdPayload extends js.Object {
  var targetId: java.lang.String
}

object TargetIdPayload {
  @scala.inline
  def apply(targetId: java.lang.String): TargetIdPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("targetId")(targetId)
    __obj.asInstanceOf[TargetIdPayload]
  }
}

