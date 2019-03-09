package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object metadata that can be set at any time.
  */
trait SettableMetadata extends js.Object {
  /**
    * Served as the 'Cache-Control' header on object download.
    */
  var cacheControl: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var contentDisposition: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Served as the 'Content-Encoding' header on object download.
    */
  var contentEncoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Served as the 'Content-Language' header on object download.
    */
  var contentLanguage: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Served as the 'Content-Type' header on object download.
    */
  var contentType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Additional user-defined custom metadata.
    */
  var customMetadata: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
}

object SettableMetadata {
  @scala.inline
  def apply(
    cacheControl: java.lang.String = null,
    contentDisposition: java.lang.String = null,
    contentEncoding: java.lang.String = null,
    contentLanguage: java.lang.String = null,
    contentType: java.lang.String = null,
    customMetadata: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): SettableMetadata = {
    val __obj = js.Dynamic.literal()
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl)
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition)
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (customMetadata != null) __obj.updateDynamic("customMetadata")(customMetadata)
    __obj.asInstanceOf[SettableMetadata]
  }
}

