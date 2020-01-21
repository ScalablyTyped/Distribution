package typings.firebase.mod.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebase.firebaseStrings.debug
  - typings.firebase.firebaseStrings.error
  - typings.firebase.firebaseStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.firebase.firebaseStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.firebase.firebaseStrings.error = this.cast("error")
  @scala.inline
  def silent: typings.firebase.firebaseStrings.silent = this.cast("silent")
}

