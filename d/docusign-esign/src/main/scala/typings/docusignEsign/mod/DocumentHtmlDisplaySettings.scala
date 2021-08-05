package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentHtmlDisplaySettings extends StObject {
  
  /**
    * Specifies the valid CSS-formatted styles to use on responsive table cells. Only valid in display sections of `responsive_table` or `responsive_table_single_column` types.
    */
  var cellStyle: js.UndefOr[String] = js.undefined
  
  /**
    * This object defines the appearance and function of a collapsible section or item.
    */
  var collapsibleSettings: js.UndefOr[DocumentHtmlCollapsibleDisplaySettings] = js.undefined
  
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
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * The label for the display section.
    */
  var displayLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The position on the page where the display section appears.
    */
  var displayOrder: js.UndefOr[Double] = js.undefined
  
  // int32
  /**
    * The number of the page on which the display section appears.
    */
  var displayPageNumber: js.UndefOr[Double] = js.undefined
  
  // int32
  /**
    * When **true**, the `displayLabel` is hidden when the display section is expanded and the display section is no longer collapsible.
    * This property is valid only when the value of the `display` property is `collapsed`.
    */
  var hideLabelWhenOpened: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the valid CSS-formatted styles to use on inline display sections. This property is valid only when the value of the `display` property is `inline`.
    */
  var inlineOuterStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The label for the display section when it is expanded from a collapsed state. This label displays only on the first opening and is only valid with the value of the
    * `display` property is `collapsed`.
    */
  var labelWhenOpened: js.UndefOr[String] = js.undefined
  
  var preLabel: js.UndefOr[String] = js.undefined
  
  /**
    * When **true** and the section is expanded, the position of the section close is scrolled to the top of the screen. This property is only valid when the value of the
    * `display` property is `collapsed`.
    */
  var scrollToTopWhenOpened: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the valid CSS-formatted styles to use on responsive tables. This property is valid only when the value of the `display` property is `responsive_table`
    * or `responsive_table_single_column`.
    */
  var tableStyle: js.UndefOr[String] = js.undefined
}
object DocumentHtmlDisplaySettings {
  
  inline def apply(): DocumentHtmlDisplaySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentHtmlDisplaySettings]
  }
  
  extension [Self <: DocumentHtmlDisplaySettings](x: Self) {
    
    inline def setCellStyle(value: String): Self = StObject.set(x, "cellStyle", value.asInstanceOf[js.Any])
    
    inline def setCellStyleUndefined: Self = StObject.set(x, "cellStyle", js.undefined)
    
    inline def setCollapsibleSettings(value: DocumentHtmlCollapsibleDisplaySettings): Self = StObject.set(x, "collapsibleSettings", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleSettingsUndefined: Self = StObject.set(x, "collapsibleSettings", js.undefined)
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayLabel(value: String): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
    
    inline def setDisplayLabelUndefined: Self = StObject.set(x, "displayLabel", js.undefined)
    
    inline def setDisplayOrder(value: Double): Self = StObject.set(x, "displayOrder", value.asInstanceOf[js.Any])
    
    inline def setDisplayOrderUndefined: Self = StObject.set(x, "displayOrder", js.undefined)
    
    inline def setDisplayPageNumber(value: Double): Self = StObject.set(x, "displayPageNumber", value.asInstanceOf[js.Any])
    
    inline def setDisplayPageNumberUndefined: Self = StObject.set(x, "displayPageNumber", js.undefined)
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setHideLabelWhenOpened(value: Boolean): Self = StObject.set(x, "hideLabelWhenOpened", value.asInstanceOf[js.Any])
    
    inline def setHideLabelWhenOpenedUndefined: Self = StObject.set(x, "hideLabelWhenOpened", js.undefined)
    
    inline def setInlineOuterStyle(value: String): Self = StObject.set(x, "inlineOuterStyle", value.asInstanceOf[js.Any])
    
    inline def setInlineOuterStyleUndefined: Self = StObject.set(x, "inlineOuterStyle", js.undefined)
    
    inline def setLabelWhenOpened(value: String): Self = StObject.set(x, "labelWhenOpened", value.asInstanceOf[js.Any])
    
    inline def setLabelWhenOpenedUndefined: Self = StObject.set(x, "labelWhenOpened", js.undefined)
    
    inline def setPreLabel(value: String): Self = StObject.set(x, "preLabel", value.asInstanceOf[js.Any])
    
    inline def setPreLabelUndefined: Self = StObject.set(x, "preLabel", js.undefined)
    
    inline def setScrollToTopWhenOpened(value: Boolean): Self = StObject.set(x, "scrollToTopWhenOpened", value.asInstanceOf[js.Any])
    
    inline def setScrollToTopWhenOpenedUndefined: Self = StObject.set(x, "scrollToTopWhenOpened", js.undefined)
    
    inline def setTableStyle(value: String): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
    
    inline def setTableStyleUndefined: Self = StObject.set(x, "tableStyle", js.undefined)
  }
}
