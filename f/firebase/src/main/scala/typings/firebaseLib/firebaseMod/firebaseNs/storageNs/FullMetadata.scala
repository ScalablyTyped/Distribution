package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The full set of object metadata, including read-only properties.
  */
trait FullMetadata extends UploadMetadata {
  /**
    * The bucket this object is contained in.
    */
  var bucket: java.lang.String
  /**
    * @deprecated
    * Use Reference.getDownloadURL instead. This property will be removed in a
    * future release.
    */
  var downloadURLs: js.Array[java.lang.String]
  /**
    * The full path of this object.
    */
  var fullPath: java.lang.String
  /**
    * The object's generation.
    * @see {@link https://cloud.google.com/storage/docs/generations-preconditions}
    */
  var generation: java.lang.String
  /**
    * The object's metageneration.
    * @see {@link https://cloud.google.com/storage/docs/generations-preconditions}
    */
  var metageneration: java.lang.String
  /**
    * The short name of this object, which is the last component of the full path.
    * For example, if fullPath is 'full/path/image.png', name is 'image.png'.
    */
  var name: java.lang.String
  /**
    * The size of this object, in bytes.
    */
  var size: scala.Double
  /**
    * A date string representing when this object was created.
    */
  var timeCreated: java.lang.String
  /**
    * A date string representing when this object was last updated.
    */
  var updated: java.lang.String
}

object FullMetadata {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    downloadURLs: js.Array[java.lang.String],
    fullPath: java.lang.String,
    generation: java.lang.String,
    metageneration: java.lang.String,
    name: java.lang.String,
    size: scala.Double,
    timeCreated: java.lang.String,
    updated: java.lang.String,
    cacheControl: java.lang.String = null,
    contentDisposition: java.lang.String = null,
    contentEncoding: java.lang.String = null,
    contentLanguage: java.lang.String = null,
    contentType: java.lang.String = null,
    customMetadata: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    md5Hash: java.lang.String = null
  ): FullMetadata = {
    val __obj = js.Dynamic.literal(bucket = bucket, downloadURLs = downloadURLs, fullPath = fullPath, generation = generation, metageneration = metageneration, name = name, size = size, timeCreated = timeCreated, updated = updated)
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl)
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition)
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (customMetadata != null) __obj.updateDynamic("customMetadata")(customMetadata)
    if (md5Hash != null) __obj.updateDynamic("md5Hash")(md5Hash)
    __obj.asInstanceOf[FullMetadata]
  }
}

