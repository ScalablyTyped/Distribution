package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ThemeColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accentcolor extends js.Object {
  /**
    * @deprecated Unsupported colors property, use 'theme.colors.frame', this alias is ignored in Firefox >=
    *     70.
    */
  var accentcolor: js.UndefOr[ThemeColor] = js.native
  var bookmark_text: js.UndefOr[ThemeColor] = js.native
  var button_background_active: js.UndefOr[ThemeColor] = js.native
  var button_background_hover: js.UndefOr[ThemeColor] = js.native
  var frame: js.UndefOr[ThemeColor] = js.native
  var frame_inactive: js.UndefOr[ThemeColor] = js.native
  var icons: js.UndefOr[ThemeColor] = js.native
  var icons_attention: js.UndefOr[ThemeColor] = js.native
  var ntp_background: js.UndefOr[ThemeColor] = js.native
  var ntp_text: js.UndefOr[ThemeColor] = js.native
  var popup: js.UndefOr[ThemeColor] = js.native
  var popup_border: js.UndefOr[ThemeColor] = js.native
  var popup_highlight: js.UndefOr[ThemeColor] = js.native
  var popup_highlight_text: js.UndefOr[ThemeColor] = js.native
  var popup_text: js.UndefOr[ThemeColor] = js.native
  var sidebar: js.UndefOr[ThemeColor] = js.native
  var sidebar_border: js.UndefOr[ThemeColor] = js.native
  var sidebar_highlight: js.UndefOr[ThemeColor] = js.native
  var sidebar_highlight_text: js.UndefOr[ThemeColor] = js.native
  var sidebar_text: js.UndefOr[ThemeColor] = js.native
  var tab_background_separator: js.UndefOr[ThemeColor] = js.native
  var tab_background_text: js.UndefOr[ThemeColor] = js.native
  var tab_line: js.UndefOr[ThemeColor] = js.native
  var tab_loading: js.UndefOr[ThemeColor] = js.native
  var tab_selected: js.UndefOr[ThemeColor] = js.native
  var tab_text: js.UndefOr[ThemeColor] = js.native
  /**
    * @deprecated Unsupported color property, use 'theme.colors.tab_background_text', this alias is ignored in
    *     Firefox >= 70.
    */
  var textcolor: js.UndefOr[ThemeColor] = js.native
  var toolbar: js.UndefOr[ThemeColor] = js.native
  var toolbar_bottom_separator: js.UndefOr[ThemeColor] = js.native
  var toolbar_field: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_border: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_border_focus: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_focus: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_highlight: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_highlight_text: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_separator: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_text: js.UndefOr[ThemeColor] = js.native
  var toolbar_field_text_focus: js.UndefOr[ThemeColor] = js.native
  /** This color property is an alias of 'bookmark_text'. */
  var toolbar_text: js.UndefOr[ThemeColor] = js.native
  var toolbar_top_separator: js.UndefOr[ThemeColor] = js.native
  var toolbar_vertical_separator: js.UndefOr[ThemeColor] = js.native
}

