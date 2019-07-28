package typings.ejDotWebDotAll.ejNs.TreeGridNs

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
  
  /* 2 */ val Both: typings.ejDotWebDotAll.ejNs.TreeGridNs.FilterHierarchyMode.Both with Double = js.native
  /* 1 */ val Child: typings.ejDotWebDotAll.ejNs.TreeGridNs.FilterHierarchyMode.Child with Double = js.native
  /* 3 */ val None: typings.ejDotWebDotAll.ejNs.TreeGridNs.FilterHierarchyMode.None with Double = js.native
  /* 0 */ val Parent: typings.ejDotWebDotAll.ejNs.TreeGridNs.FilterHierarchyMode.Parent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterHierarchyMode with Double] = js.native
}

