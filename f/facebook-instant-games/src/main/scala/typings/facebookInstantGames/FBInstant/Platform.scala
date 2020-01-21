package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the current platform that the user is playing on.
  */
/* Rewritten from type alias, can be one of: 
  - typings.facebookInstantGames.facebookInstantGamesStrings.IOS
  - typings.facebookInstantGames.facebookInstantGamesStrings.ANDROID
  - typings.facebookInstantGames.facebookInstantGamesStrings.WEB
  - typings.facebookInstantGames.facebookInstantGamesStrings.MOBILE_WEB
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  def ANDROID: typings.facebookInstantGames.facebookInstantGamesStrings.ANDROID = this.cast("ANDROID")
  @scala.inline
  def IOS: typings.facebookInstantGames.facebookInstantGamesStrings.IOS = this.cast("IOS")
  @scala.inline
  def MOBILE_WEB: typings.facebookInstantGames.facebookInstantGamesStrings.MOBILE_WEB = this.cast("MOBILE_WEB")
  @scala.inline
  def WEB: typings.facebookInstantGames.facebookInstantGamesStrings.WEB = this.cast("WEB")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

