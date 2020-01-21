package typings.ejWebAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormPosition extends js.Object

@JSGlobal("ej.Grid.FormPosition")
@js.native
object FormPosition extends js.Object {
  ///Form position is bottomleft.
  @js.native
  sealed trait BottomLeft extends FormPosition
  
  ///Form position is topright.
  @js.native
  sealed trait TopRight extends FormPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormPosition with Double] = js.native
  /* 0 */ @js.native
  object BottomLeft extends TopLevel[BottomLeft with Double]
  
  /* 1 */ @js.native
  object TopRight extends TopLevel[TopRight with Double]
  
}

