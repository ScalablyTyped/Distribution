package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.TreeGrid.SelectionType.Checkbox
import typings.ejDotWebDotAll.ej.TreeGrid.SelectionType.Multiple
import typings.ejDotWebDotAll.ej.TreeGrid.SelectionType.Single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.TreeGrid.SelectionType")
@js.native
object SelectionType extends js.Object {
  ///you can select rows using checkbox.
  @js.native
  sealed trait Checkbox extends SelectionType
  
  ///you can select a multiple row.
  @js.native
  sealed trait Multiple extends SelectionType
  
  ///you can select a single row.
  @js.native
  sealed trait Single extends SelectionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
  /* 2 */ @js.native
  object Checkbox extends TopLevel[Checkbox with Double]
  
  /* 1 */ @js.native
  object Multiple extends TopLevel[Multiple with Double]
  
  /* 0 */ @js.native
  object Single extends TopLevel[Single with Double]
  
}

