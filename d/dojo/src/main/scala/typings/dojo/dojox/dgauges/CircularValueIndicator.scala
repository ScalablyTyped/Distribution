package typings.dojo.dojox.dgauges

import typings.dojo.dojox.gfx.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/CircularValueIndicator.html
  *
  * The circular value indicator, typically used for creating needles.
  *
  */
@JSGlobal("dojox.dgauges.CircularValueIndicator")
@js.native
class CircularValueIndicator () extends ScaleIndicatorBase {
  /**
    * Draws the indicator. The rotation center is at (0, 0).
    *
    * @param group A GFX group for drawing.
    * @param indicator A reference to this indicator.
    */
  def indicatorShapeFunc(group: Group, indicator: IndicatorBase): js.Any = js.native
}

