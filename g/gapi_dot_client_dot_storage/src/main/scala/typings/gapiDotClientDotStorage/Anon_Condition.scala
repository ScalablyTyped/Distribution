package typings.gapiDotClientDotStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Condition extends js.Object {
  var condition: js.UndefOr[js.Any] = js.undefined
  /**
    * A collection of identifiers for members who may assume the provided role. Recognized identifiers are as follows:
    * - allUsers — A special identifier that represents anyone on the internet; with or without a Google account.
    * - allAuthenticatedUsers — A special identifier that represents anyone who is authenticated with a Google account or a service account.
    * - user:emailid — An email address that represents a specific account. For example, user:alice@gmail.com or user:joe@example.com.
    * - serviceAccount:emailid — An email address that represents a service account. For example,  serviceAccount:my-other-app@appspot.gserviceaccount.com .
    *
    * - group:emailid — An email address that represents a Google group. For example, group:admins@example.com.
    * - domain:domain — A Google Apps domain name that represents all the users of that domain. For example, domain:google.com or domain:example.com.
    * - projectOwner:projectid — Owners of the given project. For example, projectOwner:my-example-project
    * - projectEditor:projectid — Editors of the given project. For example, projectEditor:my-example-project
    * - projectViewer:projectid — Viewers of the given project. For example, projectViewer:my-example-project
    */
  var members: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The role to which members belong. Two types of roles are supported: new IAM roles, which grant permissions that do not map directly to those provided
    * by ACLs, and legacy IAM roles, which do map directly to ACL permissions. All roles are of the format roles/storage.specificRole.
    * The new IAM roles are:
    * - roles/storage.admin — Full control of Google Cloud Storage resources.
    * - roles/storage.objectViewer — Read-Only access to Google Cloud Storage objects.
    * - roles/storage.objectCreator — Access to create objects in Google Cloud Storage.
    * - roles/storage.objectAdmin — Full control of Google Cloud Storage objects.   The legacy IAM roles are:
    * - roles/storage.legacyObjectReader — Read-only access to objects without listing. Equivalent to an ACL entry on an object with the READER role.
    * - roles/storage.legacyObjectOwner — Read/write access to existing objects without listing. Equivalent to an ACL entry on an object with the OWNER role.
    *
    * - roles/storage.legacyBucketReader — Read access to buckets with object listing. Equivalent to an ACL entry on a bucket with the READER role.
    * - roles/storage.legacyBucketWriter — Read access to buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the
    * WRITER role.
    * - roles/storage.legacyBucketOwner — Read and write access to existing buckets with object listing/creation/deletion. Equivalent to an ACL entry on a
    * bucket with the OWNER role.
    */
  var role: js.UndefOr[String] = js.undefined
}

object Anon_Condition {
  @scala.inline
  def apply(condition: js.Any = null, members: js.Array[String] = null, role: String = null): Anon_Condition = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Condition]
  }
}

