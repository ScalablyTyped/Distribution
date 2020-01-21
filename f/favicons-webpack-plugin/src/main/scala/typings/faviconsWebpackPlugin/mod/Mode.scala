package typings.faviconsWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.webapp
  - typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.light
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def light: typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.light = this.cast("light")
  @scala.inline
  def webapp: typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.webapp = this.cast("webapp")
}

