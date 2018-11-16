package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnboundType extends js.Object

@JSGlobal("ej.Grid.UnboundType")
@js.native
object UnboundType extends js.Object {
  ///Unbound type is cancel.
  @js.native
  sealed trait Cancel
    extends ejDotWebDotAllLib.ejNs.GridNs.UnboundType
  
  ///Unbound type is delete.
  @js.native
  sealed trait Delete
    extends ejDotWebDotAllLib.ejNs.GridNs.UnboundType
  
  ///Unbound type is edit.
  @js.native
  sealed trait Edit
    extends ejDotWebDotAllLib.ejNs.GridNs.UnboundType
  
  ///Unbound type is save.
  @js.native
  sealed trait Save
    extends ejDotWebDotAllLib.ejNs.GridNs.UnboundType
  
  val Cancel: Cancel with java.lang.String = js.native
  val Delete: Delete with java.lang.String = js.native
  val Edit: Edit with java.lang.String = js.native
  val Save: Save with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.UnboundType with java.lang.String] = js.native
}

