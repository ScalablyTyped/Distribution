package typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A wrapper around a path and its value.
  **/
trait PathValue extends js.Object {
  var path: String | PathSet
  var value: js.Any
}

object PathValue {
  @scala.inline
  def apply(path: String | PathSet, value: js.Any): PathValue = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathValue]
  }
}

@JSImport("falcor-json-graph", "pathValue")
@js.native
object pathValue extends js.Object {
  def apply(path: String, value: js.Any): PathValue = js.native
  def apply(path: PathSet, value: js.Any): PathValue = js.native
}

