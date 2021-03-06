package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policy extends js.Object {
  /**
    * Specifies audit logging configs for "data access". "data access": generally refers to data reads/writes and admin reads. "admin activity": generally
    * refers to admin writes.
    *
    * Note: `AuditConfig` doesn't apply to "admin activity", which always enables audit logging.
    */
  var auditConfigs: js.UndefOr[js.Array[AuditConfig]] = js.native
  /**
    * Associates a list of `members` to a `role`. Multiple `bindings` must not be specified for the same `role`. `bindings` with no members will result in an
    * error.
    */
  var bindings: js.UndefOr[js.Array[Binding]] = js.native
  /**
    * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly
    * suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is
    * returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will
    * be applied to the same version of the policy.
    *
    * If no `etag` is provided in the call to `setIamPolicy`, then the existing policy is overwritten blindly.
    */
  var etag: js.UndefOr[String] = js.native
  var iamOwned: js.UndefOr[Boolean] = js.native
  /**
    * If more than one rule is specified, the rules are applied in the following manner: - All matching LOG rules are always applied. - If any
    * DENY/DENY_WITH_LOG rule matches, permission is denied. Logging will be applied if one or more matching rule requires logging. - Otherwise, if any
    * ALLOW/ALLOW_WITH_LOG rule matches, permission is granted. Logging will be applied if one or more matching rule requires logging. - Otherwise, if no
    * rule applies, permission is denied.
    */
  var rules: js.UndefOr[js.Array[Rule]] = js.native
  /** Version of the `Policy`. The default version is 0. */
  var version: js.UndefOr[Double] = js.native
}

object Policy {
  @scala.inline
  def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
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
    def setAuditConfigsVarargs(value: AuditConfig*): Self = this.set("auditConfigs", js.Array(value :_*))
    @scala.inline
    def setAuditConfigs(value: js.Array[AuditConfig]): Self = this.set("auditConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditConfigs: Self = this.set("auditConfigs", js.undefined)
    @scala.inline
    def setBindingsVarargs(value: Binding*): Self = this.set("bindings", js.Array(value :_*))
    @scala.inline
    def setBindings(value: js.Array[Binding]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setIamOwned(value: Boolean): Self = this.set("iamOwned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamOwned: Self = this.set("iamOwned", js.undefined)
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[Rule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

