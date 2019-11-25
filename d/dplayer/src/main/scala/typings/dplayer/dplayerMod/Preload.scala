package typings.dplayer.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dplayer.dplayerStrings.none
  - typings.dplayer.dplayerStrings.metadata
  - typings.dplayer.dplayerStrings.auto
*/
trait Preload extends js.Object

object Preload {
  @scala.inline
  def auto: typings.dplayer.dplayerStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def metadata: typings.dplayer.dplayerStrings.metadata = this.cast("metadata")
  @scala.inline
  def none: typings.dplayer.dplayerStrings.none = this.cast("none")
}

