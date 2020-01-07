package typings.googleapis.buildSrcApisStorageV1beta1Mod.storage_v1beta1

import typings.googleapis.Anon_Entity
import typings.googleapis.Anon_MainPageSuffix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bucket.
  */
@js.native
trait Schema$Bucket extends js.Object {
  /**
    * Access controls on the bucket.
    */
  var acl: js.UndefOr[js.Array[Schema$BucketAccessControl]] = js.native
  /**
    * Default access controls to apply to new objects when no ACL is provided.
    */
  var defaultObjectAcl: js.UndefOr[js.Array[Schema$ObjectAccessControl]] = js.native
  /**
    * The name of the bucket.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For buckets, this is always storage#bucket.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The location of the bucket. Object data for objects in the bucket resides
    * in physical storage in this location. Can be US or EU. Defaults to US.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The owner of the bucket. This will always be the project team&#39;s owner
    * group.
    */
  var owner: js.UndefOr[Anon_Entity] = js.native
  /**
    * The project the bucket belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The URI of this bucket.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Creation time of the bucket in RFC 3339 format.
    */
  var timeCreated: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s website configuration.
    */
  var website: js.UndefOr[Anon_MainPageSuffix] = js.native
}

object Schema$Bucket {
  @scala.inline
  def apply(
    acl: js.Array[Schema$BucketAccessControl] = null,
    defaultObjectAcl: js.Array[Schema$ObjectAccessControl] = null,
    id: String = null,
    kind: String = null,
    location: String = null,
    owner: Anon_Entity = null,
    projectId: String = null,
    selfLink: String = null,
    timeCreated: String = null,
    website: Anon_MainPageSuffix = null
  ): Schema$Bucket = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (defaultObjectAcl != null) __obj.updateDynamic("defaultObjectAcl")(defaultObjectAcl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Bucket]
  }
}

