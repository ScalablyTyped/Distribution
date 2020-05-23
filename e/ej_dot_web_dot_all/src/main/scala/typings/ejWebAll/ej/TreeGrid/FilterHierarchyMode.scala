package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterHierarchyMode extends js.Object

@JSGlobal("ej.TreeGrid.FilterHierarchyMode")
@js.native
object FilterHierarchyMode extends js.Object {
  ///shows the filtered record with both parent and child record
  @js.native
  sealed trait Both extends FilterHierarchyMode
  
  ///Shows the filtered record with child record
  @js.native
  sealed trait Child extends FilterHierarchyMode
  
  ///Shows only filtered record.
  @js.native
  sealed trait None extends FilterHierarchyMode
  
  ///Shows the filtered record with parent record
  @js.native
  sealed trait Parent extends FilterHierarchyMode
  
}

