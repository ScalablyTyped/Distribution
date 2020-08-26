package typings.devextreme.anon

import typings.devextreme.devextremeStrings.details
import typings.devextreme.devextremeStrings.thumbnails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Details extends js.Object {
  var details: js.UndefOr[`3`] = js.native
  var mode: js.UndefOr[details | thumbnails] = js.native
  var showFolders: js.UndefOr[Boolean] = js.native
  var showParentFolder: js.UndefOr[Boolean] = js.native
}

object Details {
  @scala.inline
  def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
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
    def setDetails(value: `3`): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setMode(value: details | thumbnails): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setShowFolders(value: Boolean): Self = this.set("showFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFolders: Self = this.set("showFolders", js.undefined)
    @scala.inline
    def setShowParentFolder(value: Boolean): Self = this.set("showParentFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowParentFolder: Self = this.set("showParentFolder", js.undefined)
  }
  
}

