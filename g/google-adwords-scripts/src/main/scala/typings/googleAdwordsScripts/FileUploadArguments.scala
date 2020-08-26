package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploadArguments extends js.Object {
  var fileLocale: js.UndefOr[String] = js.native
  var moneyInMicros: js.UndefOr[Boolean] = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object FileUploadArguments {
  @scala.inline
  def apply(): FileUploadArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadArguments]
  }
  @scala.inline
  implicit class FileUploadArgumentsOps[Self <: FileUploadArguments] (val x: Self) extends AnyVal {
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
    def setFileLocale(value: String): Self = this.set("fileLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileLocale: Self = this.set("fileLocale", js.undefined)
    @scala.inline
    def setMoneyInMicros(value: Boolean): Self = this.set("moneyInMicros", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoneyInMicros: Self = this.set("moneyInMicros", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

