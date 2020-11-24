package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterSettings extends js.Object {
  
  /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled with the dropdown. When you enter the delimiter value, the texts after the delimiter are
    * considered as a separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,) or semi-colon (;) or
    * any other special character.
    * @Default {,}
    */
  var delimiterChar: js.UndefOr[String] = js.native
  
  /** Specifies the width of the parameter item. By default, the item width value is set as &quot;185px&quot;.
    * @Default {185px}
    */
  var itemWidth: js.UndefOr[String] = js.native
  
  /** Specifies the width of the parameter label. By default, the parameter label width value is set as &quot;110px&quot;.
    * @Default {110px}
    */
  var labelWidth: js.UndefOr[String] = js.native
  
  /** Specifies the height of the combobox parameter popup list. By default, the popup height value is &quot;152px&quot;.
    * @Default {152px}
    */
  var popupHeight: js.UndefOr[String] = js.native
  
  /** Specifies the width of the combobox parameter popup list. By default, the popup width sets based on the width of the component.
    * @Default {auto}
    */
  var popupWidth: js.UndefOr[String] = js.native
}
object ParameterSettings {
  
  @scala.inline
  def apply(): ParameterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterSettings]
  }
  
  @scala.inline
  implicit class ParameterSettingsOps[Self <: ParameterSettings] (val x: Self) extends AnyVal {
    
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
    def setDelimiterChar(value: String): Self = this.set("delimiterChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiterChar: Self = this.set("delimiterChar", js.undefined)
    
    @scala.inline
    def setItemWidth(value: String): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    
    @scala.inline
    def setLabelWidth(value: String): Self = this.set("labelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelWidth: Self = this.set("labelWidth", js.undefined)
    
    @scala.inline
    def setPopupHeight(value: String): Self = this.set("popupHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupHeight: Self = this.set("popupHeight", js.undefined)
    
    @scala.inline
    def setPopupWidth(value: String): Self = this.set("popupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupWidth: Self = this.set("popupWidth", js.undefined)
  }
}
