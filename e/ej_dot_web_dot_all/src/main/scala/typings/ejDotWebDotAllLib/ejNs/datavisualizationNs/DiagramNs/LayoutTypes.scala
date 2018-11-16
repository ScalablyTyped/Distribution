package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait HierarchicalTree
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LayoutTypes
  
  //Used not to set any specific layout
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LayoutTypes
  
  //Used to set layout type as organnizational chart
  @js.native
  sealed trait OrganizationalChart
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LayoutTypes
  
  //Used to set layout type as radial tree
  @js.native
  sealed trait RadialTree
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LayoutTypes
  
  //Used to set layout type as symmetric layout
  @js.native
  sealed trait SymmetricLayout
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LayoutTypes
  
  val HierarchicalTree: HierarchicalTree with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val OrganizationalChart: OrganizationalChart with java.lang.String = js.native
  val RadialTree: RadialTree with java.lang.String = js.native
  val SymmetricLayout: SymmetricLayout with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LayoutTypes with java.lang.String
  ] = js.native
}

