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

