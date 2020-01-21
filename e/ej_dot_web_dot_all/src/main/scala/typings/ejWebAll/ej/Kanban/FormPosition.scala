package typings.ejWebAll.ej.Kanban

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormPosition extends js.Object

@JSGlobal("ej.Kanban.FormPosition")
@js.native
object FormPosition extends js.Object {
  ///Form position is bottom.
  @js.native
  sealed trait Bottom extends FormPosition
  
  ///Form position is right.
  @js.native
  sealed trait Right extends FormPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormPosition with Double] = js.native
  /* 0 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 1 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

