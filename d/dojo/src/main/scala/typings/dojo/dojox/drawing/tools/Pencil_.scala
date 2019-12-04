package typings.dojo.dojox.drawing.tools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/tools/Pencil.html
  *
  * Class for a drawable, continuous Path
  *
  */
@JSGlobal("dojox.drawing.tools.Pencil")
@js.native
class Pencil_ ()
  extends typings.dojo.dojox.drawing.stencil.Path {
  /**
    *
    */
  var draws: Boolean = js.native
  /**
    * The distance the mouse must travel before rendering
    * a path segment. Lower number is a higher definition
    * path but more points.
    *
    */
  var minDist: Double = js.native
  /**
    *
    */
  var setup: js.Object = js.native
  /**
    *
    * @param obj
    */
  def onDown(obj: js.Any): Unit = js.native
  /**
    *
    * @param obj
    */
  def onDrag(obj: js.Any): Unit = js.native
  /**
    *
    * @param obj
    */
  def onUp(obj: js.Any): Unit = js.native
}

