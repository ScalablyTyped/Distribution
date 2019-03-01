package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  /** Access controls on the bucket. */
  var acl: js.UndefOr[js.Array[BucketAccessControl]] = js.undefined
  /** The bucket's billing configuration. */
  var billing: js.UndefOr[gapiDotClientDotStorageLib.Anon_RequesterPays] = js.undefined
  /** The bucket's Cross-Origin Resource Sharing (CORS) configuration. */
  var cors: js.UndefOr[js.Array[gapiDotClientDotStorageLib.Anon_MaxAgeSeconds]] = js.undefined
  /** Default access controls to apply to new objects when no ACL is provided. */
  var defaultObjectAcl: js.UndefOr[js.Array[ObjectAccessControl]] = js.undefined
  /** Encryption configuration used by default for newly inserted objects, when no encryption config is specified. */
  var encryption: js.UndefOr[gapiDotClientDotStorageLib.Anon_DefaultKmsKeyName] = js.undefined
  /** HTTP 1.1 Entity tag for the bucket. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the bucket. For buckets, the id and name properities are the same. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of item this is. For buckets, this is always storage#bucket. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** User-provided labels, in key/value pairs. */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The bucket's lifecycle configuration. See lifecycle management for more information. */
  var lifecycle: js.UndefOr[gapiDotClientDotStorageLib.Anon_Rule] = js.undefined
  /**
    * The location of the bucket. Object data for objects in the bucket resides in physical storage within this region. Defaults to US. See the developer's
    * guide for the authoritative list.
    */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** The bucket's logging configuration, which defines the destination bucket and optional name prefix for the current bucket's logs. */
  var logging: js.UndefOr[gapiDotClientDotStorageLib.Anon_LogBucket] = js.undefined
  /** The metadata generation of this bucket. */
  var metageneration: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the bucket. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The owner of the bucket. This is always the project team's owner group. */
  var owner: js.UndefOr[gapiDotClientDotStorageLib.Anon_Entity] = js.undefined
  /** The project number of the project the bucket belongs to. */
  var projectNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The URI of this bucket. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The bucket's default storage class, used whenever no storageClass is specified for a newly-created object. This defines how objects in the bucket are
    * stored and determines the SLA and the cost of storage. Values include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, and
    * DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the bucket is created, it will default to STANDARD. For more information, see storage
    * classes.
    */
  var storageClass: js.UndefOr[java.lang.String] = js.undefined
  /** The creation time of the bucket in RFC 3339 format. */
  var timeCreated: js.UndefOr[java.lang.String] = js.undefined
  /** The modification time of the bucket in RFC 3339 format. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** The bucket's versioning configuration. */
  var versioning: js.UndefOr[gapiDotClientDotStorageLib.Anon_Enabled] = js.undefined
  /**
    * The bucket's website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples
    * for more information.
    */
  var website: js.UndefOr[gapiDotClientDotStorageLib.Anon_MainPageSuffix] = js.undefined
}

object Bucket {
  @scala.inline
  def apply(
    acl: js.Array[BucketAccessControl] = null,
    billing: gapiDotClientDotStorageLib.Anon_RequesterPays = null,
    cors: js.Array[gapiDotClientDotStorageLib.Anon_MaxAgeSeconds] = null,
    defaultObjectAcl: js.Array[ObjectAccessControl] = null,
    encryption: gapiDotClientDotStorageLib.Anon_DefaultKmsKeyName = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    labels: stdLib.Record[java.lang.String, java.lang.String] = null,
    lifecycle: gapiDotClientDotStorageLib.Anon_Rule = null,
    location: java.lang.String = null,
    logging: gapiDotClientDotStorageLib.Anon_LogBucket = null,
    metageneration: java.lang.String = null,
    name: java.lang.String = null,
    owner: gapiDotClientDotStorageLib.Anon_Entity = null,
    projectNumber: java.lang.String = null,
    selfLink: java.lang.String = null,
    storageClass: java.lang.String = null,
    timeCreated: java.lang.String = null,
    updated: java.lang.String = null,
    versioning: gapiDotClientDotStorageLib.Anon_Enabled = null,
    website: gapiDotClientDotStorageLib.Anon_MainPageSuffix = null
  ): Bucket = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl)
    if (billing != null) __obj.updateDynamic("billing")(billing)
    if (cors != null) __obj.updateDynamic("cors")(cors)
    if (defaultObjectAcl != null) __obj.updateDynamic("defaultObjectAcl")(defaultObjectAcl)
    if (encryption != null) __obj.updateDynamic("encryption")(encryption)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle)
    if (location != null) __obj.updateDynamic("location")(location)
    if (logging != null) __obj.updateDynamic("logging")(logging)
    if (metageneration != null) __obj.updateDynamic("metageneration")(metageneration)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (projectNumber != null) __obj.updateDynamic("projectNumber")(projectNumber)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (versioning != null) __obj.updateDynamic("versioning")(versioning)
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[Bucket]
  }
}

