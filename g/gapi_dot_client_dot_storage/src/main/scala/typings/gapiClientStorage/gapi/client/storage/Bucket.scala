package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClientStorage.anon.DefaultKmsKeyName
import typings.gapiClientStorage.anon.Enabled
import typings.gapiClientStorage.anon.Entity
import typings.gapiClientStorage.anon.LogBucket
import typings.gapiClientStorage.anon.MainPageSuffix
import typings.gapiClientStorage.anon.MaxAgeSeconds
import typings.gapiClientStorage.anon.RequesterPays
import typings.gapiClientStorage.anon.Rule
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bucket extends js.Object {
  /** Access controls on the bucket. */
  var acl: js.UndefOr[js.Array[BucketAccessControl]] = js.native
  /** The bucket's billing configuration. */
  var billing: js.UndefOr[RequesterPays] = js.native
  /** The bucket's Cross-Origin Resource Sharing (CORS) configuration. */
  var cors: js.UndefOr[js.Array[MaxAgeSeconds]] = js.native
  /** Default access controls to apply to new objects when no ACL is provided. */
  var defaultObjectAcl: js.UndefOr[js.Array[ObjectAccessControl]] = js.native
  /** Encryption configuration used by default for newly inserted objects, when no encryption config is specified. */
  var encryption: js.UndefOr[DefaultKmsKeyName] = js.native
  /** HTTP 1.1 Entity tag for the bucket. */
  var etag: js.UndefOr[String] = js.native
  /** The ID of the bucket. For buckets, the id and name properities are the same. */
  var id: js.UndefOr[String] = js.native
  /** The kind of item this is. For buckets, this is always storage#bucket. */
  var kind: js.UndefOr[String] = js.native
  /** User-provided labels, in key/value pairs. */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** The bucket's lifecycle configuration. See lifecycle management for more information. */
  var lifecycle: js.UndefOr[Rule] = js.native
  /**
    * The location of the bucket. Object data for objects in the bucket resides in physical storage within this region. Defaults to US. See the developer's
    * guide for the authoritative list.
    */
  var location: js.UndefOr[String] = js.native
  /** The bucket's logging configuration, which defines the destination bucket and optional name prefix for the current bucket's logs. */
  var logging: js.UndefOr[LogBucket] = js.native
  /** The metadata generation of this bucket. */
  var metageneration: js.UndefOr[String] = js.native
  /** The name of the bucket. */
  var name: js.UndefOr[String] = js.native
  /** The owner of the bucket. This is always the project team's owner group. */
  var owner: js.UndefOr[Entity] = js.native
  /** The project number of the project the bucket belongs to. */
  var projectNumber: js.UndefOr[String] = js.native
  /** The URI of this bucket. */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The bucket's default storage class, used whenever no storageClass is specified for a newly-created object. This defines how objects in the bucket are
    * stored and determines the SLA and the cost of storage. Values include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, and
    * DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the bucket is created, it will default to STANDARD. For more information, see storage
    * classes.
    */
  var storageClass: js.UndefOr[String] = js.native
  /** The creation time of the bucket in RFC 3339 format. */
  var timeCreated: js.UndefOr[String] = js.native
  /** The modification time of the bucket in RFC 3339 format. */
  var updated: js.UndefOr[String] = js.native
  /** The bucket's versioning configuration. */
  var versioning: js.UndefOr[Enabled] = js.native
  /**
    * The bucket's website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples
    * for more information.
    */
  var website: js.UndefOr[MainPageSuffix] = js.native
}

object Bucket {
  @scala.inline
  def apply(): Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bucket]
  }
  @scala.inline
  implicit class BucketOps[Self <: Bucket] (val x: Self) extends AnyVal {
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
    def setAclVarargs(value: BucketAccessControl*): Self = this.set("acl", js.Array(value :_*))
    @scala.inline
    def setAcl(value: js.Array[BucketAccessControl]): Self = this.set("acl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    @scala.inline
    def setBilling(value: RequesterPays): Self = this.set("billing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling: Self = this.set("billing", js.undefined)
    @scala.inline
    def setCorsVarargs(value: MaxAgeSeconds*): Self = this.set("cors", js.Array(value :_*))
    @scala.inline
    def setCors(value: js.Array[MaxAgeSeconds]): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setDefaultObjectAclVarargs(value: ObjectAccessControl*): Self = this.set("defaultObjectAcl", js.Array(value :_*))
    @scala.inline
    def setDefaultObjectAcl(value: js.Array[ObjectAccessControl]): Self = this.set("defaultObjectAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultObjectAcl: Self = this.set("defaultObjectAcl", js.undefined)
    @scala.inline
    def setEncryption(value: DefaultKmsKeyName): Self = this.set("encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLifecycle(value: Rule): Self = this.set("lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycle: Self = this.set("lifecycle", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLogging(value: LogBucket): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    @scala.inline
    def setMetageneration(value: String): Self = this.set("metageneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetageneration: Self = this.set("metageneration", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: Entity): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setProjectNumber(value: String): Self = this.set("projectNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectNumber: Self = this.set("projectNumber", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStorageClass(value: String): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("storageClass", js.undefined)
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setVersioning(value: Enabled): Self = this.set("versioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersioning: Self = this.set("versioning", js.undefined)
    @scala.inline
    def setWebsite(value: MainPageSuffix): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
  
}

