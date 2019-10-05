package typings.dojo.dojox.highlight.languages.xquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/xquery.XQUERY_COMMENT.html
  *
  *
  */
trait XQUERY_COMMENT extends js.Object {
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

object XQUERY_COMMENT {
  @scala.inline
  def apply(begin: String, className: String, end: String): XQUERY_COMMENT = {
    val __obj = js.Dynamic.literal(begin = begin, className = className, end = end)
  
    __obj.asInstanceOf[XQUERY_COMMENT]
  }
}

