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
  
  val Cancel: Cancel with java.lang.String = js.native
  val Delete: Delete with java.lang.String = js.native
  val Edit: Edit with java.lang.String = js.native
  val Save: Save with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.UnboundType with java.lang.String] = js.native
}

