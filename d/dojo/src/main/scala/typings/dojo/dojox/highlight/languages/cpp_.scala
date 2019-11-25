package typings.dojo.dojox.highlight.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/cpp.html
  *
  * C++ highlight definitions
  *
  */
@JSName("cpp")
trait cpp_ extends js.Object {
  /**
    *
    */
  var defaultMode: js.Object
  /**
    *
    */
  var modes: js.Array[_]
}

object cpp_ {
  @scala.inline
  def apply(defaultMode: js.Object, modes: js.Array[_]): cpp_ = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[cpp_]
  }
}

