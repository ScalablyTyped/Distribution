package typings.dojo.dojox.drawing.tools.custom

import typings.dojo.dojox.drawing.tools.Arrow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/tools/custom/Vector.html
  *
  * Creates a Vector Stencil.
  * Generally the same as an arrow, except that the arrow
  * head is only at the end. There is additionaly functionality
  * to allow for a 'zero vector' - one with no length.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.tools.custom.Vector")
@js.native
class Vector_ protected () extends Arrow {
  def this(options: js.Any) = this()
  /**
    * Called from anchor point mouse drag
    *
    * @param x
    * @param y
    */
  def anchorConstrain(x: js.Any, y: js.Any): js.Any = js.native
  /**
    * Converts a vector to and from the z axis.
    * If passed a cosphi value that is used to set
    * the axis, otherwise it is the opp of what it is.
    *
    * @param cosphi
    */
  def changeAxis(cosphi: js.Any): Unit = js.native
  /**
    * Takes any point and converts it to
    * be on the z-axis.
    *
    * @param obj
    */
  def zPoint(obj: js.Any): js.Any = js.native
}

