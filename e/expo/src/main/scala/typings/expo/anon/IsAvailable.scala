package typings.expo.anon

import typings.expo.expoBooleans.`false`
import typings.expo.updatesMod.UpdateCheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsAvailable extends UpdateCheckResult {
  var isAvailable: `false`
}

object IsAvailable {
  @scala.inline
  def apply(isAvailable: `false`): IsAvailable = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAvailable]
  }
}

