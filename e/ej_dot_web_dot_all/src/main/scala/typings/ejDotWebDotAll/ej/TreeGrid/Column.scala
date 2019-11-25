package typings.ejDotWebDotAll.ej.TreeGrid

import typings.ejDotWebDotAll.ej.TextAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /** Enables/disables cell selection.
    * @Default {false}
    */
  var allowCellSelection: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to edit a row or cell.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to filter the rows based on this column.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** Enables the blanks option in ejDropDownList mapped in TreeGrid column
    * @Default {true}
    */
  var allowFilteringBlankContent: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to freeze/unfreeze the columns
    * @Default {false}
    */
  var allowFreezing: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to sort the rows based on this column/field.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** Specifies the template ID or the template string of the AngularJS script element to enable column template for a column.
    */
  var angularTemplate: js.UndefOr[String] = js.undefined
  /** Sets the clip mode for TreeGrid cell as ellipsis or clipped content(both header and content)
    * @Default {ej.TreeGrid.ClipMode.Clip}
    */
  var clipMode: js.UndefOr[ClipMode | String] = js.undefined
  /** Gets or sets an object to define a command column in TreeGrid.
    * @Default {[]}
    */
  var commands: js.UndefOr[js.Array[ColumnsCommand]] = js.undefined
  /** Gets or sets a value that indicates to display a column value as checkbox or string
    * @Default {false}
    */
  var displayAsCheckbox: js.UndefOr[Boolean] = js.undefined
  /** To bind the dropdown data for TreeGrid column mapped with ejDropDownList
    */
  var dropdownData: js.UndefOr[String] = js.undefined
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
  var editType: js.UndefOr[EditingType | String] = js.undefined
  /** Specifies the name of the field from the dataSource to bind with this column.
    */
  var field: js.UndefOr[String] = js.undefined
  /** Specifies the type of the editor control to be used to filter the rows.
    * @Default {ej.TreeGrid.EditingType.String}
    */
  var filterEditType: js.UndefOr[EditingType | String] = js.undefined
  /** Gets or sets a value to render either excel or menu filtering in TreeGrid column filtering.
    * @Default {null}
    */
  var filterType: js.UndefOr[typings.ejDotWebDotAll.ej.TreeGrid.FilterType | String] = js.undefined
  /** Specifies the display format of a column
    * @Default {null}
    */
  var format: js.UndefOr[js.Any] = js.undefined
  /** Specifies the header template value for the column header
    */
  var headerTemplateID: js.UndefOr[String] = js.undefined
  /** Header text of the column.
    * @Default {null}
    */
  var headerText: js.UndefOr[String] = js.undefined
  /** Specifies the alignment of the column header text
    * @Default {ej.TextAlign.Left}
    */
  var headerTextAlign: js.UndefOr[TextAlign | String] = js.undefined
  /** Sets the tooltip template for the column header
    * @Default {null}
    */
  var headerTooltip: js.UndefOr[String] = js.undefined
  /** Specifies whether the column is frozen
    * @Default {false}
    */
  var isFrozen: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether the column is a template column
    * @Default {false}
    */
  var isTemplateColumn: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets the priority value of the column. It is used to show/hide TreeGrid columns in responsive mode.
    * @Default {-1}
    */
  var priority: js.UndefOr[Double] = js.undefined
  /** Enables or disables the checkbox visibility in a column for checkbox selection.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[Boolean] = js.undefined
  /** We can include or exclude particular column from column visibility list in column menu.
    * @Default {true}
    */
  var showInColumnChooser: js.UndefOr[Boolean] = js.undefined
  /** Specifies the template string of the script element to enable column template for a column.
    */
  var template: js.UndefOr[String] = js.undefined
  /** Specifies the template ID of the script element to enable column template for a column.
    */
  var templateID: js.UndefOr[String] = js.undefined
  /** Specifies the text alignment for the column
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.undefined
  /** Sets the tooltip template for the specific column.
    * @Default {null}
    */
  var tooltip: js.UndefOr[String] = js.undefined
  /** specifies the conditions for saving data to the database while adding or editing the fields.
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** Controls the visibility of the column.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value for TreeGrid column width
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Column {
  @scala.inline
  def apply(
    allowCellSelection: js.UndefOr[Boolean] = js.undefined,
    allowEditing: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    allowFilteringBlankContent: js.UndefOr[Boolean] = js.undefined,
    allowFreezing: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    angularTemplate: String = null,
    clipMode: ClipMode | String = null,
    commands: js.Array[ColumnsCommand] = null,
    displayAsCheckbox: js.UndefOr[Boolean] = js.undefined,
    dropdownData: String = null,
    editParams: js.Any = null,
    editTemplate: js.Any = null,
    editType: EditingType | String = null,
    field: String = null,
    filterEditType: EditingType | String = null,
    filterType: typings.ejDotWebDotAll.ej.TreeGrid.FilterType | String = null,
    format: js.Any = null,
    headerTemplateID: String = null,
    headerText: String = null,
    headerTextAlign: TextAlign | String = null,
    headerTooltip: String = null,
    isFrozen: js.UndefOr[Boolean] = js.undefined,
    isTemplateColumn: js.UndefOr[Boolean] = js.undefined,
    priority: Int | Double = null,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showInColumnChooser: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    templateID: String = null,
    textAlign: TextAlign | String = null,
    tooltip: String = null,
    validationRules: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): Column = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCellSelection)) __obj.updateDynamic("allowCellSelection")(allowCellSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFilteringBlankContent)) __obj.updateDynamic("allowFilteringBlankContent")(allowFilteringBlankContent.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFreezing)) __obj.updateDynamic("allowFreezing")(allowFreezing.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.asInstanceOf[js.Any])
    if (angularTemplate != null) __obj.updateDynamic("angularTemplate")(angularTemplate.asInstanceOf[js.Any])
    if (clipMode != null) __obj.updateDynamic("clipMode")(clipMode.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (!js.isUndefined(displayAsCheckbox)) __obj.updateDynamic("displayAsCheckbox")(displayAsCheckbox.asInstanceOf[js.Any])
    if (dropdownData != null) __obj.updateDynamic("dropdownData")(dropdownData.asInstanceOf[js.Any])
    if (editParams != null) __obj.updateDynamic("editParams")(editParams.asInstanceOf[js.Any])
    if (editTemplate != null) __obj.updateDynamic("editTemplate")(editTemplate.asInstanceOf[js.Any])
    if (editType != null) __obj.updateDynamic("editType")(editType.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (filterEditType != null) __obj.updateDynamic("filterEditType")(filterEditType.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (headerTemplateID != null) __obj.updateDynamic("headerTemplateID")(headerTemplateID.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (headerTextAlign != null) __obj.updateDynamic("headerTextAlign")(headerTextAlign.asInstanceOf[js.Any])
    if (headerTooltip != null) __obj.updateDynamic("headerTooltip")(headerTooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(isFrozen)) __obj.updateDynamic("isFrozen")(isFrozen.asInstanceOf[js.Any])
    if (!js.isUndefined(isTemplateColumn)) __obj.updateDynamic("isTemplateColumn")(isTemplateColumn.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(showInColumnChooser)) __obj.updateDynamic("showInColumnChooser")(showInColumnChooser.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateID != null) __obj.updateDynamic("templateID")(templateID.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

