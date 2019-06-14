package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnboundType extends js.Object

@JSGlobal("ej.TreeGrid.UnboundType")
@js.native
object UnboundType extends js.Object {
  ///Unbound type to perform cancel action
  @js.native
  sealed trait Cancel
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.UnboundType
  
  ///Unbound type to perform delete action
  @js.native
  sealed trait Delete
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.UnboundType
  
  ///Unbound type to perform edit action
  @js.native
  sealed trait Edit
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.UnboundType
  
  ///Unbound type to perform save action
  @js.native
  sealed trait Save
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.UnboundType
  
  /* 3 */ val Cancel: Cancel with scala.Double = js.native
  /* 2 */ val Delete: Delete with scala.Double = js.native
  /* 0 */ val Edit: Edit with scala.Double = js.native
  /* 1 */ val Save: Save with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.UnboundType with scala.Double] = js.native
}

