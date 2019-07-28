package typings.ejDotWebDotAll.ejNs.TreeGridNs

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
  sealed trait Cancel extends UnboundType
  
  ///Unbound type to perform delete action
  @js.native
  sealed trait Delete extends UnboundType
  
  ///Unbound type to perform edit action
  @js.native
  sealed trait Edit extends UnboundType
  
  ///Unbound type to perform save action
  @js.native
  sealed trait Save extends UnboundType
  
  /* 3 */ val Cancel: typings.ejDotWebDotAll.ejNs.TreeGridNs.UnboundType.Cancel with Double = js.native
  /* 2 */ val Delete: typings.ejDotWebDotAll.ejNs.TreeGridNs.UnboundType.Delete with Double = js.native
  /* 0 */ val Edit: typings.ejDotWebDotAll.ejNs.TreeGridNs.UnboundType.Edit with Double = js.native
  /* 1 */ val Save: typings.ejDotWebDotAll.ejNs.TreeGridNs.UnboundType.Save with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnboundType with Double] = js.native
}

