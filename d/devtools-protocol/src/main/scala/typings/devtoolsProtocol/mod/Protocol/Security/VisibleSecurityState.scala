package typings.devtoolsProtocol.mod.Protocol.Security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibleSecurityState extends js.Object {
  /**
    * Security state details about the page certificate.
    */
  var certificateSecurityState: js.UndefOr[CertificateSecurityState] = js.native
  /**
    * The type of Safety Tip triggered on the page. Note that this field will be set even if the Safety Tip UI was not actually shown.
    */
  var safetyTipInfo: js.UndefOr[SafetyTipInfo] = js.native
  /**
    * The security level of the page.
    */
  var securityState: SecurityState = js.native
  /**
    * Array of security state issues ids.
    */
  var securityStateIssueIds: js.Array[String] = js.native
}

object VisibleSecurityState {
  @scala.inline
  def apply(securityState: SecurityState, securityStateIssueIds: js.Array[String]): VisibleSecurityState = {
    val __obj = js.Dynamic.literal(securityState = securityState.asInstanceOf[js.Any], securityStateIssueIds = securityStateIssueIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleSecurityState]
  }
  @scala.inline
  implicit class VisibleSecurityStateOps[Self <: VisibleSecurityState] (val x: Self) extends AnyVal {
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
    def setSecurityState(value: SecurityState): Self = this.set("securityState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityStateIssueIdsVarargs(value: String*): Self = this.set("securityStateIssueIds", js.Array(value :_*))
    @scala.inline
    def setSecurityStateIssueIds(value: js.Array[String]): Self = this.set("securityStateIssueIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateSecurityState(value: CertificateSecurityState): Self = this.set("certificateSecurityState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateSecurityState: Self = this.set("certificateSecurityState", js.undefined)
    @scala.inline
    def setSafetyTipInfo(value: SafetyTipInfo): Self = this.set("safetyTipInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafetyTipInfo: Self = this.set("safetyTipInfo", js.undefined)
  }
  
}

