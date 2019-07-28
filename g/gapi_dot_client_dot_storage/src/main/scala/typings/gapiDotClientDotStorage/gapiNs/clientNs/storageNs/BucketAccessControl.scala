package typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs

import typings.gapiDotClientDotStorage.Anon_ProjectNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAccessControl extends js.Object {
  /** The name of the bucket. */
  var bucket: js.UndefOr[String] = js.undefined
  /** The domain associated with the entity, if any. */
  var domain: js.UndefOr[String] = js.undefined
  /** The email address associated with the entity, if any. */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The entity holding the permission, in one of the following forms:
    * - user-userId
    * - user-email
    * - group-groupId
    * - group-email
    * - domain-domain
    * - project-team-projectId
    * - allUsers
    * - allAuthenticatedUsers Examples:
    * - The user liz@example.com would be user-liz@example.com.
    * - The group example@googlegroups.com would be group-example@googlegroups.com.
    * - To refer to all members of the Google Apps for Business domain example.com, the entity would be domain-example.com.
    */
  var entity: js.UndefOr[String] = js.undefined
  /** The ID for the entity, if any. */
  var entityId: js.UndefOr[String] = js.undefined
  /** HTTP 1.1 Entity tag for the access-control entry. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID of the access-control entry. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind of item this is. For bucket access control entries, this is always storage#bucketAccessControl. */
  var kind: js.UndefOr[String] = js.undefined
  /** The project team associated with the entity, if any. */
  var projectTeam: js.UndefOr[Anon_ProjectNumber] = js.undefined
  /** The access permission for the entity. */
  var role: js.UndefOr[String] = js.undefined
  /** The link to this access-control entry. */
  var selfLink: js.UndefOr[String] = js.undefined
}

object BucketAccessControl {
  @scala.inline
  def apply(
    bucket: String = null,
    domain: String = null,
    email: String = null,
    entity: String = null,
    entityId: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    projectTeam: Anon_ProjectNumber = null,
    role: String = null,
    selfLink: String = null
  ): BucketAccessControl = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (email != null) __obj.updateDynamic("email")(email)
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (entityId != null) __obj.updateDynamic("entityId")(entityId)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (projectTeam != null) __obj.updateDynamic("projectTeam")(projectTeam)
    if (role != null) __obj.updateDynamic("role")(role)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[BucketAccessControl]
  }
}

