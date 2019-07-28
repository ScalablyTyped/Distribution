package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FullscreenUpdateVariants extends js.Object

@JSImport("expo", "FullscreenUpdateVariants")
@js.native
object FullscreenUpdateVariants extends js.Object {
  @js.native
  sealed trait IOS_FULLSCREEN_UPDATE_PLAYER_DID_DISMISS extends FullscreenUpdateVariants
  
  @js.native
  sealed trait IOS_FULLSCREEN_UPDATE_PLAYER_DID_PRESENT extends FullscreenUpdateVariants
  
  @js.native
  sealed trait IOS_FULLSCREEN_UPDATE_PLAYER_WILL_DISMISS extends FullscreenUpdateVariants
  
  @js.native
  sealed trait IOS_FULLSCREEN_UPDATE_PLAYER_WILL_PRESENT extends FullscreenUpdateVariants
  
  /* 3 */ val IOS_FULLSCREEN_UPDATE_PLAYER_DID_DISMISS: typings.expo.expoMod.FullscreenUpdateVariants.IOS_FULLSCREEN_UPDATE_PLAYER_DID_DISMISS with Double = js.native
  /* 1 */ val IOS_FULLSCREEN_UPDATE_PLAYER_DID_PRESENT: typings.expo.expoMod.FullscreenUpdateVariants.IOS_FULLSCREEN_UPDATE_PLAYER_DID_PRESENT with Double = js.native
  /* 2 */ val IOS_FULLSCREEN_UPDATE_PLAYER_WILL_DISMISS: typings.expo.expoMod.FullscreenUpdateVariants.IOS_FULLSCREEN_UPDATE_PLAYER_WILL_DISMISS with Double = js.native
  /* 0 */ val IOS_FULLSCREEN_UPDATE_PLAYER_WILL_PRESENT: typings.expo.expoMod.FullscreenUpdateVariants.IOS_FULLSCREEN_UPDATE_PLAYER_WILL_PRESENT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FullscreenUpdateVariants with Double] = js.native
}

