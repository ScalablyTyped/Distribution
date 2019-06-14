package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Diagram.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  //Used to align text Vertically on bottom of node/connector
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.VerticalAlignment
  
  //Used to align text Vertically on center of node/connector
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.VerticalAlignment
  
  //Used to align text Vertically on left side of node/connector
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.VerticalAlignment
  
  /* 2 */ val Bottom: Bottom with scala.Double = js.native
  /* 1 */ val Center: Center with scala.Double = js.native
  /* 0 */ val Top: Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.VerticalAlignment with scala.Double
  ] = js.native
}

