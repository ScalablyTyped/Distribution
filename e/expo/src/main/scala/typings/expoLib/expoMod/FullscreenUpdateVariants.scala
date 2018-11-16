package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FullscreenUpdateVariants extends js.Object

@JSImport("expo", "FullscreenUpdateVariants")
@js.native
object FullscreenUpdateVariants extends js.Object {
  @js.native
  sealed trait IOS_FULLSCREEN_UPDATE_PLAYER_DID_DISMISS
    extends expoLib.expoMod.FullscreenUpdateVariants
  
  @js.native
  sealed trait IOS_FULLSCREEN_UPDATE_PLAYER_DID_PRESENT
    extends expoLib.expoMod.FullscreenUpdateVariants
  
  @js.native
  sealed trait IOS_FULLSCREEN_UPDATE_PLAYER_WILL_DISMISS
    extends expoLib.expoMod.FullscreenUpdateVariants
  
  @js.native
  sealed trait IOS_FULLSCREEN_UPDATE_PLAYER_WILL_PRESENT
    extends expoLib.expoMod.FullscreenUpdateVariants
  
  /* 3 */ val IOS_FULLSCREEN_UPDATE_PLAYER_DID_DISMISS: IOS_FULLSCREEN_UPDATE_PLAYER_DID_DISMISS with scala.Double = js.native
  /* 1 */ val IOS_FULLSCREEN_UPDATE_PLAYER_DID_PRESENT: IOS_FULLSCREEN_UPDATE_PLAYER_DID_PRESENT with scala.Double = js.native
  /* 2 */ val IOS_FULLSCREEN_UPDATE_PLAYER_WILL_DISMISS: IOS_FULLSCREEN_UPDATE_PLAYER_WILL_DISMISS with scala.Double = js.native
  /* 0 */ val IOS_FULLSCREEN_UPDATE_PLAYER_WILL_PRESENT: IOS_FULLSCREEN_UPDATE_PLAYER_WILL_PRESENT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[expoLib.expoMod.FullscreenUpdateVariants with scala.Double] = js.native
}

