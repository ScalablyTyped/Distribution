package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.facebookInstantGames.facebookInstantGamesStrings.INVITE
  - typings.facebookInstantGames.facebookInstantGamesStrings.REQUEST
  - typings.facebookInstantGames.facebookInstantGamesStrings.CHALLENGE
  - typings.facebookInstantGames.facebookInstantGamesStrings.SHARE
*/
trait Intent extends js.Object

object Intent {
  @scala.inline
  def CHALLENGE: typings.facebookInstantGames.facebookInstantGamesStrings.CHALLENGE = this.cast("CHALLENGE")
  @scala.inline
  def INVITE: typings.facebookInstantGames.facebookInstantGamesStrings.INVITE = this.cast("INVITE")
  @scala.inline
  def REQUEST: typings.facebookInstantGames.facebookInstantGamesStrings.REQUEST = this.cast("REQUEST")
  @scala.inline
  def SHARE: typings.facebookInstantGames.facebookInstantGamesStrings.SHARE = this.cast("SHARE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

