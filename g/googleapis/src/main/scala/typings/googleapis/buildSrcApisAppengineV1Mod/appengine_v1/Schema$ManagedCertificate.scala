package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A certificate managed by App Engine.
  */
@js.native
trait Schema$ManagedCertificate extends js.Object {
  /**
    * Time at which the certificate was last renewed. The renewal process is
    * fully managed. Certificate renewal will automatically occur before the
    * certificate expires. Renewal errors can be tracked via
    * ManagementStatus.@OutputOnly
    */
  var lastRenewalTime: js.UndefOr[String] = js.native
  /**
    * Status of certificate management. Refers to the most recent certificate
    * acquisition or renewal attempt.@OutputOnly
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$ManagedCertificate {
  @scala.inline
  def apply(lastRenewalTime: String = null, status: String = null): Schema$ManagedCertificate = {
    val __obj = js.Dynamic.literal()
    if (lastRenewalTime != null) __obj.updateDynamic("lastRenewalTime")(lastRenewalTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedCertificate]
  }
}

