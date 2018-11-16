package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

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
  sealed trait Both
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SearchHierarchyMode
  
  ///Filtered child records will be displayed and parent records displayed along with its children.
  @js.native
  sealed trait Child
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SearchHierarchyMode
  
  ///Filtered records alone will be displayed without it parents or children
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SearchHierarchyMode
  
  ///Parent level records will be included in searching
  @js.native
  sealed trait Parent
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SearchHierarchyMode
  
  val Both: Both with java.lang.String = js.native
  val Child: Child with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Parent: Parent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.SearchHierarchyMode with java.lang.String] = js.native
}

