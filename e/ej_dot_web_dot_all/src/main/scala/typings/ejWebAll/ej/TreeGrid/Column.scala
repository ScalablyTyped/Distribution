package typings.ejWebAll.ej.TreeGrid

import typings.ejWebAll.ej.TextAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends js.Object {
  
  /** Enables/disables cell selection.
    * @Default {false}
    */
  var allowCellSelection: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the ability to edit a row or cell.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the ability to filter the rows based on this column.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  
  /** Enables the blanks option in ejDropDownList mapped in TreeGrid column
    * @Default {true}
    */
  var allowFilteringBlankContent: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the ability to freeze/unfreeze the columns
    * @Default {false}
    */
  var allowFreezing: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the ability to sort the rows based on this column/field.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  
  /** Specifies the template ID or the template string of the AngularJS script element to enable column template for a column.
    */
  var angularTemplate: js.UndefOr[String] = js.native
  
  /** Sets the clip mode for TreeGrid cell as ellipsis or clipped content(both header and content)
    * @Default {ej.TreeGrid.ClipMode.Clip}
    */
  var clipMode: js.UndefOr[ClipMode | String] = js.native
  
  /** Gets or sets an object to define a command column in TreeGrid.
    * @Default {[]}
    */
  var commands: js.UndefOr[js.Array[ColumnsCommand]] = js.native
  
  /** Gets or sets a value that indicates to display a column value as checkbox or string
    * @Default {false}
    */
  var displayAsCheckbox: js.UndefOr[Boolean] = js.native
  
  /** To bind the dropdown data for TreeGrid column mapped with ejDropDownList
    */
  var dropdownData: js.UndefOr[String] = js.native
  
  /** To customize the ej controls defined in TreeGrid column with their native property.
    */
  var editParams: js.UndefOr[js.Any] = js.native
  
  /** Gets or sets a template that displays a custom editor for editing the column values.
    * @Default {null}
    */
  var editTemplate: js.UndefOr[js.Any] = js.native
  
  /** Specifies the edit type of the column.
    * @Default {ej.TreeGrid.EditingType.String}
    */
  var editType: js.UndefOr[EditingType | String] = js.native
  
  /** Specifies the name of the field from the dataSource to bind with this column.
    */
  var field: js.UndefOr[String] = js.native
  
  /** Specifies the type of the editor control to be used to filter the rows.
    * @Default {ej.TreeGrid.EditingType.String}
    */
  var filterEditType: js.UndefOr[EditingType | String] = js.native
  
  /** Gets or sets a value to render either excel or menu filtering in TreeGrid column filtering.
    * @Default {null}
    */
  var filterType: js.UndefOr[FilterType | String] = js.native
  
  /** Specifies the display format of a column
    * @Default {null}
    */
  var format: js.UndefOr[js.Any] = js.native
  
  /** Specifies the header template value for the column header
    */
  var headerTemplateID: js.UndefOr[String] = js.native
  
  /** Header text of the column.
    * @Default {null}
    */
  var headerText: js.UndefOr[String] = js.native
  
  /** Specifies the alignment of the column header text
    * @Default {ej.TextAlign.Left}
    */
  var headerTextAlign: js.UndefOr[TextAlign | String] = js.native
  
  /** Sets the tooltip template for the column header
    * @Default {null}
    */
  var headerTooltip: js.UndefOr[String] = js.native
  
  /** Specifies whether the column is frozen
    * @Default {false}
    */
  var isFrozen: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether the column is a template column
    * @Default {false}
    */
  var isTemplateColumn: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets the priority value of the column. It is used to show/hide TreeGrid columns in responsive mode.
    * @Default {-1}
    */
  var priority: js.UndefOr[Double] = js.native
  
  /** Enables or disables the checkbox visibility in a column for checkbox selection.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  
  /** We can include or exclude particular column from column visibility list in column menu.
    * @Default {true}
    */
  var showInColumnChooser: js.UndefOr[Boolean] = js.native
  
  /** Specifies the template string of the script element to enable column template for a column.
    */
  var template: js.UndefOr[String] = js.native
  
  /** Specifies the template ID of the script element to enable column template for a column.
    */
  var templateID: js.UndefOr[String] = js.native
  
  /** Specifies the text alignment for the column
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.native
  
  /** Sets the tooltip template for the specific column.
    * @Default {null}
    */
  var tooltip: js.UndefOr[String] = js.native
  
  /** specifies the conditions for saving data to the database while adding or editing the fields.
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  
  /** Controls the visibility of the column.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value for TreeGrid column width
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
    def setAllowCellSelection(value: Boolean): Self = this.set("allowCellSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCellSelection: Self = this.set("allowCellSelection", js.undefined)
    
    @scala.inline
    def setAllowEditing(value: Boolean): Self = this.set("allowEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEditing: Self = this.set("allowEditing", js.undefined)
    
    @scala.inline
    def setAllowFiltering(value: Boolean): Self = this.set("allowFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFiltering: Self = this.set("allowFiltering", js.undefined)
    
    @scala.inline
    def setAllowFilteringBlankContent(value: Boolean): Self = this.set("allowFilteringBlankContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFilteringBlankContent: Self = this.set("allowFilteringBlankContent", js.undefined)
    
    @scala.inline
    def setAllowFreezing(value: Boolean): Self = this.set("allowFreezing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFreezing: Self = this.set("allowFreezing", js.undefined)
    
    @scala.inline
    def setAllowSorting(value: Boolean): Self = this.set("allowSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSorting: Self = this.set("allowSorting", js.undefined)
    
    @scala.inline
    def setAngularTemplate(value: String): Self = this.set("angularTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngularTemplate: Self = this.set("angularTemplate", js.undefined)
    
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
    def setDisplayAsCheckbox(value: Boolean): Self = this.set("displayAsCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAsCheckbox: Self = this.set("displayAsCheckbox", js.undefined)
    
    @scala.inline
    def setDropdownData(value: String): Self = this.set("dropdownData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownData: Self = this.set("dropdownData", js.undefined)
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFilterEditType(value: EditingType | String): Self = this.set("filterEditType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterEditType: Self = this.set("filterEditType", js.undefined)
    
    @scala.inline
    def setFilterType(value: FilterType | String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    
    @scala.inline
    def setFormat(value: js.Any): Self = this.set("format", value.asInstanceOf[js.Any])
    
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
    def setIsTemplateColumn(value: Boolean): Self = this.set("isTemplateColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTemplateColumn: Self = this.set("isTemplateColumn", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setShowCheckbox(value: Boolean): Self = this.set("showCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCheckbox: Self = this.set("showCheckbox", js.undefined)
    
    @scala.inline
    def setShowInColumnChooser(value: Boolean): Self = this.set("showInColumnChooser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInColumnChooser: Self = this.set("showInColumnChooser", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateID(value: String): Self = this.set("templateID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateID: Self = this.set("templateID", js.undefined)
    
    @scala.inline
    def setTextAlign(value: TextAlign | String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
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
