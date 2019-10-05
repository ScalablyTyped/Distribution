package typings.dojo.dojox.highlight.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/html.html
  *
  *
  */
@JSName("html")
trait html_ extends js.Object {
  /**
    *
    */
  var HTML_ATTR: js.Object
  /**
    *
    */
  var HTML_DOCTYPE: js.Object
  /**
    *
    */
  var HTML_TAGS: js.Object
  /**
    *
    */
  var HTML_VALUE: js.Object
  /**
    *
    */
  var case_insensitive: Boolean
  /**
    *
    */
  var defaultMode: js.Object
  /**
    *
    */
  var modes: js.Array[_]
}

object html_ {
  @scala.inline
  def apply(
    HTML_ATTR: js.Object,
    HTML_DOCTYPE: js.Object,
    HTML_TAGS: js.Object,
    HTML_VALUE: js.Object,
    case_insensitive: Boolean,
    defaultMode: js.Object,
    modes: js.Array[_]
  ): html_ = {
    val __obj = js.Dynamic.literal(HTML_ATTR = HTML_ATTR, HTML_DOCTYPE = HTML_DOCTYPE, HTML_TAGS = HTML_TAGS, HTML_VALUE = HTML_VALUE, case_insensitive = case_insensitive, defaultMode = defaultMode, modes = modes)
  
    __obj.asInstanceOf[html_]
  }
}

