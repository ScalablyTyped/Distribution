package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

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
  sealed trait Both
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.FilterHierarchyMode
  
  ///Shows the filtered record with child record
  @js.native
  sealed trait Child
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.FilterHierarchyMode
  
  ///Shows only filtered record.
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.FilterHierarchyMode
  
  ///Shows the filtered record with parent record
  @js.native
  sealed trait Parent
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.FilterHierarchyMode
  
  /* 2 */ val Both: Both with scala.Double = js.native
  /* 1 */ val Child: Child with scala.Double = js.native
  /* 3 */ val None: None with scala.Double = js.native
  /* 0 */ val Parent: Parent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.FilterHierarchyMode with scala.Double] = js.native
}

