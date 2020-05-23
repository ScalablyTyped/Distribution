package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

