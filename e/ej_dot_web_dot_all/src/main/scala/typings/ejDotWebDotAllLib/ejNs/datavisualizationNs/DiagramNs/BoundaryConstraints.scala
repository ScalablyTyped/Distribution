package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BoundaryConstraints extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BoundaryConstraints")
@js.native
object BoundaryConstraints extends js.Object {
  //Used to set boundaryConstraints as Diagram
  @js.native
  sealed trait Diagram
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BoundaryConstraints
  
  //Used to set boundaryConstraints as Infinite
  @js.native
  sealed trait Infinite
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BoundaryConstraints
  
  //Used to set boundaryConstraints as Page
  @js.native
  sealed trait Page
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BoundaryConstraints
  
  /* 1 */ val Diagram: Diagram with scala.Double = js.native
  /* 0 */ val Infinite: Infinite with scala.Double = js.native
  /* 2 */ val Page: Page with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BoundaryConstraints with scala.Double
  ] = js.native
}

