package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompanionSetting extends js.Object {
  var companionsDisabled: js.UndefOr[Boolean] = js.native
  var enabledSizes: js.UndefOr[js.Array[Size]] = js.native
  var imageOnly: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
}

object CompanionSetting {
  @scala.inline
  def apply(): CompanionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompanionSetting]
  }
  @scala.inline
  implicit class CompanionSettingOps[Self <: CompanionSetting] (val x: Self) extends AnyVal {
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
    def setCompanionsDisabled(value: Boolean): Self = this.set("companionsDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanionsDisabled: Self = this.set("companionsDisabled", js.undefined)
    @scala.inline
    def setEnabledSizesVarargs(value: Size*): Self = this.set("enabledSizes", js.Array(value :_*))
    @scala.inline
    def setEnabledSizes(value: js.Array[Size]): Self = this.set("enabledSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledSizes: Self = this.set("enabledSizes", js.undefined)
    @scala.inline
    def setImageOnly(value: Boolean): Self = this.set("imageOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageOnly: Self = this.set("imageOnly", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

