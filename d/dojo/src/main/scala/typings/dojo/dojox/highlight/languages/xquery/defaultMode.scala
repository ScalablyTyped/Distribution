package typings.dojo.dojox.highlight.languages.xquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/xquery.defaultMode.html
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
  var keywords: js.Object
  /**
    *
    */
  var lexems: js.Array[_]
}

object defaultMode {
  @scala.inline
  def apply(contains: js.Array[_], keywords: js.Object, lexems: js.Array[_]): defaultMode = {
    val __obj = js.Dynamic.literal(contains = contains, keywords = keywords, lexems = lexems)
  
    __obj.asInstanceOf[defaultMode]
  }
}

