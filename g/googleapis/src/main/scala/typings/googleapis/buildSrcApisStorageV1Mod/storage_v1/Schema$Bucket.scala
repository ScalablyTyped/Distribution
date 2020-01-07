package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.Anon_BucketPolicyOnly
import typings.googleapis.Anon_DefaultKmsKeyName
import typings.googleapis.Anon_EffectiveTime
import typings.googleapis.Anon_EnabledBoolean
import typings.googleapis.Anon_Entity
import typings.googleapis.Anon_LogBucket
import typings.googleapis.Anon_MainPageSuffix
import typings.googleapis.Anon_MaxAgeSeconds
import typings.googleapis.Anon_RequesterPays
import typings.googleapis.Anon_Rule
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
    * The bucket&#39;s billing configuration.
    */
  var billing: js.UndefOr[Anon_RequesterPays] = js.native
  /**
    * The bucket&#39;s Cross-Origin Resource Sharing (CORS) configuration.
    */
  var cors: js.UndefOr[js.Array[Anon_MaxAgeSeconds]] = js.native
  /**
    * The default value for event-based hold on newly created objects in this
    * bucket. Event-based hold is a way to retain objects indefinitely until an
    * event occurs, signified by the hold&#39;s release. After being released,
    * such objects will be subject to bucket-level retention (if any). One
    * sample use case of this flag is for banks to hold loan documents for at
    * least 3 years after loan is paid in full. Here, bucket-level retention is
    * 3 years and the event is loan being paid in full. In this example, these
    * objects will be held intact for any number of years until the event has
    * occurred (event-based hold on the object is released) and then 3 more
    * years after that. That means retention duration of the objects begins
    * from the moment event-based hold transitioned from true to false. Objects
    * under event-based hold cannot be deleted, overwritten or archived until
    * the hold is removed.
    */
  var defaultEventBasedHold: js.UndefOr[Boolean] = js.native
  /**
    * Default access controls to apply to new objects when no ACL is provided.
    */
  var defaultObjectAcl: js.UndefOr[js.Array[Schema$ObjectAccessControl]] = js.native
  /**
    * Encryption configuration for a bucket.
    */
  var encryption: js.UndefOr[Anon_DefaultKmsKeyName] = js.native
  /**
    * HTTP 1.1 Entity tag for the bucket.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s IAM configuration.
    */
  var iamConfiguration: js.UndefOr[Anon_BucketPolicyOnly] = js.native
  /**
    * The ID of the bucket. For buckets, the id and name properties are the
    * same.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For buckets, this is always storage#bucket.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * User-provided labels, in key/value pairs.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The bucket&#39;s lifecycle configuration. See lifecycle management for
    * more information.
    */
  var lifecycle: js.UndefOr[Anon_Rule] = js.native
  /**
    * The location of the bucket. Object data for objects in the bucket resides
    * in physical storage within this region. Defaults to US. See the
    * developer&#39;s guide for the authoritative list.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s logging configuration, which defines the destination
    * bucket and optional name prefix for the current bucket&#39;s logs.
    */
  var logging: js.UndefOr[Anon_LogBucket] = js.native
  /**
    * The metadata generation of this bucket.
    */
  var metageneration: js.UndefOr[String] = js.native
  /**
    * The name of the bucket.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The owner of the bucket. This is always the project team&#39;s owner
    * group.
    */
  var owner: js.UndefOr[Anon_Entity] = js.native
  /**
    * The project number of the project the bucket belongs to.
    */
  var projectNumber: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s retention policy. The retention policy enforces a
    * minimum retention time for all objects contained in the bucket, based on
    * their creation time. Any attempt to overwrite or delete objects younger
    * than the retention period will result in a PERMISSION_DENIED error. An
    * unlocked retention policy can be modified or removed from the bucket via
    * a storage.buckets.update operation. A locked retention policy cannot be
    * removed or shortened in duration for the lifetime of the bucket.
    * Attempting to remove or decrease period of a locked retention policy will
    * result in a PERMISSION_DENIED error.
    */
  var retentionPolicy: js.UndefOr[Anon_EffectiveTime] = js.native
  /**
    * The URI of this bucket.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s default storage class, used whenever no storageClass is
    * specified for a newly-created object. This defines how objects in the
    * bucket are stored and determines the SLA and the cost of storage. Values
    * include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, and
    * DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the
    * bucket is created, it will default to STANDARD. For more information, see
    * storage classes.
    */
  var storageClass: js.UndefOr[String] = js.native
  /**
    * The creation time of the bucket in RFC 3339 format.
    */
  var timeCreated: js.UndefOr[String] = js.native
  /**
    * The modification time of the bucket in RFC 3339 format.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s versioning configuration.
    */
  var versioning: js.UndefOr[Anon_EnabledBoolean] = js.native
  /**
    * The bucket&#39;s website configuration, controlling how the service
    * behaves when accessing bucket contents as a web site. See the Static
    * Website Examples for more information.
    */
  var website: js.UndefOr[Anon_MainPageSuffix] = js.native
}

object Schema$Bucket {
  @scala.inline
  def apply(
    acl: js.Array[Schema$BucketAccessControl] = null,
    billing: Anon_RequesterPays = null,
    cors: js.Array[Anon_MaxAgeSeconds] = null,
    defaultEventBasedHold: js.UndefOr[Boolean] = js.undefined,
    defaultObjectAcl: js.Array[Schema$ObjectAccessControl] = null,
    encryption: Anon_DefaultKmsKeyName = null,
    etag: String = null,
    iamConfiguration: Anon_BucketPolicyOnly = null,
    id: String = null,
    kind: String = null,
    labels: StringDictionary[String] = null,
    lifecycle: Anon_Rule = null,
    location: String = null,
    logging: Anon_LogBucket = null,
    metageneration: String = null,
    name: String = null,
    owner: Anon_Entity = null,
    projectNumber: String = null,
    retentionPolicy: Anon_EffectiveTime = null,
    selfLink: String = null,
    storageClass: String = null,
    timeCreated: String = null,
    updated: String = null,
    versioning: Anon_EnabledBoolean = null,
    website: Anon_MainPageSuffix = null
  ): Schema$Bucket = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (billing != null) __obj.updateDynamic("billing")(billing.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultEventBasedHold)) __obj.updateDynamic("defaultEventBasedHold")(defaultEventBasedHold.asInstanceOf[js.Any])
    if (defaultObjectAcl != null) __obj.updateDynamic("defaultObjectAcl")(defaultObjectAcl.asInstanceOf[js.Any])
    if (encryption != null) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (iamConfiguration != null) __obj.updateDynamic("iamConfiguration")(iamConfiguration.asInstanceOf[js.Any])
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
    if (retentionPolicy != null) __obj.updateDynamic("retentionPolicy")(retentionPolicy.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (versioning != null) __obj.updateDynamic("versioning")(versioning.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Bucket]
  }
}

