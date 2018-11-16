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
  
  val Both: Both with java.lang.String = js.native
  val Child: Child with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Parent: Parent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.FilterHierarchyMode with java.lang.String] = js.native
}

