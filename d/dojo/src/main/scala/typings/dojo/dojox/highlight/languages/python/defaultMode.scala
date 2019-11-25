package typings.dojo.dojox.highlight.languages.python

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/python.defaultMode.html
  *
  *
  */
trait defaultMode extends js.Object {
  /**
    *
    */
  var contains: js.Array[_]
  /**
    *
    */
  var illegal: String
  /**
    *
    */
  var keywords: js.Object
  /**
    *
    */
  var lexems: js.Array[_]
}

object defaultMode {
  @scala.inline
  def apply(contains: js.Array[_], illegal: String, keywords: js.Object, lexems: js.Array[_]): defaultMode = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any], illegal = illegal.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], lexems = lexems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[defaultMode]
  }
}

