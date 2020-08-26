package typings.envCi.mod

import typings.envCi.envCiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonCiEnv extends CiEnv {
  var branch: js.UndefOr[String] = js.native
  var commit: js.UndefOr[String] = js.native
  var isCi: `false` = js.native
}

object NonCiEnv {
  @scala.inline
  def apply(isCi: `false`): NonCiEnv = {
    val __obj = js.Dynamic.literal(isCi = isCi.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonCiEnv]
  }
  @scala.inline
  implicit class NonCiEnvOps[Self <: NonCiEnv] (val x: Self) extends AnyVal {
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
    def setIsCi(value: `false`): Self = this.set("isCi", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    @scala.inline
    def setCommit(value: String): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
  }
  
}

