package typings.dwt.webTwainAcquireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Version extends js.Object {
  var Country: js.UndefOr[Double] = js.native
  var Info: js.UndefOr[String] = js.native
  var Language: js.UndefOr[Double] = js.native
  var MajorNum: js.UndefOr[Double] = js.native
  var MinorNum: js.UndefOr[Double] = js.native
}

object Version {
  @scala.inline
  def apply(): Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Version]
  }
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
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
    def setCountry(value: Double): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    @scala.inline
    def setInfo(value: String): Self = this.set("Info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("Info", js.undefined)
    @scala.inline
    def setLanguage(value: Double): Self = this.set("Language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("Language", js.undefined)
    @scala.inline
    def setMajorNum(value: Double): Self = this.set("MajorNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorNum: Self = this.set("MajorNum", js.undefined)
    @scala.inline
    def setMinorNum(value: Double): Self = this.set("MinorNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorNum: Self = this.set("MinorNum", js.undefined)
  }
  
}

