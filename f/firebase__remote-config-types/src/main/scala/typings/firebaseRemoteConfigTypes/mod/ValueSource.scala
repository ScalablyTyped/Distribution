package typings.firebaseRemoteConfigTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.static
  - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.default
  - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.remote
*/
trait ValueSource extends js.Object

object ValueSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.default = this.cast("default")
  @scala.inline
  def remote: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.remote = this.cast("remote")
  @scala.inline
  def static: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.static = this.cast("static")
}

