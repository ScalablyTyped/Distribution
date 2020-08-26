package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupOption extends js.Object {
  var backupOption: js.UndefOr[Color] = js.native
  var size: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object BackupOption {
  @scala.inline
  def apply(): BackupOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupOption]
  }
  @scala.inline
  implicit class BackupOptionOps[Self <: BackupOption] (val x: Self) extends AnyVal {
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
    def setBackupOption(value: Color): Self = this.set("backupOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupOption: Self = this.set("backupOption", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

