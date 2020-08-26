package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  /** To enable/disable allowDrag for specific column wise.
    * @Default {true}
    */
  var allowDrag: js.UndefOr[Boolean] = js.native
  /** To enable/disable allowDrop for specific column wise.
    * @Default {true}
    */
  var allowDrop: js.UndefOr[Boolean] = js.native
  /** To customize the column level constraints with minimum ,maximum limit validation.
    * @Default {Object}
    */
  var constraints: js.UndefOr[ColumnsConstraints] = js.native
  /** Gets or sets a value that indicates to add the template within the header element.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[String] = js.native
  /** Gets or sets an object that indicates to render the Kanban with specified columns header text.
    * @Default {null}
    */
  var headerText: js.UndefOr[String] = js.native
  /** To set column collapse or expand state
    * @Default {false}
    */
  var isCollapsed: js.UndefOr[Boolean] = js.native
  /** Gets or sets an object that indicates to render the Kanban with specified columns key.
    * @Default {null}
    */
  var key: js.UndefOr[String | Double] = js.native
  /** Gets or sets an object that indicates whether to show add new button.
    * @Default {false}
    */
  var showAddButton: js.UndefOr[Boolean] = js.native
  /** To customize the totalCount properties.
    * @Default {Object}
    */
  var totalCount: js.UndefOr[ColumnsTotalCount] = js.native
  /** Gets or sets an object that indicates to set specific column visibility.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Gets or sets an object that indicates to render the Kanban with specified columns width.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object Column {
  @scala.inline
  def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
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
    def setAllowDrag(value: Boolean): Self = this.set("allowDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDrag: Self = this.set("allowDrag", js.undefined)
    @scala.inline
    def setAllowDrop(value: Boolean): Self = this.set("allowDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDrop: Self = this.set("allowDrop", js.undefined)
    @scala.inline
    def setConstraints(value: ColumnsConstraints): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    @scala.inline
    def setHeaderTemplate(value: String): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    @scala.inline
    def setIsCollapsed(value: Boolean): Self = this.set("isCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCollapsed: Self = this.set("isCollapsed", js.undefined)
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setShowAddButton(value: Boolean): Self = this.set("showAddButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAddButton: Self = this.set("showAddButton", js.undefined)
    @scala.inline
    def setTotalCount(value: ColumnsTotalCount): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

