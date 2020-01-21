package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LayoutTypes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.LayoutTypes")
@js.native
object LayoutTypes extends js.Object {
  //Used to set layout type as hierarchical layout
  @js.native
  sealed trait HierarchicalTree extends LayoutTypes
  
  //Used not to set any specific layout
  @js.native
  sealed trait None extends LayoutTypes
  
  //Used to set layout type as organnizational chart
  @js.native
  sealed trait OrganizationalChart extends LayoutTypes
  
  //Used to set layout type as radial tree
  @js.native
  sealed trait RadialTree extends LayoutTypes
  
  //Used to set layout type as symmetric layout
  @js.native
  sealed trait SymmetricLayout extends LayoutTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LayoutTypes with Double] = js.native
  /* 1 */ @js.native
  object HierarchicalTree extends TopLevel[HierarchicalTree with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object OrganizationalChart extends TopLevel[OrganizationalChart with Double]
  
  /* 3 */ @js.native
  object RadialTree extends TopLevel[RadialTree with Double]
  
  /* 4 */ @js.native
  object SymmetricLayout extends TopLevel[SymmetricLayout with Double]
  
}

