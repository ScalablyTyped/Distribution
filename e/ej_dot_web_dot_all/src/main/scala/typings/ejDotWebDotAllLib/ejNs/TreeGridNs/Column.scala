package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Column extends js.Object {
  /** Enables/disables cell selection.
               * @Default {false}
               */
  var allowCellSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to edit a row or cell.
               * @Default {false}
               */
  var allowEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to filter the rows based on this column.
               * @Default {false}
               */
  var allowFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the blanks option in ejDropDownList mapped in TreeGrid column
               * @Default {true}
               */
  var allowFilteringBlankContent: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to freeze/unfreeze the columns
               * @Default {false}
               */
  var allowFreezing: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to sort the rows based on this column/field.
               * @Default {false}
               */
  var allowSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the template ID or the template string of the AngularJS script element to enable column template for a column.
               */
  var angularTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the clip mode for TreeGrid cell as ellipsis or clipped content(both header and content)
               * @Default {ej.TreeGrid.ClipMode.Clip}
               */
  var clipMode: js.UndefOr[ClipMode | java.lang.String] = js.undefined
  /** Gets or sets an object to define a command column in TreeGrid.
               * @Default {[]}
               */
  var commands: js.UndefOr[js.Array[ColumnsCommand]] = js.undefined
  /** Gets or sets a value that indicates to display a column value as checkbox or string
               * @Default {false}
               */
  var displayAsCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /** To bind the dropdown data for TreeGrid column mapped with ejDropDownList
               */
  var dropdownData: js.UndefOr[java.lang.String] = js.undefined
  /** To customize the ej controls defined in TreeGrid column with their native property.
               */
  var editParams: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a template that displays a custom editor for editing the column values.
               * @Default {null}
               */
  var editTemplate: js.UndefOr[js.Any] = js.undefined
  /** Specifies the edit type of the column.
               * @Default {ej.TreeGrid.EditingType.String}
               */
  var editType: js.UndefOr[EditingType | java.lang.String] = js.undefined
  /** Specifies the name of the field from the dataSource to bind with this column.
               */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the type of the editor control to be used to filter the rows.
               * @Default {ej.TreeGrid.EditingType.String}
               */
  var filterEditType: js.UndefOr[EditingType | java.lang.String] = js.undefined
  /** Gets or sets a value to render either excel or menu filtering in TreeGrid column filtering.
               * @Default {null}
               */
  var filterType: js.UndefOr[FilterType | java.lang.String] = js.undefined
  /** Specifies the display format of a column
               * @Default {null}
               */
  var format: js.UndefOr[js.Any] = js.undefined
  /** Specifies the header template value for the column header
               */
  var headerTemplateID: js.UndefOr[java.lang.String] = js.undefined
  /** Header text of the column.
               * @Default {null}
               */
  var headerText: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the alignment of the column header text
               * @Default {ej.TextAlign.Left}
               */
  var headerTextAlign: js.UndefOr[ejDotWebDotAllLib.ejNs.TextAlign | java.lang.String] = js.undefined
  /** Sets the tooltip template for the column header
               * @Default {null}
               */
  var headerTooltip: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether the column is frozen
               * @Default {false}
               */
  var isFrozen: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the column is a template column
               * @Default {false}
               */
  var isTemplateColumn: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets the priority value of the column. It is used to show/hide TreeGrid columns in responsive mode.
               * @Default {-1}
               */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /** Enables or disables the checkbox visibility in a column for checkbox selection.
               * @Default {false}
               */
  var showCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /** We can include or exclude particular column from column visibility list in column menu.
               * @Default {true}
               */
  var showInColumnChooser: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the template string of the script element to enable column template for a column.
               */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the template ID of the script element to enable column template for a column.
               */
  var templateID: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text alignment for the column
               * @Default {ej.TextAlign.Left}
               */
  var textAlign: js.UndefOr[ejDotWebDotAllLib.ejNs.TextAlign | java.lang.String] = js.undefined
  /** Sets the tooltip template for the specific column.
               * @Default {null}
               */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
  /** specifies the conditions for saving data to the database while adding or editing the fields.
               */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Controls the visibility of the column.
               * @Default {true}
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value for TreeGrid column width
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

