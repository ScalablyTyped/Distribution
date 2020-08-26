package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridInlineEditing extends js.Object {
  var managementColumn: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String] = js.native
}

object GridInlineEditing {
  @scala.inline
  def apply(): GridInlineEditing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridInlineEditing]
  }
  @scala.inline
  implicit class GridInlineEditingOps[Self <: GridInlineEditing] (val x: Self) extends AnyVal {
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
    def setManagementColumn(value: Boolean): Self = this.set("managementColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagementColumn: Self = this.set("managementColumn", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

