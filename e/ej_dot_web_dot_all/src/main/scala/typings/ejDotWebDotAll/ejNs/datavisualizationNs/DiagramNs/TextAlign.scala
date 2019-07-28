package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlign extends js.Object

@JSGlobal("ej.datavisualization.Diagram.TextAlign")
@js.native
object TextAlign extends js.Object {
  //Used to align text on center of node/connector
  @js.native
  sealed trait Center
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.TextAlign
  
  //Used to align text on left side of node/connector
  @js.native
  sealed trait Left
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.TextAlign
  
  //Used to align text on Right side of node/connector
  @js.native
  sealed trait Right
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.TextAlign
  
  /* 1 */ val Center: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.TextAlign.Center with Double = js.native
  /* 0 */ val Left: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.TextAlign.Left with Double = js.native
  /* 2 */ val Right: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.TextAlign.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.TextAlign with Double] = js.native
}

