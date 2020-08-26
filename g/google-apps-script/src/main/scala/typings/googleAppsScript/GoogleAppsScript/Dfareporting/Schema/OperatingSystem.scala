package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystem extends js.Object {
  var dartId: js.UndefOr[String] = js.native
  var desktop: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var mobile: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
}

object OperatingSystem {
  @scala.inline
  def apply(): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystem]
  }
  @scala.inline
  implicit class OperatingSystemOps[Self <: OperatingSystem] (val x: Self) extends AnyVal {
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
    def setDartId(value: String): Self = this.set("dartId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDartId: Self = this.set("dartId", js.undefined)
    @scala.inline
    def setDesktop(value: Boolean): Self = this.set("desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMobile(value: Boolean): Self = this.set("mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

