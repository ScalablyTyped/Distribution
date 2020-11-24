package typings.ejWebAll.ej.Autocomplete

import typings.ejWebAll.ej.TextAlign
import typings.ejWebAll.ej.Type
import typings.ejWebAll.ej.filterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiColumnSettingsColumn extends js.Object {
  
  /** Gets or sets a value that indicates to render the multicolumn with custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Get or set a value that indicates to display the columns in the autocomplete mapping with column name of the dataSource.
    */
  var field: js.UndefOr[String] = js.native
  
  /** Specifies the search filter type. There are several types of search filter available such as â€˜startswithâ€™, â€˜containsâ€™, â€˜endswithâ€™, â€˜lessthanâ€™,
    * â€˜lessthanorequalâ€™, â€˜greaterthanâ€™, â€˜greaterthanorequalâ€™, â€˜equalâ€™, â€˜notequalâ€™.
    * @Default {ej.filterType.StartsWith}
    */
  var filterType: js.UndefOr[typings.ejWebAll.ej.filterType | String] = js.native
  
  /** Get or set a value that indicates to display the title of that particular column.
    */
  var headerText: js.UndefOr[String] = js.native
  
  /** This defines the text alignment of a particular column header cell value. See headerTextAlign
    * @Default {ej.TextAlign.Left}
    */
  var headerTextAlign: js.UndefOr[TextAlign | String] = js.native
  
  /** Gets or sets a value that indicates to align the text within the column. See textAlign
    * @Default {ej.TextAlign.Left}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.native
  
  /** Specifies the search data type. There are four types of data types available such as string, â€˜numberâ€™, â€˜booleanâ€™ and â€˜dateâ€™.
    * @Default {ej.Type.String}
    */
  var `type`: js.UndefOr[Type | String] = js.native
}
object MultiColumnSettingsColumn {
  
  @scala.inline
  def apply(): MultiColumnSettingsColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiColumnSettingsColumn]
  }
  
  @scala.inline
  implicit class MultiColumnSettingsColumnOps[Self <: MultiColumnSettingsColumn] (val x: Self) extends AnyVal {
    
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
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFilterType(value: filterType | String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    
    @scala.inline
    def setHeaderTextAlign(value: TextAlign | String): Self = this.set("headerTextAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTextAlign: Self = this.set("headerTextAlign", js.undefined)
    
    @scala.inline
    def setTextAlign(value: TextAlign | String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setType(value: Type | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
