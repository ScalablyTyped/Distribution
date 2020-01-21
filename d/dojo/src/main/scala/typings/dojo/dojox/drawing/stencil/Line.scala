package typings.dojo.dojox.drawing.stencil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/stencil/Line.html
  *
  * Creates a dojox.gfx Line based on data or points provided.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.stencil.Line")
@js.native
class Line protected () extends Base {
  def this(options: js.Any) = this()
  /**
    * The data used to create the dojox.gfx Shape, specify
    * x1,y1,x2,y2, or x,y,angle,radius
    *
    */
  var StencilData: js.Object = js.native
  /**
    *
    */
  var StencilPoints: js.Array[_] = js.native
  /**
    *
    */
  var anchorType: String = js.native
  /**
    *
    */
  var baseRender: Boolean = js.native
  /**
    * Converts data to points.
    *
    * @param o
    */
  def dataToPoints(o: js.Any): js.Array[_] = js.native
  /**
    * Converts points to data
    *
    * @param p
    */
  def pointsToData(p: js.Any): js.Object = js.native
}

