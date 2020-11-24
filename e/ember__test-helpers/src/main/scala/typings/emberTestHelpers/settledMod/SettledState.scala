package typings.emberTestHelpers.settledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettledState extends js.Object {
  
  var hasPendingRequests: Boolean = js.native
  
  var hasPendingTimers: Boolean = js.native
  
  var hasPendingTransitions: Boolean | Null = js.native
  
  var hasPendingWaiters: Boolean = js.native
  
  var hasRunLoop: Boolean = js.native
  
  var pendingRequestCount: Double = js.native
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
    val __obj = js.Dynamic.literal(hasPendingRequests = hasPendingRequests.asInstanceOf[js.Any], hasPendingTimers = hasPendingTimers.asInstanceOf[js.Any], hasPendingWaiters = hasPendingWaiters.asInstanceOf[js.Any], hasRunLoop = hasRunLoop.asInstanceOf[js.Any], pendingRequestCount = pendingRequestCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettledState]
  }
  
  @scala.inline
  implicit class SettledStateOps[Self <: SettledState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasPendingRequests(value: Boolean): Self = this.set("hasPendingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPendingTimers(value: Boolean): Self = this.set("hasPendingTimers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPendingWaiters(value: Boolean): Self = this.set("hasPendingWaiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRunLoop(value: Boolean): Self = this.set("hasRunLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingRequestCount(value: Double): Self = this.set("pendingRequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPendingTransitions(value: Boolean): Self = this.set("hasPendingTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPendingTransitionsNull: Self = this.set("hasPendingTransitions", null)
  }
}
