package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeSettings extends js.Object {
  /** Header text for iFrames for this site. Must be less than or equal to 2000 characters long. */
  var iFrameFooter: js.UndefOr[String] = js.native
  /** Header text for iFrames for this site. Must be less than or equal to 2000 characters long. */
  var iFrameHeader: js.UndefOr[String] = js.native
}

object CreativeSettings {
  @scala.inline
  def apply(): CreativeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeSettings]
  }
  @scala.inline
  implicit class CreativeSettingsOps[Self <: CreativeSettings] (val x: Self) extends AnyVal {
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
    def setIFrameFooter(value: String): Self = this.set("iFrameFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIFrameFooter: Self = this.set("iFrameFooter", js.undefined)
    @scala.inline
    def setIFrameHeader(value: String): Self = this.set("iFrameHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIFrameHeader: Self = this.set("iFrameHeader", js.undefined)
  }
  
}

