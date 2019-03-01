package typings
package dygraphsLib.dygraphsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesProperties extends js.Object {
  var axis: scala.Double
  var color: java.lang.String
  var column: scala.Double
  var name: java.lang.String
  var visible: scala.Boolean
}

object SeriesProperties {
  @scala.inline
  def apply(
    axis: scala.Double,
    color: java.lang.String,
    column: scala.Double,
    name: java.lang.String,
    visible: scala.Boolean
  ): SeriesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axis")(axis)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SeriesProperties]
  }
}

