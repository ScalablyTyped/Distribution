package typings.firebase.mod.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebase.firebaseStrings.`no-fetch-yet`
  - typings.firebase.firebaseStrings.success
  - typings.firebase.firebaseStrings.failure
  - typings.firebase.firebaseStrings.throttle
*/
trait FetchStatus extends js.Object

object FetchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typings.firebase.firebaseStrings.failure = this.cast("failure")
  @scala.inline
  def `no-fetch-yet`: typings.firebase.firebaseStrings.`no-fetch-yet` = this.cast("no-fetch-yet")
  @scala.inline
  def success: typings.firebase.firebaseStrings.success = this.cast("success")
  @scala.inline
  def throttle: typings.firebase.firebaseStrings.throttle = this.cast("throttle")
}

