package typings.atEgjsAxes.constMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DIRECTION extends js.Object

@JSImport("@egjs/axes/const", "DIRECTION")
@js.native
object DIRECTION extends js.Object {
  @js.native
  sealed trait DIRECTION_ALL extends DIRECTION
  
  @js.native
  sealed trait DIRECTION_DOWN extends DIRECTION
  
  @js.native
  sealed trait DIRECTION_HORIZONTAL extends DIRECTION
  
  @js.native
  sealed trait DIRECTION_LEFT extends DIRECTION
  
  @js.native
  sealed trait DIRECTION_NONE extends DIRECTION
  
  @js.native
  sealed trait DIRECTION_RIGHT extends DIRECTION
  
  @js.native
  sealed trait DIRECTION_UP extends DIRECTION
  
  @js.native
  sealed trait DIRECTION_VERTICAL extends DIRECTION
  
  /* 30 */ val DIRECTION_ALL: typings.atEgjsAxes.constMod.DIRECTION.DIRECTION_ALL with Double = js.native
  /* 16 */ val DIRECTION_DOWN: typings.atEgjsAxes.constMod.DIRECTION.DIRECTION_DOWN with Double = js.native
  /* 6 */ val DIRECTION_HORIZONTAL: typings.atEgjsAxes.constMod.DIRECTION.DIRECTION_HORIZONTAL with Double = js.native
  /* 2 */ val DIRECTION_LEFT: typings.atEgjsAxes.constMod.DIRECTION.DIRECTION_LEFT with Double = js.native
  /* 1 */ val DIRECTION_NONE: typings.atEgjsAxes.constMod.DIRECTION.DIRECTION_NONE with Double = js.native
  /* 4 */ val DIRECTION_RIGHT: typings.atEgjsAxes.constMod.DIRECTION.DIRECTION_RIGHT with Double = js.native
  /* 8 */ val DIRECTION_UP: typings.atEgjsAxes.constMod.DIRECTION.DIRECTION_UP with Double = js.native
  /* 24 */ val DIRECTION_VERTICAL: typings.atEgjsAxes.constMod.DIRECTION.DIRECTION_VERTICAL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DIRECTION with Double] = js.native
}

