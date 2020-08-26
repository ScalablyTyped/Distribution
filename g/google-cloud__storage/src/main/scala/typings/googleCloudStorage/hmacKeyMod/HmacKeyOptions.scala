package typings.googleCloudStorage.hmacKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HmacKeyOptions extends js.Object {
  var projectId: js.UndefOr[String] = js.native
}

object HmacKeyOptions {
  @scala.inline
  def apply(): HmacKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmacKeyOptions]
  }
  @scala.inline
  implicit class HmacKeyOptionsOps[Self <: HmacKeyOptions] (val x: Self) extends AnyVal {
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
  
}

