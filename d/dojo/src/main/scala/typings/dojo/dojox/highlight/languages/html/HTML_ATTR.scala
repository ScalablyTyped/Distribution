package typings.dojo.dojox.highlight.languages.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/html.HTML_ATTR.html
  *
  *
  */
trait HTML_ATTR extends js.Object {
  /**
    *
    */
  var begin: String
  /**
    *
    */
  var className: String
  /**
    *
    */
  var end: String
}

object HTML_ATTR {
  @scala.inline
  def apply(begin: String, className: String, end: String): HTML_ATTR = {
    val __obj = js.Dynamic.literal(begin = begin, className = className, end = end)
  
    __obj.asInstanceOf[HTML_ATTR]
  }
}

