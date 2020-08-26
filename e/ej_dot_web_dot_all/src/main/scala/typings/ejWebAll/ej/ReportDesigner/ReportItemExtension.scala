package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportItemExtension extends js.Object {
  /** Gets or sets the category name for the report item.
    * @Default {empty}
    */
  var category: js.UndefOr[String] = js.native
  /** Gets or sets the class name of the report item.
    * @Default {empty}
    */
  var className: js.UndefOr[String] = js.native
  /** Gets or sets the name for custom report item to display in the widgets pane tile.
    * @Default {empty}
    */
  var displayName: js.UndefOr[String] = js.native
  /** Gets or sets the image class name to load image in widgets pane tile.
    * @Default {empty}
    */
  var imageClass: js.UndefOr[String] = js.native
  /** Gets or sets the name for the report item.
    * @Default {empty}
    */
  var name: js.UndefOr[String] = js.native
  /** Gets information to provide content for custom report item tooltip.
    * @Default {null}
    */
  var toolTip: js.UndefOr[js.Any] = js.native
}

object ReportItemExtension {
  @scala.inline
  def apply(): ReportItemExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportItemExtension]
  }
  @scala.inline
  implicit class ReportItemExtensionOps[Self <: ReportItemExtension] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setImageClass(value: String): Self = this.set("imageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageClass: Self = this.set("imageClass", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setToolTip(value: js.Any): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolTip: Self = this.set("toolTip", js.undefined)
  }
  
}

