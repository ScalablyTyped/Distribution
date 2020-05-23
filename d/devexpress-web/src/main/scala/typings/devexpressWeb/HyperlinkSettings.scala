package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define a hyperlink.
  */
trait HyperlinkSettings extends js.Object {
  /**
    * Specifies a hyperlink's bookmark.
    */
  var bookmark: String
  /**
    * Specifies a hyperlink text.
    */
  var text: String
  /**
    * Specifies a tooltip text.
    */
  var tooltip: String
  /**
    * Specifies a hyperlink's destination.
    */
  var url: String
}

object HyperlinkSettings {
  @scala.inline
  def apply(bookmark: String, text: String, tooltip: String, url: String): HyperlinkSettings = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperlinkSettings]
  }
}

