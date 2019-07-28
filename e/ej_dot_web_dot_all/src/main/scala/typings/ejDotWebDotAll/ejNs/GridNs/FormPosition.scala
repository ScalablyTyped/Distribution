package typings.ejDotWebDotAll.ejNs.GridNs

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
  
  /* 0 */ val BottomLeft: typings.ejDotWebDotAll.ejNs.GridNs.FormPosition.BottomLeft with Double = js.native
  /* 1 */ val TopRight: typings.ejDotWebDotAll.ejNs.GridNs.FormPosition.TopRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormPosition with Double] = js.native
}

