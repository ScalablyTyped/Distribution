package typings.dojo.dojox.drawing.annotations

import typings.dojo.dojox.drawing.stencil.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/annotations/Arrow.html
  *
  * An annotation called internally to put an arrowhead
  * on ether end of a Line. Initiated in Arrow (and Vector)
  * with the optional params: arrowStart and arrowEnd. Both
  * default true for Axes.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.annotations.Arrow")
@js.native
class Arrow protected () extends Path {
  def this(options: js.Object) = this()
  /**
    *
    */
  var idx1: Double = js.native
  /**
    *
    */
  var idx2: Double = js.native
  /**
    *
    */
  var subShape: Boolean = js.native
  /**
    * Creates data used to draw arrow head.
    *
    * @param x1
    * @param y1
    * @param x2
    * @param y2
    * @param style
    */
  def arrowHead(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, style: js.Any): js.Array[_] = js.native
}

