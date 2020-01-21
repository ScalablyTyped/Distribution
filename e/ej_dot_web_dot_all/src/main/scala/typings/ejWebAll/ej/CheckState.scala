package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CheckState with Double] = js.native
  /* 1 */ @js.native
  object Check extends TopLevel[Check with Double]
  
  /* 2 */ @js.native
  object Indeterminate extends TopLevel[Indeterminate with Double]
  
  /* 0 */ @js.native
  object Uncheck extends TopLevel[Uncheck with Double]
  
}

