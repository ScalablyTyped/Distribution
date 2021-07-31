package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeTypeColors extends StObject {
  
  /**
    * @deprecated Unsupported colors property, use 'theme.colors.frame', this alias is ignored in Firefox >= 70.
    */
  var accentcolor: js.UndefOr[ThemeColor] = js.undefined
  
  var bookmark_text: js.UndefOr[ThemeColor] = js.undefined
  
  var button_background_active: js.UndefOr[ThemeColor] = js.undefined
  
  var button_background_hover: js.UndefOr[ThemeColor] = js.undefined
  
  var frame: js.UndefOr[ThemeColor] = js.undefined
  
  var frame_inactive: js.UndefOr[ThemeColor] = js.undefined
  
  var icons: js.UndefOr[ThemeColor] = js.undefined
  
  var icons_attention: js.UndefOr[ThemeColor] = js.undefined
  
  var ntp_background: js.UndefOr[ThemeColor] = js.undefined
  
  var ntp_text: js.UndefOr[ThemeColor] = js.undefined
  
  var popup: js.UndefOr[ThemeColor] = js.undefined
  
  var popup_border: js.UndefOr[ThemeColor] = js.undefined
  
  var popup_highlight: js.UndefOr[ThemeColor] = js.undefined
  
  var popup_highlight_text: js.UndefOr[ThemeColor] = js.undefined
  
  var popup_text: js.UndefOr[ThemeColor] = js.undefined
  
  var sidebar: js.UndefOr[ThemeColor] = js.undefined
  
  var sidebar_border: js.UndefOr[ThemeColor] = js.undefined
  
  var sidebar_highlight: js.UndefOr[ThemeColor] = js.undefined
  
  var sidebar_highlight_text: js.UndefOr[ThemeColor] = js.undefined
  
  var sidebar_text: js.UndefOr[ThemeColor] = js.undefined
  
  var tab_background_separator: js.UndefOr[ThemeColor] = js.undefined
  
  var tab_background_text: js.UndefOr[ThemeColor] = js.undefined
  
  var tab_line: js.UndefOr[ThemeColor] = js.undefined
  
  var tab_loading: js.UndefOr[ThemeColor] = js.undefined
  
  var tab_selected: js.UndefOr[ThemeColor] = js.undefined
  
  var tab_text: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * @deprecated Unsupported color property, use 'theme.colors.tab_background_text', this alias is ignored in Firefox >= 70.
    */
  var textcolor: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar_bottom_separator: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar_field: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar_field_border: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar_field_border_focus: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar_field_focus: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar_field_highlight: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar_field_highlight_text: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar_field_separator: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar_field_text: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar_field_text_focus: js.UndefOr[ThemeColor] = js.undefined
  
  /** This color property is an alias of 'bookmark_text'. */
  var toolbar_text: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar_top_separator: js.UndefOr[ThemeColor] = js.undefined
  
  var toolbar_vertical_separator: js.UndefOr[ThemeColor] = js.undefined
}
object ThemeTypeColors {
  
