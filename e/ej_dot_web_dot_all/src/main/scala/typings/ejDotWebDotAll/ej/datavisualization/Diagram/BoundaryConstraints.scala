package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BoundaryConstraints.Infinite
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BoundaryConstraints.Page
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BoundaryConstraints with Double] = js.native
  /* 1 */ @js.native
  object Diagram
    extends TopLevel[
          typings.ejDotWebDotAll.ej.datavisualization.Diagram.BoundaryConstraints.Diagram with Double
        ]
  
  /* 0 */ @js.native
  object Infinite extends TopLevel[Infinite with Double]
  
  /* 2 */ @js.native
  object Page extends TopLevel[Page with Double]
  
}

