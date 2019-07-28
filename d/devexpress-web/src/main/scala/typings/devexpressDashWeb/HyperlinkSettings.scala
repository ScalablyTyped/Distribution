package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define hyperlinks.
  */
trait HyperlinkSettings extends js.Object {
  /**
    * Gets or sets the associated bookmark.
    * Value: A string value specifying the bookmark name.
    */
  var bookmark: String
  /**
    * Gets or sets a text displayed for a hyperlink.
    * Value: A string value specifying the hyperlink display text.
    */
  var text: String
  /**
    * Gets or sets a text for the tooltip displayed when the mouse hovers over a hyperlink.
    * Value: A string containing the tooltip text.
    */
  var tooltip: String
  /**
    * Gets or sets the hyperlink destination.
    * Value: A string value that specifies the destination to which a hyperlink refers.
    */
  var url: String
}

object HyperlinkSettings {
  @scala.inline
  def apply(bookmark: String, text: String, tooltip: String, url: String): HyperlinkSettings = {
    val __obj = js.Dynamic.literal(bookmark = bookmark, text = text, tooltip = tooltip, url = url)
  
    __obj.asInstanceOf[HyperlinkSettings]
  }
}

