package typings.dojo.dojox.highlight.languages.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/html.HTML_DOCTYPE.html
  *
  *
  */
trait HTML_DOCTYPE extends js.Object {
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
  /**
    *
    */
  var relevance: Double
}

object HTML_DOCTYPE {
  @scala.inline
  def apply(begin: String, className: String, end: String, relevance: Double): HTML_DOCTYPE = {
    val __obj = js.Dynamic.literal(begin = begin, className = className, end = end, relevance = relevance)
  
    __obj.asInstanceOf[HTML_DOCTYPE]
  }
}

