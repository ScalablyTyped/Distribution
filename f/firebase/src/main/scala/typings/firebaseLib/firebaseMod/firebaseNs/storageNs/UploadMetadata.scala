package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadMetadata extends SettableMetadata {
  var md5Hash: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object UploadMetadata {
  @scala.inline
  def apply(
    cacheControl: java.lang.String = null,
    contentDisposition: java.lang.String = null,
    contentEncoding: java.lang.String = null,
    contentLanguage: java.lang.String = null,
    contentType: java.lang.String = null,
    customMetadata: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    md5Hash: java.lang.String = null
  ): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl)
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition)
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (customMetadata != null) __obj.updateDynamic("customMetadata")(customMetadata)
    if (md5Hash != null) __obj.updateDynamic("md5Hash")(md5Hash)
    __obj.asInstanceOf[UploadMetadata]
  }
}

