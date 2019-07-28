package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Bottom extends VerticalAlignment
  
  //Used to align text Vertically on center of node/connector
  @js.native
  sealed trait Center extends VerticalAlignment
  
  //Used to align text Vertically on left side of node/connector
  @js.native
  sealed trait Top extends VerticalAlignment
  
  /* 2 */ val Bottom: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.VerticalAlignment.Bottom with Double = js.native
  /* 1 */ val Center: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.VerticalAlignment.Center with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.VerticalAlignment.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalAlignment with Double] = js.native
}

