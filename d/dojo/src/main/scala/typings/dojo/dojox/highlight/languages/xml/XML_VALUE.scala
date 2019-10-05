package typings.dojo.dojox.highlight.languages.xml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/xml.XML_VALUE.html
  *
  *
  */
trait XML_VALUE extends js.Object {
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

object XML_VALUE {
  @scala.inline
  def apply(begin: String, className: String, end: String): XML_VALUE = {
    val __obj = js.Dynamic.literal(begin = begin, className = className, end = end)
  
    __obj.asInstanceOf[XML_VALUE]
  }
}

