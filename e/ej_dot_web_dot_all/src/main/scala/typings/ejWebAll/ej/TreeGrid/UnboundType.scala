package typings.ejWebAll.ej.TreeGrid

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
  
}

