package typings.dplayer.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dplayer.dplayerStrings.webvtt
  - typings.dplayer.dplayerStrings.ass
*/
trait SubTitleType extends js.Object

object SubTitleType {
  @scala.inline
  def ass: typings.dplayer.dplayerStrings.ass = this.cast("ass")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def webvtt: typings.dplayer.dplayerStrings.webvtt = this.cast("webvtt")
}

