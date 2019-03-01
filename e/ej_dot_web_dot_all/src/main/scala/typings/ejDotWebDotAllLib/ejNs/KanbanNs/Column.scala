package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /** To enable/disable allowDrag for specific column wise.
    * @Default {true}
    */
  var allowDrag: js.UndefOr[scala.Boolean] = js.undefined
  /** To enable/disable allowDrop for specific column wise.
    * @Default {true}
    */
  var allowDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** To customize the column level constraints with minimum ,maximum limit validation.
    * @Default {Object}
    */
  var constraints: js.UndefOr[ColumnsConstraints] = js.undefined
  /** Gets or sets a value that indicates to add the template within the header element.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified columns header text.
    * @Default {null}
    */
  var headerText: js.UndefOr[java.lang.String] = js.undefined
  /** To set column collapse or expand state
    * @Default {false}
    */
  var isCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified columns key.
    * @Default {null}
    */
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Gets or sets an object that indicates whether to show add new button.
    * @Default {false}
    */
  var showAddButton: js.UndefOr[scala.Boolean] = js.undefined
  /** To customize the totalCount properties.
    * @Default {Object}
    */
  var totalCount: js.UndefOr[ColumnsTotalCount] = js.undefined
  /** Gets or sets an object that indicates to set specific column visibility.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified columns width.
    * @Default {null}
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    allowDrag: js.UndefOr[scala.Boolean] = js.undefined,
    allowDrop: js.UndefOr[scala.Boolean] = js.undefined,
    constraints: ColumnsConstraints = null,
    headerTemplate: java.lang.String = null,
    headerText: java.lang.String = null,
    isCollapsed: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String | scala.Double = null,
    showAddButton: js.UndefOr[scala.Boolean] = js.undefined,
    totalCount: ColumnsTotalCount = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String | scala.Double = null
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag)
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate)
    if (headerText != null) __obj.updateDynamic("headerText")(headerText)
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(showAddButton)) __obj.updateDynamic("showAddButton")(showAddButton)
    if (totalCount != null) __obj.updateDynamic("totalCount")(totalCount)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

