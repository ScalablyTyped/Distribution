package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.TreeGrid.UnboundType.Cancel
import typings.ejDotWebDotAll.ej.TreeGrid.UnboundType.Delete
import typings.ejDotWebDotAll.ej.TreeGrid.UnboundType.Edit
import typings.ejDotWebDotAll.ej.TreeGrid.UnboundType.Save
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnboundType with Double] = js.native
  /* 3 */ @js.native
  object Cancel extends TopLevel[Cancel with Double]
  
  /* 2 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 0 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  /* 1 */ @js.native
  object Save extends TopLevel[Save with Double]
  
}

