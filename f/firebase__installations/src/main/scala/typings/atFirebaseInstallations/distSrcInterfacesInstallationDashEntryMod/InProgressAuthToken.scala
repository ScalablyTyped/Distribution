package typings.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod

import typings.atFirebaseInstallations.atFirebaseInstallationsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InProgressAuthToken extends AuthToken {
  val requestStatus: `1`
  /**
    * Unix timestamp when the current generateAuthRequest was initiated.
    * Used for figuring out how long the request status has been IN_PROGRESS.
    */
  val requestTime: Double
}

object InProgressAuthToken {
  @scala.inline
  def apply(requestStatus: `1`, requestTime: Double): InProgressAuthToken = {
    val __obj = js.Dynamic.literal(requestStatus = requestStatus.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InProgressAuthToken]
  }
}

