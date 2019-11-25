package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.INVITE
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.REQUEST
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.CHALLENGE
  - typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.SHARE
*/
trait Intent extends js.Object

object Intent {
  @scala.inline
  def CHALLENGE: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.CHALLENGE = this.cast("CHALLENGE")
  @scala.inline
  def INVITE: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.INVITE = this.cast("INVITE")
  @scala.inline
  def REQUEST: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.REQUEST = this.cast("REQUEST")
  @scala.inline
  def SHARE: typings.facebookDashInstantDashGames.facebookDashInstantDashGamesStrings.SHARE = this.cast("SHARE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

