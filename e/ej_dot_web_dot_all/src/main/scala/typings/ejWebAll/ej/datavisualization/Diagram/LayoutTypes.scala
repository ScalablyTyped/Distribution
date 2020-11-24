package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
