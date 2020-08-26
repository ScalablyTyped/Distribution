package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditConfig extends js.Object {
  /**
    * Specifies the identities that are exempted from "data access" audit logging for the `service` specified above. Follows the same format of
    * Binding.members.
    */
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies a service that will be enabled for "data access" audit logging. For example, `resourcemanager`, `storage`, `compute`. `allServices` is a
    * special value that covers all services.
    */
  var service: js.UndefOr[String] = js.native
}

object AuditConfig {
  @scala.inline
  def apply(): AuditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditConfig]
  }
  @scala.inline
  implicit class AuditConfigOps[Self <: AuditConfig] (val x: Self) extends AnyVal {
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
    def setExemptedMembersVarargs(value: String*): Self = this.set("exemptedMembers", js.Array(value :_*))
    @scala.inline
    def setExemptedMembers(value: js.Array[String]): Self = this.set("exemptedMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExemptedMembers: Self = this.set("exemptedMembers", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

