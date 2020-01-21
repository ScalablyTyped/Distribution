package typings.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper around a path and its value.
  **/
trait PathValue_ extends js.Object {
  var path: String | PathSet
  var value: js.Any
}

object PathValue_ {
  @scala.inline
  def apply(path: String | PathSet, value: js.Any): PathValue_ = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathValue_]
  }
}

