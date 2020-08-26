package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Collection.ArchiveCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminGroupsMigration_ extends js.Object {
  var Archive: js.UndefOr[ArchiveCollection] = js.native
}

object AdminGroupsMigration_ {
  @scala.inline
  def apply(): AdminGroupsMigration_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminGroupsMigration_]
  }
  @scala.inline
  implicit class AdminGroupsMigration_Ops[Self <: AdminGroupsMigration_] (val x: Self) extends AnyVal {
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
    def setArchive(value: ArchiveCollection): Self = this.set("Archive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchive: Self = this.set("Archive", js.undefined)
  }
  
}

