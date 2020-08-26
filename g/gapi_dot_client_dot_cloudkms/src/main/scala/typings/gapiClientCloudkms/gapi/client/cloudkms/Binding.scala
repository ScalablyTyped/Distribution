package typings.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binding extends js.Object {
  /**
    * The condition that is associated with this binding.
    * NOTE: an unsatisfied condition will not allow user access via current
    * binding. Different bindings, including their conditions, are examined
    * independently.
    * This field is GOOGLE_INTERNAL.
    */
  var condition: js.UndefOr[Expr] = js.native
  /**
    * Specifies the identities requesting access for a Cloud Platform resource.
    * `members` can have the following values:
    *
    * &#42; `allUsers`: A special identifier that represents anyone who is
    * on the internet; with or without a Google account.
    *
    * &#42; `allAuthenticatedUsers`: A special identifier that represents anyone
    * who is authenticated with a Google account or a service account.
    *
    * &#42; `user:{emailid}`: An email address that represents a specific Google
    * account. For example, `alice@gmail.com` or `joe@example.com`.
    *
    *
    * &#42; `serviceAccount:{emailid}`: An email address that represents a service
    * account. For example, `my-other-app@appspot.gserviceaccount.com`.
    *
    * &#42; `group:{emailid}`: An email address that represents a Google group.
    * For example, `admins@example.com`.
    *
    *
    * &#42; `domain:{domain}`: A Google Apps domain name that represents all the
    * users of that domain. For example, `google.com` or `example.com`.
    */
  var members: js.UndefOr[js.Array[String]] = js.native
  /**
    * Role that is assigned to `members`.
    * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
    * Required
    */
  var role: js.UndefOr[String] = js.native
}

object Binding {
  @scala.inline
  def apply(): Binding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Binding]
  }
  @scala.inline
  implicit class BindingOps[Self <: Binding] (val x: Self) extends AnyVal {
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
    def setCondition(value: Expr): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[String]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

