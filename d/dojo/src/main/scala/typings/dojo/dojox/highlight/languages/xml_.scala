package typings.dojo.dojox.highlight.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/xml.html
  *
  *
  */
@JSName("xml")
trait xml_ extends js.Object {
  /**
    *
    */
  var XML_ATTR: js.Object
  /**
    *
    */
  var XML_COMMENT: js.Object
  /**
    *
    */
  var XML_VALUE: js.Object
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

object xml_ {
  @scala.inline
  def apply(
    XML_ATTR: js.Object,
    XML_COMMENT: js.Object,
    XML_VALUE: js.Object,
    case_insensitive: Boolean,
    defaultMode: js.Object,
    modes: js.Array[_]
  ): xml_ = {
    val __obj = js.Dynamic.literal(XML_ATTR = XML_ATTR, XML_COMMENT = XML_COMMENT, XML_VALUE = XML_VALUE, case_insensitive = case_insensitive, defaultMode = defaultMode, modes = modes)
  
    __obj.asInstanceOf[xml_]
  }
}

