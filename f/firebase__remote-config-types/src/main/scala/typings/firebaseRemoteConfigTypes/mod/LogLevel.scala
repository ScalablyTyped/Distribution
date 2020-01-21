package typings.firebaseRemoteConfigTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.debug
  - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.error
  - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.error = this.cast("error")
  @scala.inline
  def silent: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.silent = this.cast("silent")
}

