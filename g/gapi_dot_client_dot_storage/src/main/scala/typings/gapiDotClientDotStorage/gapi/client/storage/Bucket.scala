package typings.gapiDotClientDotStorage.gapi.client.storage

import typings.gapiDotClientDotStorage.Anon_DefaultKmsKeyName
import typings.gapiDotClientDotStorage.Anon_Enabled
import typings.gapiDotClientDotStorage.Anon_Entity
import typings.gapiDotClientDotStorage.Anon_LogBucket
import typings.gapiDotClientDotStorage.Anon_MainPageSuffix
import typings.gapiDotClientDotStorage.Anon_MaxAgeSeconds
import typings.gapiDotClientDotStorage.Anon_RequesterPays
import typings.gapiDotClientDotStorage.Anon_Rule
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  /** Access controls on the bucket. */
  var acl: js.UndefOr[js.Array[BucketAccessControl]] = js.undefined
  /** The bucket's billing configuration. */
  var billing: js.UndefOr[Anon_RequesterPays] = js.undefined
  /** The bucket's Cross-Origin Resource Sharing (CORS) configuration. */
  var cors: js.UndefOr[js.Array[Anon_MaxAgeSeconds]] = js.undefined
  /** Default access controls to apply to new objects when no ACL is provided. */
  var defaultObjectAcl: js.UndefOr[js.Array[ObjectAccessControl]] = js.undefined
  /** Encryption configuration used by default for newly inserted objects, when no encryption config is specified. */
  var encryption: js.UndefOr[Anon_DefaultKmsKeyName] = js.undefined
  /** HTTP 1.1 Entity tag for the bucket. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID of the bucket. For buckets, the id and name properities are the same. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind of item this is. For buckets, this is always storage#bucket. */
  var kind: js.UndefOr[String] = js.undefined
  /** User-provided labels, in key/value pairs. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** The bucket's lifecycle configuration. See lifecycle management for more information. */
  var lifecycle: js.UndefOr[Anon_Rule] = js.undefined
  /**
    * The location of the bucket. Object data for objects in the bucket resides in physical storage within this region. Defaults to US. See the developer's
    * guide for the authoritative list.
    */
  var location: js.UndefOr[String] = js.undefined
  /** The bucket's logging configuration, which defines the destination bucket and optional name prefix for the current bucket's logs. */
  var logging: js.UndefOr[Anon_LogBucket] = js.undefined
  /** The metadata generation of this bucket. */
  var metageneration: js.UndefOr[String] = js.undefined
  /** The name of the bucket. */
  var name: js.UndefOr[String] = js.undefined
  /** The owner of the bucket. This is always the project team's owner group. */
  var owner: js.UndefOr[Anon_Entity] = js.undefined
  /** The project number of the project the bucket belongs to. */
  var projectNumber: js.UndefOr[String] = js.undefined
  /** The URI of this bucket. */
  var selfLink: js.UndefOr[String] = js.undefined
  /**
    * The bucket's default storage class, used whenever no storageClass is specified for a newly-created object. This defines how objects in the bucket are
    * stored and determines the SLA and the cost of storage. Values include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, and
    * DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the bucket is created, it will default to STANDARD. For more information, see storage
    * classes.
    */
  var storageClass: js.UndefOr[String] = js.undefined
  /** The creation time of the bucket in RFC 3339 format. */
  var timeCreated: js.UndefOr[String] = js.undefined
  /** The modification time of the bucket in RFC 3339 format. */
  var updated: js.UndefOr[String] = js.undefined
  /** The bucket's versioning configuration. */
  var versioning: js.UndefOr[Anon_Enabled] = js.undefined
  /**
    * The bucket's website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples
    * for more information.
    */
  var website: js.UndefOr[Anon_MainPageSuffix] = js.undefined
}

object Bucket {
  @scala.inline
  def apply(
    acl: js.Array[BucketAccessControl] = null,
    billing: Anon_RequesterPays = null,
    cors: js.Array[Anon_MaxAgeSeconds] = null,
    defaultObjectAcl: js.Array[ObjectAccessControl] = null,
    encryption: Anon_DefaultKmsKeyName = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    labels: Record[String, String] = null,
    lifecycle: Anon_Rule = null,
    location: String = null,
    logging: Anon_LogBucket = null,
    metageneration: String = null,
    name: String = null,
    owner: Anon_Entity = null,
    projectNumber: String = null,
    selfLink: String = null,
    storageClass: String = null,
    timeCreated: String = null,
    updated: String = null,
    versioning: Anon_Enabled = null,
    website: Anon_MainPageSuffix = null
  ): Bucket = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (billing != null) __obj.updateDynamic("billing")(billing.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (defaultObjectAcl != null) __obj.updateDynamic("defaultObjectAcl")(defaultObjectAcl.asInstanceOf[js.Any])
    if (encryption != null) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (metageneration != null) __obj.updateDynamic("metageneration")(metageneration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (projectNumber != null) __obj.updateDynamic("projectNumber")(projectNumber.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (versioning != null) __obj.updateDynamic("versioning")(versioning.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
}

