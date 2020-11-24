package typings.ejWebAll.ej.FileExplorer

import typings.ejWebAll.ej.FilterType_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterSettings extends js.Object {
  
  /** It allows to search the text given in search Textbox in every keyup event. When this property was set as false, searching will works only on Enter key and searchbar blur.
    * @Default {true}
    */
  var allowSearchOnTyping: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables to perform the filter operation with case sensitive.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[Boolean] = js.native
  
  /** Sets the search filter type. There are several filter types available such as &quot;startswith&quot;, &quot;contains&quot;, &quot;endswith&quot;. See filterType.
    * @Default {ej.FileExplorer.filterType.Contains}
    */
  var filterType: js.UndefOr[FilterType_ | String] = js.native
}
object FilterSettings {
  
  @scala.inline
  def apply(): FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSettings]
  }
  
  @scala.inline
  implicit class FilterSettingsOps[Self <: FilterSettings] (val x: Self) extends AnyVal {
    
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
    def setAllowSearchOnTyping(value: Boolean): Self = this.set("allowSearchOnTyping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSearchOnTyping: Self = this.set("allowSearchOnTyping", js.undefined)
    
    @scala.inline
    def setCaseSensitiveSearch(value: Boolean): Self = this.set("caseSensitiveSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitiveSearch: Self = this.set("caseSensitiveSearch", js.undefined)
    
    @scala.inline
    def setFilterType(value: FilterType_ | String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
  }
}
