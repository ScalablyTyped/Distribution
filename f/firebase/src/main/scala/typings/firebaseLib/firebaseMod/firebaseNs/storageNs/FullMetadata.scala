package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullMetadata extends UploadMetadata {
  var bucket: java.lang.String
  /**
    * @deprecated
    * Use Reference.getDownloadURL instead. This property will be removed in a
    * future release.
    */
  var downloadURLs: coreDashJsLib.Array[java.lang.String]
  var fullPath: java.lang.String
  var generation: java.lang.String
  var metageneration: java.lang.String
  var name: java.lang.String
  var size: scala.Double
  var timeCreated: java.lang.String
  var updated: java.lang.String
}

object FullMetadata {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    downloadURLs: coreDashJsLib.Array[java.lang.String],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucket")(bucket)
    __obj.updateDynamic("downloadURLs")(downloadURLs)
    __obj.updateDynamic("fullPath")(fullPath)
    __obj.updateDynamic("generation")(generation)
    __obj.updateDynamic("metageneration")(metageneration)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("timeCreated")(timeCreated)
    __obj.updateDynamic("updated")(updated)
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

