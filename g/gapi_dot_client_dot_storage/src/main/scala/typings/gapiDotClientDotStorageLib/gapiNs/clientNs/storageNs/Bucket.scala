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

