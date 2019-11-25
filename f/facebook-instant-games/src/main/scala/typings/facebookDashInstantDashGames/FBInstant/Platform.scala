package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the current platform that the user is playing on.
  */
/* Rewritten from type alias, can be one of: 
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.IOS
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.ANDROID
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.WEB
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.MOBILE_WEB
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  def ANDROID: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.ANDROID = this.cast("ANDROID")
  @scala.inline
  def IOS: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.IOS = this.cast("IOS")
  @scala.inline
  def MOBILE_WEB: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.MOBILE_WEB = this.cast("MOBILE_WEB")
  @scala.inline
  def WEB: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.WEB = this.cast("WEB")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

