package typings
package atEgjsAxesLib.constMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DIRECTION extends js.Object

@JSImport("@egjs/axes/const", "DIRECTION")
@js.native
object DIRECTION extends js.Object {
  @js.native
  sealed trait DIRECTION_ALL
    extends atEgjsAxesLib.constMod.DIRECTION
  
  @js.native
  sealed trait DIRECTION_DOWN
    extends atEgjsAxesLib.constMod.DIRECTION
  
  @js.native
  sealed trait DIRECTION_HORIZONTAL
    extends atEgjsAxesLib.constMod.DIRECTION
  
  @js.native
  sealed trait DIRECTION_LEFT
    extends atEgjsAxesLib.constMod.DIRECTION
  
  @js.native
  sealed trait DIRECTION_NONE
    extends atEgjsAxesLib.constMod.DIRECTION
  
  @js.native
  sealed trait DIRECTION_RIGHT
    extends atEgjsAxesLib.constMod.DIRECTION
  
  @js.native
  sealed trait DIRECTION_UP
    extends atEgjsAxesLib.constMod.DIRECTION
  
  @js.native
  sealed trait DIRECTION_VERTICAL
    extends atEgjsAxesLib.constMod.DIRECTION
  
  /* 30 */ val DIRECTION_ALL: DIRECTION_ALL with scala.Double = js.native
  /* 16 */ val DIRECTION_DOWN: DIRECTION_DOWN with scala.Double = js.native
  /* 6 */ val DIRECTION_HORIZONTAL: DIRECTION_HORIZONTAL with scala.Double = js.native
  /* 2 */ val DIRECTION_LEFT: DIRECTION_LEFT with scala.Double = js.native
  /* 1 */ val DIRECTION_NONE: DIRECTION_NONE with scala.Double = js.native
  /* 4 */ val DIRECTION_RIGHT: DIRECTION_RIGHT with scala.Double = js.native
  /* 8 */ val DIRECTION_UP: DIRECTION_UP with scala.Double = js.native
  /* 24 */ val DIRECTION_VERTICAL: DIRECTION_VERTICAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atEgjsAxesLib.constMod.DIRECTION with scala.Double] = js.native
}

