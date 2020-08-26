package typings.ejWebAll.ej.ListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldSettings extends js.Object {
  /** Defines the HTML attributes such as id, class, styles for the specific list item.
    */
  var attributes: js.UndefOr[js.Any] = js.native
  /** Defines the specific field name which contains Boolean values to specify whether the list items to be checked by default or not.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /** Defines the specific field name which contains id values for the list items.
    */
  var id: js.UndefOr[String] = js.native
  /** Defines the class name for image in that specific list items.
    */
  var imageClass: js.UndefOr[String] = js.native
  /** Defines the URL for the image to be displayed in the list item.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /** To trigger the mousedown event for specific list items.
    */
  var mouseDown: js.UndefOr[String] = js.native
  /** To trigger the mouseup event for specific list items.
    */
  var mouseUP: js.UndefOr[String] = js.native
  /** Defines the URL to be navigated while clicking the list item.
    */
  var navigateUrl: js.UndefOr[String] = js.native
  /** To define the child level of list items inside the parent items.
    */
  var parentPrimaryKey: js.UndefOr[String] = js.native
  /** Specifies whether to retain the selection of the list item.
    */
  var persistSelection: js.UndefOr[Boolean] = js.native
  /** Specifies whether to prevent the selection of the list item.
    */
  var preventSelection: js.UndefOr[Boolean] = js.native
  /** To define the first level of list items.
    */
  var primaryKey: js.UndefOr[String] = js.native
  /** Defines the specific field name in the data source to load the list with data.
    */
  var text: js.UndefOr[String] = js.native
}

object FieldSettings {
  @scala.inline
  def apply(): FieldSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldSettings]
  }
  @scala.inline
  implicit class FieldSettingsOps[Self <: FieldSettings] (val x: Self) extends AnyVal {
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
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImageClass(value: String): Self = this.set("imageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageClass: Self = this.set("imageClass", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setMouseDown(value: String): Self = this.set("mouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseDown: Self = this.set("mouseDown", js.undefined)
    @scala.inline
    def setMouseUP(value: String): Self = this.set("mouseUP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseUP: Self = this.set("mouseUP", js.undefined)
    @scala.inline
    def setNavigateUrl(value: String): Self = this.set("navigateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigateUrl: Self = this.set("navigateUrl", js.undefined)
    @scala.inline
    def setParentPrimaryKey(value: String): Self = this.set("parentPrimaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentPrimaryKey: Self = this.set("parentPrimaryKey", js.undefined)
    @scala.inline
    def setPersistSelection(value: Boolean): Self = this.set("persistSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistSelection: Self = this.set("persistSelection", js.undefined)
    @scala.inline
    def setPreventSelection(value: Boolean): Self = this.set("preventSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventSelection: Self = this.set("preventSelection", js.undefined)
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

