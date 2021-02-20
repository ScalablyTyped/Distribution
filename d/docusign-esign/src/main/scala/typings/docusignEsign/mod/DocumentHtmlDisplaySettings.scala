package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentHtmlDisplaySettings extends StObject {
  
  /**
    * Specifies the valid CSS-formatted styles to use on responsive table cells. Only valid in display sections of `responsive_table` or `responsive_table_single_column` types.
    */
  var cellStyle: js.UndefOr[String] = js.native
  
  /**
    * This object defines the appearance and function of a collapsible section or item.
    */
  var collapsibleSettings: js.UndefOr[DocumentHtmlCollapsibleDisplaySettings] = js.native
  
  /**
    * This string sets the display and behavior properties of
    * the document during signing. The possible values are:
    *
    * * `modal`<br>
    *   The document is shown as a supplement action strip
    *   and can be viewed, downloaded, or printed in a modal window.
    *   This is the recommended value for supplemental documents.
    *
    * * `download`<br>
    *   The document is shown as a supplement action strip
    *   and can be viewed, downloaded, or printed in a new browser window.
    *
    * * `inline`<br>
    *   The document is shown in the normal signing window.
    *   This value is not used with supplemental documents,
    *   but is the default value for all other documents.
    *
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
    * When **true**, the `displayLabel` is hidden when the display section is expanded and the display section is no longer collapsible.
    * This property is valid only when the value of the `display` property is `collapsed`.
    */
  var hideLabelWhenOpened: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the valid CSS-formatted styles to use on inline display sections. This property is valid only when the value of the `display` property is `inline`.
    */
  var inlineOuterStyle: js.UndefOr[String] = js.native
  
  /**
    * The label for the display section when it is expanded from a collapsed state. This label displays only on the first opening and is only valid with the value of the
    * `display` property is `collapsed`.
    */
  var labelWhenOpened: js.UndefOr[String] = js.native
  
  var preLabel: js.UndefOr[String] = js.native
  
  /**
    * When **true** and the section is expanded, the position of the section close is scrolled to the top of the screen. This property is only valid when the value of the
    * `display` property is `collapsed`.
    */
  var scrollToTopWhenOpened: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the valid CSS-formatted styles to use on responsive tables. This property is valid only when the value of the `display` property is `responsive_table`
    * or `responsive_table_single_column`.
    */
  var tableStyle: js.UndefOr[String] = js.native
}
object DocumentHtmlDisplaySettings {
  
  @scala.inline
  def apply(): DocumentHtmlDisplaySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentHtmlDisplaySettings]
  }
  
  @scala.inline
  implicit class DocumentHtmlDisplaySettingsMutableBuilder[Self <: DocumentHtmlDisplaySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellStyle(value: String): Self = StObject.set(x, "cellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellStyleUndefined: Self = StObject.set(x, "cellStyle", js.undefined)
    
    @scala.inline
    def setCollapsibleSettings(value: DocumentHtmlCollapsibleDisplaySettings): Self = StObject.set(x, "collapsibleSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleSettingsUndefined: Self = StObject.set(x, "collapsibleSettings", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLabel(value: String): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLabelUndefined: Self = StObject.set(x, "displayLabel", js.undefined)
    
    @scala.inline
    def setDisplayOrder(value: Double): Self = StObject.set(x, "displayOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOrderUndefined: Self = StObject.set(x, "displayOrder", js.undefined)
    
    @scala.inline
    def setDisplayPageNumber(value: Double): Self = StObject.set(x, "displayPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayPageNumberUndefined: Self = StObject.set(x, "displayPageNumber", js.undefined)
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setHideLabelWhenOpened(value: Boolean): Self = StObject.set(x, "hideLabelWhenOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideLabelWhenOpenedUndefined: Self = StObject.set(x, "hideLabelWhenOpened", js.undefined)
    
    @scala.inline
    def setInlineOuterStyle(value: String): Self = StObject.set(x, "inlineOuterStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineOuterStyleUndefined: Self = StObject.set(x, "inlineOuterStyle", js.undefined)
    
    @scala.inline
    def setLabelWhenOpened(value: String): Self = StObject.set(x, "labelWhenOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelWhenOpenedUndefined: Self = StObject.set(x, "labelWhenOpened", js.undefined)
    
    @scala.inline
    def setPreLabel(value: String): Self = StObject.set(x, "preLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreLabelUndefined: Self = StObject.set(x, "preLabel", js.undefined)
    
    @scala.inline
    def setScrollToTopWhenOpened(value: Boolean): Self = StObject.set(x, "scrollToTopWhenOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToTopWhenOpenedUndefined: Self = StObject.set(x, "scrollToTopWhenOpened", js.undefined)
    
    @scala.inline
    def setTableStyle(value: String): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStyleUndefined: Self = StObject.set(x, "tableStyle", js.undefined)
  }
}
