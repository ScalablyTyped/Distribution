package typings.dojo.dojox.highlight.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/xquery.html
  *
  *
  */
@JSName("xquery")
trait xquery_ extends js.Object {
  /**
    *
    */
  var XQUERY_COMMENT: js.Object
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

object xquery_ {
  @scala.inline
  def apply(XQUERY_COMMENT: js.Object, case_insensitive: Boolean, defaultMode: js.Object, modes: js.Array[_]): xquery_ = {
    val __obj = js.Dynamic.literal(XQUERY_COMMENT = XQUERY_COMMENT, case_insensitive = case_insensitive, defaultMode = defaultMode, modes = modes)
  
    __obj.asInstanceOf[xquery_]
  }
}

