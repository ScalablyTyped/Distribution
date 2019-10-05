package typings.dojo.dojox.highlight.languages.xml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/xml.XML_ATTR.html
  *
  *
  */
trait XML_ATTR extends js.Object {
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
  var contains: js.Array[_]
  /**
    *
    */
  var end: String
}

object XML_ATTR {
  @scala.inline
  def apply(begin: String, className: String, contains: js.Array[_], end: String): XML_ATTR = {
    val __obj = js.Dynamic.literal(begin = begin, className = className, contains = contains, end = end)
  
    __obj.asInstanceOf[XML_ATTR]
  }
}

