package typings.gapiDotClientDotStorage.gapi.client.storage

import typings.gapiDotClientDotStorage.Anon_EncryptionAlgorithm
import typings.gapiDotClientDotStorage.Anon_Entity
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  /** Access controls on the object. */
  var acl: js.UndefOr[js.Array[ObjectAccessControl]] = js.undefined
  /** The name of the bucket containing this object. */
  var bucket: js.UndefOr[String] = js.undefined
  /** Cache-Control directive for the object data. If omitted, and the object is accessible to all anonymous users, the default will be public, max-age=3600. */
  var cacheControl: js.UndefOr[String] = js.undefined
  /** Number of underlying components that make up this object. Components are accumulated by compose operations. */
  var componentCount: js.UndefOr[Double] = js.undefined
  /** Content-Disposition of the object data. */
  var contentDisposition: js.UndefOr[String] = js.undefined
  /** Content-Encoding of the object data. */
  var contentEncoding: js.UndefOr[String] = js.undefined
  /** Content-Language of the object data. */
  var contentLanguage: js.UndefOr[String] = js.undefined
  /** Content-Type of the object data. If an object is stored without a Content-Type, it is served as application/octet-stream. */
  var contentType: js.UndefOr[String] = js.undefined
  /**
    * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte order. For more information about using the CRC32c
    * checksum, see Hashes and ETags: Best Practices.
    */
  var crc32c: js.UndefOr[String] = js.undefined
  /** Metadata of customer-supplied encryption key, if the object is encrypted by such a key. */
  var customerEncryption: js.UndefOr[Anon_EncryptionAlgorithm] = js.undefined
  /** HTTP 1.1 Entity tag for the object. */
  var etag: js.UndefOr[String] = js.undefined
  /** The content generation of this object. Used for object versioning. */
  var generation: js.UndefOr[String] = js.undefined
  /** The ID of the object, including the bucket name, object name, and generation number. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind of item this is. For objects, this is always storage#object. */
  var kind: js.UndefOr[String] = js.undefined
  /** Cloud KMS Key used to encrypt this object, if the object is encrypted by such a key. */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  /** MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see Hashes and ETags: Best Practices. */
  var md5Hash: js.UndefOr[String] = js.undefined
  /** Media download link. */
  var mediaLink: js.UndefOr[String] = js.undefined
  /** User-provided metadata, in key/value pairs. */
  var metadata: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * The version of the metadata for this object at this generation. Used for preconditions and for detecting changes in metadata. A metageneration number
    * is only meaningful in the context of a particular generation of a particular object.
    */
  var metageneration: js.UndefOr[String] = js.undefined
  /** The name of the object. Required if not specified by URL parameter. */
  var name: js.UndefOr[String] = js.undefined
  /** The owner of the object. This will always be the uploader of the object. */
  var owner: js.UndefOr[Anon_Entity] = js.undefined
  /** The link to this object. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Content-Length of the data in bytes. */
  var size: js.UndefOr[String] = js.undefined
  /** Storage class of the object. */
  var storageClass: js.UndefOr[String] = js.undefined
  /** The creation time of the object in RFC 3339 format. */
  var timeCreated: js.UndefOr[String] = js.undefined
  /** The deletion time of the object in RFC 3339 format. Will be returned if and only if this version of the object has been deleted. */
  var timeDeleted: js.UndefOr[String] = js.undefined
  /** The time at which the object's storage class was last changed. When the object is initially created, it will be set to timeCreated. */
  var timeStorageClassUpdated: js.UndefOr[String] = js.undefined
  /** The modification time of the object metadata in RFC 3339 format. */
  var updated: js.UndefOr[String] = js.undefined
}

object Object {
  @scala.inline
  def apply(
    acl: js.Array[ObjectAccessControl] = null,
    bucket: String = null,
    cacheControl: String = null,
    componentCount: Int | Double = null,
    contentDisposition: String = null,
    contentEncoding: String = null,
    contentLanguage: String = null,
    contentType: String = null,
    crc32c: String = null,
    customerEncryption: Anon_EncryptionAlgorithm = null,
    etag: String = null,
    generation: String = null,
    id: String = null,
    kind: String = null,
    kmsKeyName: String = null,
    md5Hash: String = null,
    mediaLink: String = null,
    metadata: Record[String, String] = null,
    metageneration: String = null,
    name: String = null,
    owner: Anon_Entity = null,
    selfLink: String = null,
    size: String = null,
    storageClass: String = null,
    timeCreated: String = null,
    timeDeleted: String = null,
    timeStorageClassUpdated: String = null,
    updated: String = null
  ): Object = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (componentCount != null) __obj.updateDynamic("componentCount")(componentCount.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (crc32c != null) __obj.updateDynamic("crc32c")(crc32c.asInstanceOf[js.Any])
    if (customerEncryption != null) __obj.updateDynamic("customerEncryption")(customerEncryption.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName.asInstanceOf[js.Any])
    if (md5Hash != null) __obj.updateDynamic("md5Hash")(md5Hash.asInstanceOf[js.Any])
    if (mediaLink != null) __obj.updateDynamic("mediaLink")(mediaLink.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (metageneration != null) __obj.updateDynamic("metageneration")(metageneration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    if (timeDeleted != null) __obj.updateDynamic("timeDeleted")(timeDeleted.asInstanceOf[js.Any])
    if (timeStorageClassUpdated != null) __obj.updateDynamic("timeStorageClassUpdated")(timeStorageClassUpdated.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
}

