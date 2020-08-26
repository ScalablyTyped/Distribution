package typings.gapiClientAppsactivity.gapi.client.appsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rename extends js.Object {
  /** The new title. */
  var newTitle: js.UndefOr[String] = js.native
  /** The old title. */
  var oldTitle: js.UndefOr[String] = js.native
}

object Rename {
  @scala.inline
  def apply(): Rename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rename]
  }
  @scala.inline
  implicit class RenameOps[Self <: Rename] (val x: Self) extends AnyVal {
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
    def setNewTitle(value: String): Self = this.set("newTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewTitle: Self = this.set("newTitle", js.undefined)
    @scala.inline
    def setOldTitle(value: String): Self = this.set("oldTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldTitle: Self = this.set("oldTitle", js.undefined)
  }
  
}

