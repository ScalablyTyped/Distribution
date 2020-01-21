package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.facebookInstantGames.facebookInstantGamesStrings.POST
  - typings.facebookInstantGames.facebookInstantGamesStrings.THREAD
  - typings.facebookInstantGames.facebookInstantGamesStrings.GROUP
  - typings.facebookInstantGames.facebookInstantGamesStrings.SOLO
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def GROUP: typings.facebookInstantGames.facebookInstantGamesStrings.GROUP = this.cast("GROUP")
  @scala.inline
  def POST: typings.facebookInstantGames.facebookInstantGamesStrings.POST = this.cast("POST")
  @scala.inline
  def SOLO: typings.facebookInstantGames.facebookInstantGamesStrings.SOLO = this.cast("SOLO")
  @scala.inline
  def THREAD: typings.facebookInstantGames.facebookInstantGamesStrings.THREAD = this.cast("THREAD")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

