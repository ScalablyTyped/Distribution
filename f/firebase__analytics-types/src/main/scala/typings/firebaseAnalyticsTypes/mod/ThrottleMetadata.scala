package typings.firebaseAnalyticsTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThrottleMetadata extends js.Object {
  
  // The number of times fetch has backed off. Used for resuming backoff after a timeout.
  var backoffCount: Double = js.native
  
  // The Unix timestamp in milliseconds when callers can retry a request.
  var throttleEndTimeMillis: Double = js.native
}
object ThrottleMetadata {
  
  @scala.inline
  def apply(backoffCount: Double, throttleEndTimeMillis: Double): ThrottleMetadata = {
    val __obj = js.Dynamic.literal(backoffCount = backoffCount.asInstanceOf[js.Any], throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleMetadata]
  }
  
  @scala.inline
  implicit class ThrottleMetadataOps[Self <: ThrottleMetadata] (val x: Self) extends AnyVal {
    
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
    def setBackoffCount(value: Double): Self = this.set("backoffCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleEndTimeMillis(value: Double): Self = this.set("throttleEndTimeMillis", value.asInstanceOf[js.Any])
  }
}
