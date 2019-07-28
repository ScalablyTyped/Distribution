package typings.ejDotWebDotAll.ejNs.GridNs

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
  sealed trait Cancel extends UnboundType
  
  ///Unbound type is delete.
  @js.native
  sealed trait Delete extends UnboundType
  
  ///Unbound type is edit.
  @js.native
  sealed trait Edit extends UnboundType
  
  ///Unbound type is save.
  @js.native
  sealed trait Save extends UnboundType
  
  /* 3 */ val Cancel: typings.ejDotWebDotAll.ejNs.GridNs.UnboundType.Cancel with Double = js.native
  /* 2 */ val Delete: typings.ejDotWebDotAll.ejNs.GridNs.UnboundType.Delete with Double = js.native
  /* 0 */ val Edit: typings.ejDotWebDotAll.ejNs.GridNs.UnboundType.Edit with Double = js.native
  /* 1 */ val Save: typings.ejDotWebDotAll.ejNs.GridNs.UnboundType.Save with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnboundType with Double] = js.native
}

