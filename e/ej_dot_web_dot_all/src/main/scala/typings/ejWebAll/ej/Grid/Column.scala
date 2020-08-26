package typings.ejWebAll.ej.Grid

import typings.ejWebAll.ej.TextAlign
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  /** Gets or sets a value that indicates whether to enable editing behavior for particular column.
    * @Default {true}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic filtering behavior for particular column.
    * @Default {true}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic grouping behavior for particular column.
    * @Default {true}
    */
  var allowGrouping: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic resizable for particular column.
    * @Default {true}
    */
  var allowResizing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic sorting behavior for particular column.
    * @Default {true}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Sets the clip mode for Grid cell as ellipsis or clipped content(both header and content)
    * @Default {ej.Grid.ClipMode.Clip}
    */
  var clipMode: js.UndefOr[ClipMode | String] = js.native
  /** Gets or sets an object that indicates to define a command column in the grid.
    * @Default {[]}
    */
  var commands: js.UndefOr[js.Array[ColumnsCommand]] = js.native
  /** Gets or sets a value that indicates to provide custom CSS for an individual column.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates the attribute values to the td element of a particular column
    */
  var customAttributes: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates to bind the external datasource to the particular column when column editType as dropdownedit and also it is used to bind the datasource to the
    * foreign key column while editing the grid. //Where data is array of JSON objects of text and value for the drop-down and array of JSON objects for foreign key column.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates to display the specified default value while adding a new record to the grid
    */
  var defaultValue: js.UndefOr[String | Double | Boolean | Date] = js.native
  /** Gets or sets a value that indicates to render the grid content and header with an HTML elements
    * @Default {false}
    */
  var disableHtmlEncode: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to display a column value as checkbox or string
    * @Default {true}
    */
  var displayAsCheckbox: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to customize ejNumericTextbox of an editable column. See editingType
    */
  var editParams: js.UndefOr[js.Any] = js.native
  /** Gets or sets a template that displays a custom editor used to edit column values. See editTemplate
    * @Default {null}
    */
  var editTemplate: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates to render the element(based on edit type) for editing the grid record. See editingType
    * @Default {ej.Grid.EditingType.String}
    */
  var editType: js.UndefOr[EditingType | String] = js.native
  /** Gets or sets a value that indicates to groups the column based on its column format.
    * @Default {false}
    */
  var enableGroupByFormat: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to display the columns in the grid mapping with column name of the dataSource.
    */
  var field: js.UndefOr[String] = js.native
  /** Gets or sets a template that customize the filter control from default . See filterBarTemplate
    * @Default {null}
    */
  var filterBarTemplate: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates to render the excel or menu filter dialog to the grid columns. See filterType
    * @Default {null}
    */
  var filterType: js.UndefOr[FilterType | String] = js.native
  /** Gets or sets a value that indicates to define foreign key field name of the grid datasource.
    * @Default {null}
    */
  var foreignKeyField: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to bind the field which is in foreign column datasource based on the foreignKeyField
    * @Default {null}
    */
  var foreignKeyValue: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates the format for the text applied on the column
    */
  var format: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to add the template within the header element of the particular column.
    * @Default {null}
    */
  var headerTemplateID: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to display the title of that particular column.
    */
  var headerText: js.UndefOr[String] = js.native
  /** This defines the text alignment of a particular column header cell value. See headerTextAlign
    * @Default {null}
    */
  var headerTextAlign: js.UndefOr[TextAlign | String] = js.native
  /** It accepts the string value and shows the tooltip for the Grid column header.
    * @Default {null}
    */
  var headerTooltip: js.UndefOr[String] = js.native
  /** You can use this property to freeze selected columns in grid at the time of scrolling.
    * @Default {false}
    */
  var isFrozen: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates the column has an identity in the database.
    * @Default {false}
    */
  var isIdentity: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates the column is act as a primary key(read-only) of the grid. The editing is performed based on the primary key column
    * @Default {false}
    */
  var isPrimaryKey: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates the order of Column that are to be hidden or visible when Grid element is in responsive mode and could not occupy all columns.
    * @Default {-1}
    */
  var priority: js.UndefOr[Double] = js.native
  /** Used to hide the particular column in column chooser by giving value as false.
    * @Default {true}
    */
  var showInColumnChooser: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enables column template for a particular column.
    * @Default {false}
    */
  var template: js.UndefOr[Boolean | String] = js.native
  /** Gets or sets a value that indicates to align the text within the column. See textAlign
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.native
  /** Sets the template for Tooltip in Grid Columns(both header and content)
    */
  var tooltip: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to specify the data type of the specified columns.
    */
  var `type`: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to define constraints for saving data to the database.
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates whether this column is visible in the grid.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to define the width for a particular column in the grid.
    */
  var width: js.UndefOr[Double] = js.native
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
    def setAllowEditing(value: Boolean): Self = this.set("allowEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditing: Self = this.set("allowEditing", js.undefined)
    @scala.inline
    def setAllowFiltering(value: Boolean): Self = this.set("allowFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFiltering: Self = this.set("allowFiltering", js.undefined)
    @scala.inline
    def setAllowGrouping(value: Boolean): Self = this.set("allowGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowGrouping: Self = this.set("allowGrouping", js.undefined)
    @scala.inline
    def setAllowResizing(value: Boolean): Self = this.set("allowResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowResizing: Self = this.set("allowResizing", js.undefined)
    @scala.inline
    def setAllowSorting(value: Boolean): Self = this.set("allowSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSorting: Self = this.set("allowSorting", js.undefined)
    @scala.inline
    def setClipMode(value: ClipMode | String): Self = this.set("clipMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipMode: Self = this.set("clipMode", js.undefined)
    @scala.inline
    def setCommandsVarargs(value: ColumnsCommand*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[ColumnsCommand]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setCustomAttributes(value: js.Any): Self = this.set("customAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAttributes: Self = this.set("customAttributes", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDefaultValue(value: String | Double | Boolean | Date): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisableHtmlEncode(value: Boolean): Self = this.set("disableHtmlEncode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHtmlEncode: Self = this.set("disableHtmlEncode", js.undefined)
    @scala.inline
    def setDisplayAsCheckbox(value: Boolean): Self = this.set("displayAsCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayAsCheckbox: Self = this.set("displayAsCheckbox", js.undefined)
    @scala.inline
    def setEditParams(value: js.Any): Self = this.set("editParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditParams: Self = this.set("editParams", js.undefined)
    @scala.inline
    def setEditTemplate(value: js.Any): Self = this.set("editTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditTemplate: Self = this.set("editTemplate", js.undefined)
    @scala.inline
    def setEditType(value: EditingType | String): Self = this.set("editType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditType: Self = this.set("editType", js.undefined)
    @scala.inline
    def setEnableGroupByFormat(value: Boolean): Self = this.set("enableGroupByFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGroupByFormat: Self = this.set("enableGroupByFormat", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setFilterBarTemplate(value: js.Any): Self = this.set("filterBarTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterBarTemplate: Self = this.set("filterBarTemplate", js.undefined)
    @scala.inline
    def setFilterType(value: FilterType | String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    @scala.inline
    def setForeignKeyField(value: String): Self = this.set("foreignKeyField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForeignKeyField: Self = this.set("foreignKeyField", js.undefined)
    @scala.inline
    def setForeignKeyValue(value: String): Self = this.set("foreignKeyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForeignKeyValue: Self = this.set("foreignKeyValue", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeaderTemplateID(value: String): Self = this.set("headerTemplateID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplateID: Self = this.set("headerTemplateID", js.undefined)
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    @scala.inline
    def setHeaderTextAlign(value: TextAlign | String): Self = this.set("headerTextAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTextAlign: Self = this.set("headerTextAlign", js.undefined)
    @scala.inline
    def setHeaderTooltip(value: String): Self = this.set("headerTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTooltip: Self = this.set("headerTooltip", js.undefined)
    @scala.inline
    def setIsFrozen(value: Boolean): Self = this.set("isFrozen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFrozen: Self = this.set("isFrozen", js.undefined)
    @scala.inline
    def setIsIdentity(value: Boolean): Self = this.set("isIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIdentity: Self = this.set("isIdentity", js.undefined)
    @scala.inline
    def setIsPrimaryKey(value: Boolean): Self = this.set("isPrimaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrimaryKey: Self = this.set("isPrimaryKey", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setShowInColumnChooser(value: Boolean): Self = this.set("showInColumnChooser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInColumnChooser: Self = this.set("showInColumnChooser", js.undefined)
    @scala.inline
    def setTemplate(value: Boolean | String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTextAlign(value: TextAlign | String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValidationRules(value: js.Any): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

