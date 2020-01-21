package typings.ejWebAll.ej.Gantt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.Gantt.SelectionType")
@js.native
object SelectionType extends js.Object {
  ///you can select a multiple row.
  @js.native
  sealed trait Multiple extends SelectionType
  
  ///you can select a single row.
  @js.native
  sealed trait Single extends SelectionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
  /* 1 */ @js.native
  object Multiple extends TopLevel[Multiple with Double]
  
  /* 0 */ @js.native
  object Single extends TopLevel[Single with Double]
  
}

