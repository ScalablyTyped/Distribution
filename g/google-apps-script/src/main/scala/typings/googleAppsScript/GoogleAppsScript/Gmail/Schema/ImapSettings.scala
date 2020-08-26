package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImapSettings extends js.Object {
  var autoExpunge: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var expungeBehavior: js.UndefOr[String] = js.native
  var maxFolderSize: js.UndefOr[Double] = js.native
}

object ImapSettings {
  @scala.inline
  def apply(): ImapSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImapSettings]
  }
  @scala.inline
  implicit class ImapSettingsOps[Self <: ImapSettings] (val x: Self) extends AnyVal {
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
    def setAutoExpunge(value: Boolean): Self = this.set("autoExpunge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoExpunge: Self = this.set("autoExpunge", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setExpungeBehavior(value: String): Self = this.set("expungeBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpungeBehavior: Self = this.set("expungeBehavior", js.undefined)
    @scala.inline
    def setMaxFolderSize(value: Double): Self = this.set("maxFolderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFolderSize: Self = this.set("maxFolderSize", js.undefined)
  }
  
}

