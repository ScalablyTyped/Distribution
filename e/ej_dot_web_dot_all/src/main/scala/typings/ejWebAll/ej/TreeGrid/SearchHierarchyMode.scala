package typings.ejWebAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SearchHierarchyMode with Double] = js.native
  /* 2 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 1 */ @js.native
  object Child extends TopLevel[Child with Double]
  
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 0 */ @js.native
  object Parent extends TopLevel[Parent with Double]
  
}

