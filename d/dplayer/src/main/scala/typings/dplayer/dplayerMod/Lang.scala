package typings.dplayer.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dplayer.dplayerStrings.en
  - typings.dplayer.dplayerStrings.`zh-cn`
  - typings.dplayer.dplayerStrings.`zh-tw`
*/
trait Lang extends js.Object

object Lang {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def en: typings.dplayer.dplayerStrings.en = this.cast("en")
  @scala.inline
  def `zh-cn`: typings.dplayer.dplayerStrings.`zh-cn` = this.cast("zh-cn")
  @scala.inline
  def `zh-tw`: typings.dplayer.dplayerStrings.`zh-tw` = this.cast("zh-tw")
}

