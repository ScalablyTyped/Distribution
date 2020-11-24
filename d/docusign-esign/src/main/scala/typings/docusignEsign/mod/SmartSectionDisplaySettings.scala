package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartSectionDisplaySettings extends js.Object {
  
  /**
    * Specifies the valid CSS-formatted styles to use on responsive table cells. Only valid in display sections of `responsive_table` or `responsive_table_single_column` types.
    */
  var cellStyle: js.UndefOr[String] = js.native
  
  /**
    * This object defines the appearance and function of a collapsible section or item.
    */
  var collapsibleSettings: js.UndefOr[SmartSectionCollapsibleDisplaySettings] = js.native
  
  /**
    * Indicates the display type. Must be one of the following enum values:
    *
    * - **inline**: Leaves the HTML where it is in the document. This allows for adding a label or presenting on a separate page.
    * - **collapsible**: The HTML in the section may be expanded or collapsed. By default, the section is expanded.
    * - **collapsed**: The HTML in the section may be expanded or collapsed. By default, the section is collapsed.
    * - **responsive_table**: Converts the section into a responsive table. Note that this style is applied only on HTML tables that fall within the `startAnchor`
    * and `endAnchor` positions.
    * - **responsive_table_single_column**: Converts the section into a responsive, single-column table. Note that this style is applied only on HTML tables that
    * fall within the `startAnchor` and `endAnchor` positions. The table is converted to a single column in which each column becomes a row and is stacked.
    * - **print_only**: Prevents this portion of the HTML from displaying in the responsive signing view.
    */
  var display: js.UndefOr[String] = js.native
  
  /**
    * The label for the display section.
    */
  var displayLabel: js.UndefOr[String] = js.native
  
  /**
    * The position on the page where the display section appears.
    */
  var displayOrder: js.UndefOr[Double] = js.native
  
   // int32
  /**
    * The number of the page on which the display section appears.
    */
  var displayPageNumber: js.UndefOr[Double] = js.native
  
   // int32
  /**
    * When **true**, the `displayLabel` is hidden when the display section is expanded and the display section is no longer collapsible. This property is valid only
    * when the value of the `display` property is `collapsed`.
    */
  var hideLabelWhenOpened: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the valid CSS-formatted styles to use on inline display sections. This property is valid only when the value of the `display` property is `inline`.
    */
  var inlineOuterStyle: js.UndefOr[String] = js.native
  
  /**
    * The label for the display section when it is expanded from a collapsed state. This label displays only on the first opening and is only valid with the value
    * of the `display` property is `collapsed`.
    */
  var labelWhenOpened: js.UndefOr[String] = js.native
  
  var preLabel: js.UndefOr[String] = js.native
  
  /**
    * When **true** and the section is expanded, the position of the section close is scrolled to the top of the screen. This property is only valid when the
    * value of the `display` property is `collapsed`.
    */
  var scrollToTopWhenOpened: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the valid CSS-formatted styles to use on responsive tables. This property is valid only when the value of the `display` property is
    * `responsive_table` or `responsive_table_single_column`.
    */
  var tableStyle: js.UndefOr[String] = js.native
}
object SmartSectionDisplaySettings {
  
  @scala.inline
  def apply(): SmartSectionDisplaySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartSectionDisplaySettings]
  }
  
  @scala.inline
  implicit class SmartSectionDisplaySettingsOps[Self <: SmartSectionDisplaySettings] (val x: Self) extends AnyVal {
    
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
    def setCellStyle(value: String): Self = this.set("cellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellStyle: Self = this.set("cellStyle", js.undefined)
    
    @scala.inline
    def setCollapsibleSettings(value: SmartSectionCollapsibleDisplaySettings): Self = this.set("collapsibleSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsibleSettings: Self = this.set("collapsibleSettings", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDisplayLabel(value: String): Self = this.set("displayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLabel: Self = this.set("displayLabel", js.undefined)
    
    @scala.inline
    def setDisplayOrder(value: Double): Self = this.set("displayOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayOrder: Self = this.set("displayOrder", js.undefined)
    
    @scala.inline
    def setDisplayPageNumber(value: Double): Self = this.set("displayPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayPageNumber: Self = this.set("displayPageNumber", js.undefined)
    
    @scala.inline
    def setHideLabelWhenOpened(value: Boolean): Self = this.set("hideLabelWhenOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideLabelWhenOpened: Self = this.set("hideLabelWhenOpened", js.undefined)
    
    @scala.inline
    def setInlineOuterStyle(value: String): Self = this.set("inlineOuterStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineOuterStyle: Self = this.set("inlineOuterStyle", js.undefined)
    
    @scala.inline
    def setLabelWhenOpened(value: String): Self = this.set("labelWhenOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelWhenOpened: Self = this.set("labelWhenOpened", js.undefined)
    
    @scala.inline
    def setPreLabel(value: String): Self = this.set("preLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreLabel: Self = this.set("preLabel", js.undefined)
    
    @scala.inline
    def setScrollToTopWhenOpened(value: Boolean): Self = this.set("scrollToTopWhenOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToTopWhenOpened: Self = this.set("scrollToTopWhenOpened", js.undefined)
    
    @scala.inline
    def setTableStyle(value: String): Self = this.set("tableStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableStyle: Self = this.set("tableStyle", js.undefined)
  }
}
