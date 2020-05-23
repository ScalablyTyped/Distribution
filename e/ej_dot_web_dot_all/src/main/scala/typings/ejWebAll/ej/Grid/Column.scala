package typings.ejWebAll.ej.Grid

import typings.ejWebAll.ej.TextAlign
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /** Gets or sets a value that indicates whether to enable editing behavior for particular column.
    * @Default {true}
    */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic filtering behavior for particular column.
    * @Default {true}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic grouping behavior for particular column.
    * @Default {true}
    */
  var allowGrouping: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic resizable for particular column.
    * @Default {true}
    */
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic sorting behavior for particular column.
    * @Default {true}
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** Sets the clip mode for Grid cell as ellipsis or clipped content(both header and content)
    * @Default {ej.Grid.ClipMode.Clip}
    */
  var clipMode: js.UndefOr[ClipMode | String] = js.undefined
  /** Gets or sets an object that indicates to define a command column in the grid.
    * @Default {[]}
    */
  var commands: js.UndefOr[js.Array[ColumnsCommand]] = js.undefined
  /** Gets or sets a value that indicates to provide custom CSS for an individual column.
    */
  var cssClass: js.UndefOr[String] = js.undefined
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
  var defaultValue: js.UndefOr[String | Double | Boolean | Date] = js.undefined
  /** Gets or sets a value that indicates to render the grid content and header with an HTML elements
    * @Default {false}
    */
  var disableHtmlEncode: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates to display a column value as checkbox or string
    * @Default {true}
    */
  var displayAsCheckbox: js.UndefOr[Boolean] = js.undefined
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
  var editType: js.UndefOr[EditingType | String] = js.undefined
  /** Gets or sets a value that indicates to groups the column based on its column format.
    * @Default {false}
    */
  var enableGroupByFormat: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates to display the columns in the grid mapping with column name of the dataSource.
    */
  var field: js.UndefOr[String] = js.undefined
  /** Gets or sets a template that customize the filter control from default . See filterBarTemplate
    * @Default {null}
    */
  var filterBarTemplate: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates to render the excel or menu filter dialog to the grid columns. See filterType
    * @Default {null}
    */
  var filterType: js.UndefOr[FilterType | String] = js.undefined
  /** Gets or sets a value that indicates to define foreign key field name of the grid datasource.
    * @Default {null}
    */
  var foreignKeyField: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates to bind the field which is in foreign column datasource based on the foreignKeyField
    * @Default {null}
    */
  var foreignKeyValue: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates the format for the text applied on the column
    */
  var format: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates to add the template within the header element of the particular column.
    * @Default {null}
    */
  var headerTemplateID: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates to display the title of that particular column.
    */
  var headerText: js.UndefOr[String] = js.undefined
  /** This defines the text alignment of a particular column header cell value. See headerTextAlign
    * @Default {null}
    */
  var headerTextAlign: js.UndefOr[TextAlign | String] = js.undefined
  /** It accepts the string value and shows the tooltip for the Grid column header.
    * @Default {null}
    */
  var headerTooltip: js.UndefOr[String] = js.undefined
  /** You can use this property to freeze selected columns in grid at the time of scrolling.
    * @Default {false}
    */
  var isFrozen: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates the column has an identity in the database.
    * @Default {false}
    */
  var isIdentity: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates the column is act as a primary key(read-only) of the grid. The editing is performed based on the primary key column
    * @Default {false}
    */
  var isPrimaryKey: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates the order of Column that are to be hidden or visible when Grid element is in responsive mode and could not occupy all columns.
    * @Default {-1}
    */
  var priority: js.UndefOr[Double] = js.undefined
  /** Used to hide the particular column in column chooser by giving value as false.
    * @Default {true}
    */
  var showInColumnChooser: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enables column template for a particular column.
    * @Default {false}
    */
  var template: js.UndefOr[Boolean | String] = js.undefined
  /** Gets or sets a value that indicates to align the text within the column. See textAlign
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.undefined
  /** Sets the template for Tooltip in Grid Columns(both header and content)
    */
  var tooltip: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates to specify the data type of the specified columns.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates to define constraints for saving data to the database.
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates whether this column is visible in the grid.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates to define the width for a particular column in the grid.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    allowEditing: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    allowGrouping: js.UndefOr[Boolean] = js.undefined,
    allowResizing: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    clipMode: ClipMode | String = null,
    commands: js.Array[ColumnsCommand] = null,
    cssClass: String = null,
    customAttributes: js.Any = null,
    dataSource: js.Any = null,
    defaultValue: String | Double | Boolean | Date = null,
    disableHtmlEncode: js.UndefOr[Boolean] = js.undefined,
    displayAsCheckbox: js.UndefOr[Boolean] = js.undefined,
    editParams: js.Any = null,
    editTemplate: js.Any = null,
    editType: EditingType | String = null,
    enableGroupByFormat: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    filterBarTemplate: js.Any = null,
    filterType: FilterType | String = null,
    foreignKeyField: String = null,
    foreignKeyValue: String = null,
    format: String = null,
    headerTemplateID: String = null,
    headerText: String = null,
    headerTextAlign: TextAlign | String = null,
    headerTooltip: String = null,
    isFrozen: js.UndefOr[Boolean] = js.undefined,
    isIdentity: js.UndefOr[Boolean] = js.undefined,
    isPrimaryKey: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    showInColumnChooser: js.UndefOr[Boolean] = js.undefined,
    template: Boolean | String = null,
    textAlign: TextAlign | String = null,
    tooltip: String = null,
    `type`: String = null,
    validationRules: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowGrouping)) __obj.updateDynamic("allowGrouping")(allowGrouping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.get.asInstanceOf[js.Any])
    if (clipMode != null) __obj.updateDynamic("clipMode")(clipMode.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHtmlEncode)) __obj.updateDynamic("disableHtmlEncode")(disableHtmlEncode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayAsCheckbox)) __obj.updateDynamic("displayAsCheckbox")(displayAsCheckbox.get.asInstanceOf[js.Any])
    if (editParams != null) __obj.updateDynamic("editParams")(editParams.asInstanceOf[js.Any])
    if (editTemplate != null) __obj.updateDynamic("editTemplate")(editTemplate.asInstanceOf[js.Any])
    if (editType != null) __obj.updateDynamic("editType")(editType.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGroupByFormat)) __obj.updateDynamic("enableGroupByFormat")(enableGroupByFormat.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (filterBarTemplate != null) __obj.updateDynamic("filterBarTemplate")(filterBarTemplate.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (foreignKeyField != null) __obj.updateDynamic("foreignKeyField")(foreignKeyField.asInstanceOf[js.Any])
    if (foreignKeyValue != null) __obj.updateDynamic("foreignKeyValue")(foreignKeyValue.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (headerTemplateID != null) __obj.updateDynamic("headerTemplateID")(headerTemplateID.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (headerTextAlign != null) __obj.updateDynamic("headerTextAlign")(headerTextAlign.asInstanceOf[js.Any])
    if (headerTooltip != null) __obj.updateDynamic("headerTooltip")(headerTooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(isFrozen)) __obj.updateDynamic("isFrozen")(isFrozen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isIdentity)) __obj.updateDynamic("isIdentity")(isIdentity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimaryKey)) __obj.updateDynamic("isPrimaryKey")(isPrimaryKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInColumnChooser)) __obj.updateDynamic("showInColumnChooser")(showInColumnChooser.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