object Accentcolor {
  @scala.inline
  def apply(): Accentcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accentcolor]
  }
  @scala.inline
  implicit class AccentcolorOps[Self <: Accentcolor] (val x: Self) extends AnyVal {
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
    def setAccentcolor(value: ThemeColor): Self = this.set("accentcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccentcolor: Self = this.set("accentcolor", js.undefined)
    @scala.inline
    def setBookmark_text(value: ThemeColor): Self = this.set("bookmark_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookmark_text: Self = this.set("bookmark_text", js.undefined)
    @scala.inline
    def setButton_background_active(value: ThemeColor): Self = this.set("button_background_active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton_background_active: Self = this.set("button_background_active", js.undefined)
    @scala.inline
    def setButton_background_hover(value: ThemeColor): Self = this.set("button_background_hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton_background_hover: Self = this.set("button_background_hover", js.undefined)
    @scala.inline
    def setFrame(value: ThemeColor): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setFrame_inactive(value: ThemeColor): Self = this.set("frame_inactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame_inactive: Self = this.set("frame_inactive", js.undefined)
    @scala.inline
    def setIcons(value: ThemeColor): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setIcons_attention(value: ThemeColor): Self = this.set("icons_attention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons_attention: Self = this.set("icons_attention", js.undefined)
    @scala.inline
    def setNtp_background(value: ThemeColor): Self = this.set("ntp_background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNtp_background: Self = this.set("ntp_background", js.undefined)
    @scala.inline
    def setNtp_text(value: ThemeColor): Self = this.set("ntp_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNtp_text: Self = this.set("ntp_text", js.undefined)
    @scala.inline
    def setPopup(value: ThemeColor): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    @scala.inline
    def setPopup_border(value: ThemeColor): Self = this.set("popup_border", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup_border: Self = this.set("popup_border", js.undefined)
    @scala.inline
    def setPopup_highlight(value: ThemeColor): Self = this.set("popup_highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup_highlight: Self = this.set("popup_highlight", js.undefined)
    @scala.inline
    def setPopup_highlight_text(value: ThemeColor): Self = this.set("popup_highlight_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup_highlight_text: Self = this.set("popup_highlight_text", js.undefined)
    @scala.inline
    def setPopup_text(value: ThemeColor): Self = this.set("popup_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup_text: Self = this.set("popup_text", js.undefined)
    @scala.inline
    def setSidebar(value: ThemeColor): Self = this.set("sidebar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebar: Self = this.set("sidebar", js.undefined)
    @scala.inline
    def setSidebar_border(value: ThemeColor): Self = this.set("sidebar_border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebar_border: Self = this.set("sidebar_border", js.undefined)
    @scala.inline
    def setSidebar_highlight(value: ThemeColor): Self = this.set("sidebar_highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebar_highlight: Self = this.set("sidebar_highlight", js.undefined)
    @scala.inline
    def setSidebar_highlight_text(value: ThemeColor): Self = this.set("sidebar_highlight_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebar_highlight_text: Self = this.set("sidebar_highlight_text", js.undefined)
    @scala.inline
    def setSidebar_text(value: ThemeColor): Self = this.set("sidebar_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebar_text: Self = this.set("sidebar_text", js.undefined)
    @scala.inline
    def setTab_background_separator(value: ThemeColor): Self = this.set("tab_background_separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab_background_separator: Self = this.set("tab_background_separator", js.undefined)
    @scala.inline
    def setTab_background_text(value: ThemeColor): Self = this.set("tab_background_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab_background_text: Self = this.set("tab_background_text", js.undefined)
    @scala.inline
    def setTab_line(value: ThemeColor): Self = this.set("tab_line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab_line: Self = this.set("tab_line", js.undefined)
    @scala.inline
    def setTab_loading(value: ThemeColor): Self = this.set("tab_loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab_loading: Self = this.set("tab_loading", js.undefined)
    @scala.inline
    def setTab_selected(value: ThemeColor): Self = this.set("tab_selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab_selected: Self = this.set("tab_selected", js.undefined)
    @scala.inline
    def setTab_text(value: ThemeColor): Self = this.set("tab_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTab_text: Self = this.set("tab_text", js.undefined)
    @scala.inline
    def setTextcolor(value: ThemeColor): Self = this.set("textcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextcolor: Self = this.set("textcolor", js.undefined)
    @scala.inline
    def setToolbar(value: ThemeColor): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setToolbar_bottom_separator(value: ThemeColor): Self = this.set("toolbar_bottom_separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_bottom_separator: Self = this.set("toolbar_bottom_separator", js.undefined)
    @scala.inline
    def setToolbar_field(value: ThemeColor): Self = this.set("toolbar_field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_field: Self = this.set("toolbar_field", js.undefined)
    @scala.inline
    def setToolbar_field_border(value: ThemeColor): Self = this.set("toolbar_field_border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_field_border: Self = this.set("toolbar_field_border", js.undefined)
    @scala.inline
    def setToolbar_field_border_focus(value: ThemeColor): Self = this.set("toolbar_field_border_focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_field_border_focus: Self = this.set("toolbar_field_border_focus", js.undefined)
    @scala.inline
    def setToolbar_field_focus(value: ThemeColor): Self = this.set("toolbar_field_focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_field_focus: Self = this.set("toolbar_field_focus", js.undefined)
    @scala.inline
    def setToolbar_field_highlight(value: ThemeColor): Self = this.set("toolbar_field_highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_field_highlight: Self = this.set("toolbar_field_highlight", js.undefined)
    @scala.inline
    def setToolbar_field_highlight_text(value: ThemeColor): Self = this.set("toolbar_field_highlight_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_field_highlight_text: Self = this.set("toolbar_field_highlight_text", js.undefined)
    @scala.inline
    def setToolbar_field_separator(value: ThemeColor): Self = this.set("toolbar_field_separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_field_separator: Self = this.set("toolbar_field_separator", js.undefined)
    @scala.inline
    def setToolbar_field_text(value: ThemeColor): Self = this.set("toolbar_field_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_field_text: Self = this.set("toolbar_field_text", js.undefined)
    @scala.inline
    def setToolbar_field_text_focus(value: ThemeColor): Self = this.set("toolbar_field_text_focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_field_text_focus: Self = this.set("toolbar_field_text_focus", js.undefined)
    @scala.inline
    def setToolbar_text(value: ThemeColor): Self = this.set("toolbar_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_text: Self = this.set("toolbar_text", js.undefined)
    @scala.inline
    def setToolbar_top_separator(value: ThemeColor): Self = this.set("toolbar_top_separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_top_separator: Self = this.set("toolbar_top_separator", js.undefined)
    @scala.inline
    def setToolbar_vertical_separator(value: ThemeColor): Self = this.set("toolbar_vertical_separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar_vertical_separator: Self = this.set("toolbar_vertical_separator", js.undefined)
  }
  
}

