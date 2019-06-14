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
  
  /* 3 */ val Cancel: Cancel with scala.Double = js.native
  /* 2 */ val Delete: Delete with scala.Double = js.native
  /* 0 */ val Edit: Edit with scala.Double = js.native
  /* 1 */ val Save: Save with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.UnboundType with scala.Double] = js.native
}

