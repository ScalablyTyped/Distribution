package typings.dojo.dojox.highlight.languages.pygments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/pygments/javascript.html
  *
  *
  */
trait javascript_ extends js.Object {
  /**
    *
    */
  var defaultMode: js.Object
  /**
    *
    */
  var modes: js.Array[_]
}

object javascript_ {
  @scala.inline
  def apply(defaultMode: js.Object, modes: js.Array[_]): javascript_ = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any])
    __obj.asInstanceOf[javascript_]
  }
}

