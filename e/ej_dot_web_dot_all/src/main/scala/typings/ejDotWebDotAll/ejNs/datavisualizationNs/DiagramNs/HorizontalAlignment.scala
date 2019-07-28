package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Diagram.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  //Used to align text horizontally on center of node/connector
  @js.native
  sealed trait Center extends HorizontalAlignment
  
  //Used to align text horizontally on left side of node/connector
  @js.native
  sealed trait Left extends HorizontalAlignment
  
  //Used to align text horizontally on right side of node/connector
  @js.native
  sealed trait Right extends HorizontalAlignment
  
  /* 1 */ val Center: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.HorizontalAlignment.Center with Double = js.native
  /* 0 */ val Left: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.HorizontalAlignment.Left with Double = js.native
  /* 2 */ val Right: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.HorizontalAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalAlignment with Double] = js.native
}

