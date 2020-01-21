package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dplayer.dplayerStrings.web
  - typings.dplayer.dplayerStrings.browser
*/
trait FullScreenType extends js.Object

object FullScreenType {
  @scala.inline
  def browser: typings.dplayer.dplayerStrings.browser = this.cast("browser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def web: typings.dplayer.dplayerStrings.web = this.cast("web")
}

