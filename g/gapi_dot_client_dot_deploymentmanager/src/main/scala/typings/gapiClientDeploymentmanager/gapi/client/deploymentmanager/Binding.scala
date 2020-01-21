package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binding extends js.Object {
  /**
    * The condition that is associated with this binding. NOTE: an unsatisfied condition will not allow user access via current binding. Different bindings,
    * including their conditions, are examined independently. This field is GOOGLE_INTERNAL.
    */
  var condition: js.UndefOr[Expr] = js.undefined
  /**
    * Specifies the identities requesting access for a Cloud Platform resource. `members` can have the following values:
    *
    * &#42; `allUsers`: A special identifier that represents anyone who is on the internet; with or without a Google account.
    *
    * &#42; `allAuthenticatedUsers`: A special identifier that represents anyone who is authenticated with a Google account or a service account.
    *
    * &#42; `user:{emailid}`: An email address that represents a specific Google account. For example, `alice@gmail.com` or `joe@example.com`.
    *
    *
    *
    * &#42; `serviceAccount:{emailid}`: An email address that represents a service account. For example, `my-other-app@appspot.gserviceaccount.com`.
    *
    * &#42; `group:{emailid}`: An email address that represents a Google group. For example, `admins@example.com`.
    *
    *
    *
    * &#42; `domain:{domain}`: A Google Apps domain name that represents all the users of that domain. For example, `google.com` or `example.com`.
    */
  var members: js.UndefOr[js.Array[String]] = js.undefined
  /** Role that is assigned to `members`. For example, `roles/viewer`, `roles/editor`, or `roles/owner`. */
  var role: js.UndefOr[String] = js.undefined
}

object Binding {
  @scala.inline
  def apply(condition: Expr = null, members: js.Array[String] = null, role: String = null): Binding = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
}

