package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.TreeGrid.FilterHierarchyMode.Both
import typings.ejDotWebDotAll.ej.TreeGrid.FilterHierarchyMode.Child
import typings.ejDotWebDotAll.ej.TreeGrid.FilterHierarchyMode.None
import typings.ejDotWebDotAll.ej.TreeGrid.FilterHierarchyMode.Parent
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterHierarchyMode with Double] = js.native
  /* 2 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 1 */ @js.native
  object Child extends TopLevel[Child with Double]
  
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 0 */ @js.native
  object Parent extends TopLevel[Parent with Double]
  
}

