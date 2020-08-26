package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Refreshtoken extends js.Object {
  var refresh_token: js.UndefOr[String] = js.native
}

object Refreshtoken {
  @scala.inline
  def apply(): Refreshtoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Refreshtoken]
  }
  @scala.inline
  implicit class RefreshtokenOps[Self <: Refreshtoken] (val x: Self) extends AnyVal {
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
    def setRefresh_token(value: String): Self = this.set("refresh_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh_token: Self = this.set("refresh_token", js.undefined)
  }
  
}

