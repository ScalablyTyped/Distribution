package typings.ejDotWebDotAll.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SearchHierarchyMode extends js.Object

@JSGlobal("ej.TreeGrid.SearchHierarchyMode")
@js.native
object SearchHierarchyMode extends js.Object {
  ///Filtered child records will be displayed with parents and parents will be displayed along with its children
  @js.native
  sealed trait Both extends SearchHierarchyMode
  
  ///Filtered child records will be displayed and parent records displayed along with its children.
  @js.native
  sealed trait Child extends SearchHierarchyMode
  
  ///Filtered records alone will be displayed without it parents or children
  @js.native
  sealed trait None extends SearchHierarchyMode
  
  ///Parent level records will be included in searching
  @js.native
  sealed trait Parent extends SearchHierarchyMode
  
  /* 2 */ val Both: typings.ejDotWebDotAll.ejNs.TreeGridNs.SearchHierarchyMode.Both with Double = js.native
  /* 1 */ val Child: typings.ejDotWebDotAll.ejNs.TreeGridNs.SearchHierarchyMode.Child with Double = js.native
  /* 3 */ val None: typings.ejDotWebDotAll.ejNs.TreeGridNs.SearchHierarchyMode.None with Double = js.native
  /* 0 */ val Parent: typings.ejDotWebDotAll.ejNs.TreeGridNs.SearchHierarchyMode.Parent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SearchHierarchyMode with Double] = js.native
}

