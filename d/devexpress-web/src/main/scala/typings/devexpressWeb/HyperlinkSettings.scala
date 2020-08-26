package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define a hyperlink.
  */
@js.native
trait HyperlinkSettings extends js.Object {
  /**
    * Specifies a hyperlink's bookmark.
    */
  var bookmark: String = js.native
  /**
    * Specifies a hyperlink text.
    */
  var text: String = js.native
  /**
    * Specifies a tooltip text.
    */
  var tooltip: String = js.native
  /**
    * Specifies a hyperlink's destination.
    */
  var url: String = js.native
}

object HyperlinkSettings {
  @scala.inline
  def apply(bookmark: String, text: String, tooltip: String, url: String): HyperlinkSettings = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperlinkSettings]
  }
  @scala.inline
  implicit class HyperlinkSettingsOps[Self <: HyperlinkSettings] (val x: Self) extends AnyVal {
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
    def setBookmark(value: String): Self = this.set("bookmark", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

