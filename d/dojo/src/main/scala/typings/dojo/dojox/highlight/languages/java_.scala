package typings.dojo.dojox.highlight.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/java.html
  *
  * Java highlight definitions
  *
  */
@JSName("java")
trait java_ extends js.Object {
  /**
    *
    */
  var defaultMode: js.Object
  /**
    *
    */
  var modes: js.Array[_]
}

object java_ {
  @scala.inline
  def apply(defaultMode: js.Object, modes: js.Array[_]): java_ = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode, modes = modes)
  
    __obj.asInstanceOf[java_]
  }
}

