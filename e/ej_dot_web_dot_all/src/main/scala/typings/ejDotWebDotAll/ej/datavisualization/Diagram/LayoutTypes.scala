package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  
  /* 1 */ val HierarchicalTree: typings.ejDotWebDotAll.ej.datavisualization.Diagram.LayoutTypes.HierarchicalTree with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Diagram.LayoutTypes.None with Double = js.native
  /* 2 */ val OrganizationalChart: typings.ejDotWebDotAll.ej.datavisualization.Diagram.LayoutTypes.OrganizationalChart with Double = js.native
  /* 3 */ val RadialTree: typings.ejDotWebDotAll.ej.datavisualization.Diagram.LayoutTypes.RadialTree with Double = js.native
  /* 4 */ val SymmetricLayout: typings.ejDotWebDotAll.ej.datavisualization.Diagram.LayoutTypes.SymmetricLayout with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LayoutTypes with Double] = js.native
}

