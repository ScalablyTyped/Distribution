package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUrls extends js.Object {
  var apiUrl: js.UndefOr[String] = js.native
  var browserUrl: js.UndefOr[String] = js.native
}

object FileUrls {
  @scala.inline
  def apply(): FileUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUrls]
  }
  @scala.inline
  implicit class FileUrlsOps[Self <: FileUrls] (val x: Self) extends AnyVal {
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

