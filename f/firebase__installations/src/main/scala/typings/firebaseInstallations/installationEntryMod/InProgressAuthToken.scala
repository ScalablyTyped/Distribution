package typings.firebaseInstallations.installationEntryMod

import typings.firebaseInstallations.firebaseInstallationsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InProgressAuthToken extends AuthToken {
  
  val requestStatus: `1` = js.native
  
  /**
    * Unix timestamp when the current generateAuthRequest was initiated.
    * Used for figuring out how long the request status has been IN_PROGRESS.
    */
  val requestTime: Double = js.native
}
object InProgressAuthToken {
  
  @scala.inline
  def apply(requestStatus: `1`, requestTime: Double): InProgressAuthToken = {
    val __obj = js.Dynamic.literal(requestStatus = requestStatus.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[InProgressAuthToken]
  }
  
  @scala.inline
  implicit class InProgressAuthTokenOps[Self <: InProgressAuthToken] (val x: Self) extends AnyVal {
    
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
    def setRequestStatus(value: `1`): Self = this.set("requestStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTime(value: Double): Self = this.set("requestTime", value.asInstanceOf[js.Any])
  }
}
