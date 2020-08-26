package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A certificate managed by App Engine.
  */
@js.native
trait SchemaManagedCertificate extends js.Object {
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

object SchemaManagedCertificate {
  @scala.inline
  def apply(): SchemaManagedCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedCertificate]
  }
  @scala.inline
  implicit class SchemaManagedCertificateOps[Self <: SchemaManagedCertificate] (val x: Self) extends AnyVal {
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
    def setLastRenewalTime(value: String): Self = this.set("lastRenewalTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastRenewalTime: Self = this.set("lastRenewalTime", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