  @scala.inline
  def apply(): ThemeTypeColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeTypeColors]
  }
  
  @scala.inline
  implicit class ThemeTypeColorsMutableBuilder[Self <: ThemeTypeColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccentcolor(value: ThemeColor): Self = StObject.set(x, "accentcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentcolorUndefined: Self = StObject.set(x, "accentcolor", js.undefined)
    
    @scala.inline
    def setBookmark_text(value: ThemeColor): Self = StObject.set(x, "bookmark_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmark_textUndefined: Self = StObject.set(x, "bookmark_text", js.undefined)
    
    @scala.inline
    def setButton_background_active(value: ThemeColor): Self = StObject.set(x, "button_background_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton_background_activeUndefined: Self = StObject.set(x, "button_background_active", js.undefined)
    
    @scala.inline
    def setButton_background_hover(value: ThemeColor): Self = StObject.set(x, "button_background_hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton_background_hoverUndefined: Self = StObject.set(x, "button_background_hover", js.undefined)
    
    @scala.inline
    def setFrame(value: ThemeColor): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    @scala.inline
    def setFrame_inactive(value: ThemeColor): Self = StObject.set(x, "frame_inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame_inactiveUndefined: Self = StObject.set(x, "frame_inactive", js.undefined)
    
    @scala.inline
    def setIcons(value: ThemeColor): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setIcons_attention(value: ThemeColor): Self = StObject.set(x, "icons_attention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcons_attentionUndefined: Self = StObject.set(x, "icons_attention", js.undefined)
    
    @scala.inline
    def setNtp_background(value: ThemeColor): Self = StObject.set(x, "ntp_background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNtp_backgroundUndefined: Self = StObject.set(x, "ntp_background", js.undefined)
    
    @scala.inline
    def setNtp_text(value: ThemeColor): Self = StObject.set(x, "ntp_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNtp_textUndefined: Self = StObject.set(x, "ntp_text", js.undefined)
    
    @scala.inline
    def setPopup(value: ThemeColor): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    @scala.inline
    def setPopup_border(value: ThemeColor): Self = StObject.set(x, "popup_border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup_borderUndefined: Self = StObject.set(x, "popup_border", js.undefined)
    
    @scala.inline
    def setPopup_highlight(value: ThemeColor): Self = StObject.set(x, "popup_highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup_highlightUndefined: Self = StObject.set(x, "popup_highlight", js.undefined)
    
    @scala.inline
    def setPopup_highlight_text(value: ThemeColor): Self = StObject.set(x, "popup_highlight_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup_highlight_textUndefined: Self = StObject.set(x, "popup_highlight_text", js.undefined)
    
    @scala.inline
    def setPopup_text(value: ThemeColor): Self = StObject.set(x, "popup_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup_textUndefined: Self = StObject.set(x, "popup_text", js.undefined)
    
    @scala.inline
    def setSidebar(value: ThemeColor): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
    
    @scala.inline
    def setSidebar_border(value: ThemeColor): Self = StObject.set(x, "sidebar_border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebar_borderUndefined: Self = StObject.set(x, "sidebar_border", js.undefined)
    
    @scala.inline
    def setSidebar_highlight(value: ThemeColor): Self = StObject.set(x, "sidebar_highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebar_highlightUndefined: Self = StObject.set(x, "sidebar_highlight", js.undefined)
    
    @scala.inline
    def setSidebar_highlight_text(value: ThemeColor): Self = StObject.set(x, "sidebar_highlight_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebar_highlight_textUndefined: Self = StObject.set(x, "sidebar_highlight_text", js.undefined)
    
    @scala.inline
    def setSidebar_text(value: ThemeColor): Self = StObject.set(x, "sidebar_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebar_textUndefined: Self = StObject.set(x, "sidebar_text", js.undefined)
    
    @scala.inline
    def setTab_background_separator(value: ThemeColor): Self = StObject.set(x, "tab_background_separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab_background_separatorUndefined: Self = StObject.set(x, "tab_background_separator", js.undefined)
    
    @scala.inline
    def setTab_background_text(value: ThemeColor): Self = StObject.set(x, "tab_background_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab_background_textUndefined: Self = StObject.set(x, "tab_background_text", js.undefined)
    
    @scala.inline
    def setTab_line(value: ThemeColor): Self = StObject.set(x, "tab_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab_lineUndefined: Self = StObject.set(x, "tab_line", js.undefined)
    
    @scala.inline
    def setTab_loading(value: ThemeColor): Self = StObject.set(x, "tab_loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab_loadingUndefined: Self = StObject.set(x, "tab_loading", js.undefined)
    
    @scala.inline
    def setTab_selected(value: ThemeColor): Self = StObject.set(x, "tab_selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab_selectedUndefined: Self = StObject.set(x, "tab_selected", js.undefined)
    
    @scala.inline
    def setTab_text(value: ThemeColor): Self = StObject.set(x, "tab_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab_textUndefined: Self = StObject.set(x, "tab_text", js.undefined)
    
    @scala.inline
    def setTextcolor(value: ThemeColor): Self = StObject.set(x, "textcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextcolorUndefined: Self = StObject.set(x, "textcolor", js.undefined)
    
    @scala.inline
    def setToolbar(value: ThemeColor): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setToolbar_bottom_separator(value: ThemeColor): Self = StObject.set(x, "toolbar_bottom_separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_bottom_separatorUndefined: Self = StObject.set(x, "toolbar_bottom_separator", js.undefined)
    
    @scala.inline
    def setToolbar_field(value: ThemeColor): Self = StObject.set(x, "toolbar_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_fieldUndefined: Self = StObject.set(x, "toolbar_field", js.undefined)
    
    @scala.inline
    def setToolbar_field_border(value: ThemeColor): Self = StObject.set(x, "toolbar_field_border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_field_borderUndefined: Self = StObject.set(x, "toolbar_field_border", js.undefined)
    
    @scala.inline
    def setToolbar_field_border_focus(value: ThemeColor): Self = StObject.set(x, "toolbar_field_border_focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_field_border_focusUndefined: Self = StObject.set(x, "toolbar_field_border_focus", js.undefined)
    
    @scala.inline
    def setToolbar_field_focus(value: ThemeColor): Self = StObject.set(x, "toolbar_field_focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_field_focusUndefined: Self = StObject.set(x, "toolbar_field_focus", js.undefined)
    
    @scala.inline
    def setToolbar_field_highlight(value: ThemeColor): Self = StObject.set(x, "toolbar_field_highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_field_highlightUndefined: Self = StObject.set(x, "toolbar_field_highlight", js.undefined)
    
    @scala.inline
    def setToolbar_field_highlight_text(value: ThemeColor): Self = StObject.set(x, "toolbar_field_highlight_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_field_highlight_textUndefined: Self = StObject.set(x, "toolbar_field_highlight_text", js.undefined)
    
    @scala.inline
    def setToolbar_field_separator(value: ThemeColor): Self = StObject.set(x, "toolbar_field_separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_field_separatorUndefined: Self = StObject.set(x, "toolbar_field_separator", js.undefined)
    
    @scala.inline
    def setToolbar_field_text(value: ThemeColor): Self = StObject.set(x, "toolbar_field_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_field_textUndefined: Self = StObject.set(x, "toolbar_field_text", js.undefined)
    
    @scala.inline
    def setToolbar_field_text_focus(value: ThemeColor): Self = StObject.set(x, "toolbar_field_text_focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_field_text_focusUndefined: Self = StObject.set(x, "toolbar_field_text_focus", js.undefined)
    
    @scala.inline
    def setToolbar_text(value: ThemeColor): Self = StObject.set(x, "toolbar_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_textUndefined: Self = StObject.set(x, "toolbar_text", js.undefined)
    
    @scala.inline
    def setToolbar_top_separator(value: ThemeColor): Self = StObject.set(x, "toolbar_top_separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_top_separatorUndefined: Self = StObject.set(x, "toolbar_top_separator", js.undefined)
    
    @scala.inline
    def setToolbar_vertical_separator(value: ThemeColor): Self = StObject.set(x, "toolbar_vertical_separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar_vertical_separatorUndefined: Self = StObject.set(x, "toolbar_vertical_separator", js.undefined)
  }
}
