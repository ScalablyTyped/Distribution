package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Column extends js.Object {
  /** Gets or sets a value that indicates whether to enable editing behavior for particular column.
               * @Default {true}
               */
  var allowEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic filtering behavior for particular column.
               * @Default {true}
               */
  var allowFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic grouping behavior for particular column.
               * @Default {true}
               */
  var allowGrouping: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic resizable for particular column.
               * @Default {true}
               */
  var allowResizing: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic sorting behavior for particular column.
               * @Default {true}
               */
  var allowSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the clip mode for Grid cell as ellipsis or clipped content(both header and content)
               * @Default {ej.Grid.ClipMode.Clip}
               */
  var clipMode: js.UndefOr[ClipMode | java.lang.String] = js.undefined
  /** Gets or sets an object that indicates to define a command column in the grid.
               * @Default {[]}
               */
  var commands: js.UndefOr[js.Array[ColumnsCommand]] = js.undefined
  /** Gets or sets a value that indicates to provide custom CSS for an individual column.
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates the attribute values to the td element of a particular column
               */
  var customAttributes: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates to bind the external datasource to the particular column when column editType as dropdownedit and also it is used to bind the datasource to the
               * foreign key column while editing the grid. //Where data is array of JSON objects of text and value for the drop-down and array of JSON objects for foreign key column.
               * @Default {null}
               */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates to display the specified default value while adding a new record to the grid
               */
  var defaultValue: js.UndefOr[java.lang.String | scala.Double | scala.Boolean | stdLib.Date] = js.undefined
  /** Gets or sets a value that indicates to render the grid content and header with an HTML elements
               * @Default {false}
               */
  var disableHtmlEncode: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to display a column value as checkbox or string
               * @Default {true}
               */
  var displayAsCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to customize ejNumericTextbox of an editable column. See editingType
               */
  var editParams: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a template that displays a custom editor used to edit column values. See editTemplate
               * @Default {null}
               */
  var editTemplate: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates to render the element(based on edit type) for editing the grid record. See editingType
               * @Default {ej.Grid.EditingType.String}
               */
  var editType: js.UndefOr[EditingType | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to groups the column based on its column format.
               * @Default {false}
               */
  var enableGroupByFormat: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to display the columns in the grid mapping with column name of the dataSource.
               */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a template that customize the filter control from default . See filterBarTemplate
               * @Default {null}
               */
  var filterBarTemplate: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates to render the excel or menu filter dialog to the grid columns. See filterType
               * @Default {null}
               */
  var filterType: js.UndefOr[FilterType | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to define foreign key field name of the grid datasource.
               * @Default {null}
               */
  var foreignKeyField: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to bind the field which is in foreign column datasource based on the foreignKeyField
               * @Default {null}
               */
  var foreignKeyValue: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates the format for the text applied on the column
               */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to add the template within the header element of the particular column.
               * @Default {null}
               */
  var headerTemplateID: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to display the title of that particular column.
               */
  var headerText: js.UndefOr[java.lang.String] = js.undefined
  /** This defines the text alignment of a particular column header cell value. See headerTextAlign
               * @Default {null}
               */
  var headerTextAlign: js.UndefOr[ejDotWebDotAllLib.ejNs.TextAlign | java.lang.String] = js.undefined
  /** It accepts the string value and shows the tooltip for the Grid column header.
               * @Default {null}
               */
  var headerTooltip: js.UndefOr[java.lang.String] = js.undefined
  /** You can use this property to freeze selected columns in grid at the time of scrolling.
               * @Default {false}
               */
  var isFrozen: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates the column has an identity in the database.
               * @Default {false}
               */
  var isIdentity: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates the column is act as a primary key(read-only) of the grid. The editing is performed based on the primary key column
               * @Default {false}
               */
  var isPrimaryKey: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates the order of Column that are to be hidden or visible when Grid element is in responsive mode and could not occupy all columns.
               * @Default {-1}
               */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /** Used to hide the particular column in column chooser by giving value as false.
               * @Default {true}
               */
  var showInColumnChooser: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enables column template for a particular column.
               * @Default {false}
               */
  var template: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to align the text within the column. See textAlign
               * @Default {ej.TextAlign.Left}
               */
  var textAlign: js.UndefOr[ejDotWebDotAllLib.ejNs.TextAlign | java.lang.String] = js.undefined
  /** Sets the template for Tooltip in Grid Columns(both header and content)
               */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to specify the data type of the specified columns.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to define constraints for saving data to the database.
               */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates whether this column is visible in the grid.
               * @Default {true}
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to define the width for a particular column in the grid.
               */
  var width: js.UndefOr[scala.Double] = js.undefined
}

