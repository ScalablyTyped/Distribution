package typings.ejWebAll.ej.Grid

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
  
}

