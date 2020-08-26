package typings.envCi.mod

import typings.envCi.envCiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CiEnvBase extends js.Object {
  var isCi: `true` = js.native
}

object CiEnvBase {
  @scala.inline
  def apply(isCi: `true`): CiEnvBase = {
    val __obj = js.Dynamic.literal(isCi = isCi.asInstanceOf[js.Any])
    __obj.asInstanceOf[CiEnvBase]
  }
  @scala.inline
  implicit class CiEnvBaseOps[Self <: CiEnvBase] (val x: Self) extends AnyVal {
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
    def setIsCi(value: `true`): Self = this.set("isCi", value.asInstanceOf[js.Any])
  }
  
}

