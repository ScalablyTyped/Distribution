package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropPayload extends js.Object {
  var dropResult: js.Any
}

object DropPayload {
  @scala.inline
  def apply(dropResult: js.Any): DropPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dropResult")(dropResult)
    __obj.asInstanceOf[DropPayload]
  }
}

