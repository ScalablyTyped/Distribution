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

