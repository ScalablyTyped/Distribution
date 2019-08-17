package typings.atEmberTestDashHelpers.settledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettledState extends js.Object {
  var hasPendingRequests: Boolean
  var hasPendingTimers: Boolean
  var hasPendingWaiters: Boolean
  var hasRunLoop: Boolean
  var pendingRequestCount: Double
}

object SettledState {
  @scala.inline
  def apply(
    hasPendingRequests: Boolean,
    hasPendingTimers: Boolean,
    hasPendingWaiters: Boolean,
    hasRunLoop: Boolean,
    pendingRequestCount: Double
  ): SettledState = {
    val __obj = js.Dynamic.literal(hasPendingRequests = hasPendingRequests, hasPendingTimers = hasPendingTimers, hasPendingWaiters = hasPendingWaiters, hasRunLoop = hasRunLoop, pendingRequestCount = pendingRequestCount)
  
    __obj.asInstanceOf[SettledState]
  }
}

