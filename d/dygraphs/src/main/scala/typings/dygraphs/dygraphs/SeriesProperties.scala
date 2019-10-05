package typings.dygraphs.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesProperties extends js.Object {
  var axis: Double
  var color: String
  var column: Double
  var name: String
  var visible: Boolean
}

object SeriesProperties {
  @scala.inline
  def apply(axis: Double, color: String, column: Double, name: String, visible: Boolean): SeriesProperties = {
    val __obj = js.Dynamic.literal(axis = axis, color = color, column = column, name = name, visible = visible)
  
    __obj.asInstanceOf[SeriesProperties]
  }
}

