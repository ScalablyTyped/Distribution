package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  /** Access controls on the object. */
  var acl: js.UndefOr[js.Array[ObjectAccessControl]] = js.undefined
  /** The name of the bucket containing this object. */
  var bucket: js.UndefOr[java.lang.String] = js.undefined
  /** Cache-Control directive for the object data. If omitted, and the object is accessible to all anonymous users, the default will be public, max-age=3600. */
  var cacheControl: js.UndefOr[java.lang.String] = js.undefined
  /** Number of underlying components that make up this object. Components are accumulated by compose operations. */
  var componentCount: js.UndefOr[scala.Double] = js.undefined
  /** Content-Disposition of the object data. */
  var contentDisposition: js.UndefOr[java.lang.String] = js.undefined
  /** Content-Encoding of the object data. */
  var contentEncoding: js.UndefOr[java.lang.String] = js.undefined
  /** Content-Language of the object data. */
  var contentLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** Content-Type of the object data. If an object is stored without a Content-Type, it is served as application/octet-stream. */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte order. For more information about using the CRC32c
    * checksum, see Hashes and ETags: Best Practices.
    */
  var crc32c: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata of customer-supplied encryption key, if the object is encrypted by such a key. */
  var customerEncryption: js.UndefOr[gapiDotClientDotStorageLib.Anon_EncryptionAlgorithm] = js.undefined
  /** HTTP 1.1 Entity tag for the object. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The content generation of this object. Used for object versioning. */
  var generation: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the object, including the bucket name, object name, and generation number. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of item this is. For objects, this is always storage#object. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Cloud KMS Key used to encrypt this object, if the object is encrypted by such a key. */
  var kmsKeyName: js.UndefOr[java.lang.String] = js.undefined
  /** MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see Hashes and ETags: Best Practices. */
  var md5Hash: js.UndefOr[java.lang.String] = js.undefined
  /** Media download link. */
  var mediaLink: js.UndefOr[java.lang.String] = js.undefined
  /** User-provided metadata, in key/value pairs. */
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * The version of the metadata for this object at this generation. Used for preconditions and for detecting changes in metadata. A metageneration number
    * is only meaningful in the context of a particular generation of a particular object.
    */
  var metageneration: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the object. Required if not specified by URL parameter. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The owner of the object. This will always be the uploader of the object. */
  var owner: js.UndefOr[gapiDotClientDotStorageLib.Anon_Entity] = js.undefined
  /** The link to this object. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Content-Length of the data in bytes. */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /** Storage class of the object. */
  var storageClass: js.UndefOr[java.lang.String] = js.undefined
  /** The creation time of the object in RFC 3339 format. */
  var timeCreated: js.UndefOr[java.lang.String] = js.undefined
  /** The deletion time of the object in RFC 3339 format. Will be returned if and only if this version of the object has been deleted. */
  var timeDeleted: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which the object's storage class was last changed. When the object is initially created, it will be set to timeCreated. */
  var timeStorageClassUpdated: js.UndefOr[java.lang.String] = js.undefined
  /** The modification time of the object metadata in RFC 3339 format. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

object Object {
  @scala.inline
  def apply(
    acl: js.Array[ObjectAccessControl] = null,
    bucket: java.lang.String = null,
    cacheControl: java.lang.String = null,
    componentCount: scala.Int | scala.Double = null,
    contentDisposition: java.lang.String = null,
    contentEncoding: java.lang.String = null,
    contentLanguage: java.lang.String = null,
    contentType: java.lang.String = null,
    crc32c: java.lang.String = null,
    customerEncryption: gapiDotClientDotStorageLib.Anon_EncryptionAlgorithm = null,
    etag: java.lang.String = null,
    generation: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    kmsKeyName: java.lang.String = null,
    md5Hash: java.lang.String = null,
    mediaLink: java.lang.String = null,
    metadata: stdLib.Record[java.lang.String, java.lang.String] = null,
    metageneration: java.lang.String = null,
    name: java.lang.String = null,
    owner: gapiDotClientDotStorageLib.Anon_Entity = null,
    selfLink: java.lang.String = null,
    size: java.lang.String = null,
    storageClass: java.lang.String = null,
    timeCreated: java.lang.String = null,
    timeDeleted: java.lang.String = null,
    timeStorageClassUpdated: java.lang.String = null,
    updated: java.lang.String = null
  ): Object = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl)
    if (bucket != null) __obj.updateDynamic("bucket")(bucket)
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl)
    if (componentCount != null) __obj.updateDynamic("componentCount")(componentCount.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition)
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (crc32c != null) __obj.updateDynamic("crc32c")(crc32c)
    if (customerEncryption != null) __obj.updateDynamic("customerEncryption")(customerEncryption)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (generation != null) __obj.updateDynamic("generation")(generation)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
    if (md5Hash != null) __obj.updateDynamic("md5Hash")(md5Hash)
    if (mediaLink != null) __obj.updateDynamic("mediaLink")(mediaLink)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (metageneration != null) __obj.updateDynamic("metageneration")(metageneration)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (size != null) __obj.updateDynamic("size")(size)
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass)
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated)
    if (timeDeleted != null) __obj.updateDynamic("timeDeleted")(timeDeleted)
    if (timeStorageClassUpdated != null) __obj.updateDynamic("timeStorageClassUpdated")(timeStorageClassUpdated)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Object]
  }
}

