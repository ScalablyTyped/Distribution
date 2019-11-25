package typings.dplayer.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dplayer.dplayerStrings.auto
  - typings.dplayer.dplayerStrings.hls
  - typings.dplayer.dplayerStrings.flv
  - typings.dplayer.dplayerStrings.dash
  - typings.dplayer.dplayerStrings.webtorrent
  - typings.dplayer.dplayerStrings.normal
*/
trait VideoType extends js.Object

object VideoType {
  @scala.inline
  def auto: typings.dplayer.dplayerStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dash: typings.dplayer.dplayerStrings.dash = this.cast("dash")
  @scala.inline
  def flv: typings.dplayer.dplayerStrings.flv = this.cast("flv")
  @scala.inline
  def hls: typings.dplayer.dplayerStrings.hls = this.cast("hls")
  @scala.inline
  def normal: typings.dplayer.dplayerStrings.normal = this.cast("normal")
  @scala.inline
  def webtorrent: typings.dplayer.dplayerStrings.webtorrent = this.cast("webtorrent")
}

