package typings.dojo.dojox.highlight.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/sql.html
  *
  * SQL highlight definitions
  *
  */
trait sql_ extends js.Object {
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

object sql_ {
  @scala.inline
  def apply(case_insensitive: Boolean, defaultMode: js.Object, modes: js.Array[_]): sql_ = {
    val __obj = js.Dynamic.literal(case_insensitive = case_insensitive.asInstanceOf[js.Any], defaultMode = defaultMode.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any])
    __obj.asInstanceOf[sql_]
  }
}

