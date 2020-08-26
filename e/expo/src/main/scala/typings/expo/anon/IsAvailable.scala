package typings.expo.anon

import typings.expo.expoBooleans.`false`
import typings.expo.updatesMod.UpdateCheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsAvailable extends UpdateCheckResult {
  var isAvailable: `false` = js.native
}

object IsAvailable {
  @scala.inline
  def apply(isAvailable: `false`): IsAvailable = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAvailable]
  }
  @scala.inline
  implicit class IsAvailableOps[Self <: IsAvailable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsAvailable(value: `false`): Self = this.set("isAvailable", value.asInstanceOf[js.Any])
  }
  
}

