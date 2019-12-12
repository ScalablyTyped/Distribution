package typings.ejDotWebDotAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Grid.UnboundType.Cancel
import typings.ejDotWebDotAll.ej.Grid.UnboundType.Delete
import typings.ejDotWebDotAll.ej.Grid.UnboundType.Edit
import typings.ejDotWebDotAll.ej.Grid.UnboundType.Save
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

