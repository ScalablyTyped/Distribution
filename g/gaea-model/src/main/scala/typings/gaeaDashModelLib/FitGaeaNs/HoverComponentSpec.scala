package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverComponentSpec extends js.Object {
  var height: scala.Double
  var hovering: scala.Boolean
  var left: scala.Double
  var top: scala.Double
  var width: scala.Double
}

object HoverComponentSpec {
  @scala.inline
  def apply(
    height: scala.Double,
    hovering: scala.Boolean,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double
  ): HoverComponentSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("hovering")(hovering)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[HoverComponentSpec]
  }
}

