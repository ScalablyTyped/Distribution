package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  sealed trait Diagram extends BoundaryConstraints
  
  //Used to set boundaryConstraints as Infinite
  @js.native
  sealed trait Infinite extends BoundaryConstraints
  
  //Used to set boundaryConstraints as Page
  @js.native
  sealed trait Page extends BoundaryConstraints
  
  /* 1 */ val Diagram: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BoundaryConstraints.Diagram with Double = js.native
  /* 0 */ val Infinite: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BoundaryConstraints.Infinite with Double = js.native
  /* 2 */ val Page: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BoundaryConstraints.Page with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BoundaryConstraints with Double] = js.native
}

