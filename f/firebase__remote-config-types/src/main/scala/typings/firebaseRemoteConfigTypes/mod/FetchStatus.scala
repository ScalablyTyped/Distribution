package typings.firebaseRemoteConfigTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.`no-fetch-yet`
  - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.success
  - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.failure
  - typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.throttle
*/
trait FetchStatus extends js.Object

object FetchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.failure = this.cast("failure")
  @scala.inline
  def `no-fetch-yet`: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.`no-fetch-yet` = this.cast("no-fetch-yet")
  @scala.inline
  def success: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.success = this.cast("success")
  @scala.inline
  def throttle: typings.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.throttle = this.cast("throttle")
}

