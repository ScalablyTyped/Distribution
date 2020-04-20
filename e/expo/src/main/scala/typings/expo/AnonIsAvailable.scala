package typings.expo

import typings.expo.expoBooleans.`false`
import typings.expo.updatesMod.UpdateCheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsAvailable extends UpdateCheckResult {
  var isAvailable: `false`
}

object AnonIsAvailable {
  @scala.inline
  def apply(isAvailable: `false`): AnonIsAvailable = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsAvailable]
  }
}

