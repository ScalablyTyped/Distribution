package typings.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CheckState extends js.Object

@JSGlobal("ej.CheckState")
@js.native
object CheckState extends js.Object {
  //string
  @js.native
  sealed trait Check extends CheckState
  
  //string
  @js.native
  sealed trait Indeterminate extends CheckState
  
  //string
  @js.native
  sealed trait Uncheck extends CheckState
  
  /* 1 */ val Check: typings.ejDotWebDotAll.ej.CheckState.Check with Double = js.native
  /* 2 */ val Indeterminate: typings.ejDotWebDotAll.ej.CheckState.Indeterminate with Double = js.native
  /* 0 */ val Uncheck: typings.ejDotWebDotAll.ej.CheckState.Uncheck with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CheckState with Double] = js.native
}

