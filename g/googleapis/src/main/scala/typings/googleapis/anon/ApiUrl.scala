package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiUrl extends js.Object {
  var apiUrl: js.UndefOr[String] = js.native
  var browserUrl: js.UndefOr[String] = js.native
}

object ApiUrl {
  @scala.inline
  def apply(): ApiUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiUrl]
  }
  @scala.inline
  implicit class ApiUrlOps[Self <: ApiUrl] (val x: Self) extends AnyVal {
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
    def setApiUrl(value: String): Self = this.set("apiUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiUrl: Self = this.set("apiUrl", js.undefined)
    @scala.inline
    def setBrowserUrl(value: String): Self = this.set("browserUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserUrl: Self = this.set("browserUrl", js.undefined)
  }
  
}

