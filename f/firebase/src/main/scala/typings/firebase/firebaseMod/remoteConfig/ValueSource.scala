package typings.firebase.firebaseMod.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebase.firebaseStrings.static
  - typings.firebase.firebaseStrings.default
  - typings.firebase.firebaseStrings.remote
*/
trait ValueSource extends js.Object

object ValueSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.firebase.firebaseStrings.default = this.cast("default")
  @scala.inline
  def remote: typings.firebase.firebaseStrings.remote = this.cast("remote")
  @scala.inline
  def static: typings.firebase.firebaseStrings.static = this.cast("static")
}

