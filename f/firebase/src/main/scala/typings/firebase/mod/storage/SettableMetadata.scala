package typings.firebase.mod.storage

import org.scalablytyped.runtime.StringDictionary
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
  var cacheControl: js.UndefOr[String | Null] = js.undefined
  var contentDisposition: js.UndefOr[String | Null] = js.undefined
  /**
    * Served as the 'Content-Encoding' header on object download.
    */
  var contentEncoding: js.UndefOr[String | Null] = js.undefined
  /**
    * Served as the 'Content-Language' header on object download.
    */
  var contentLanguage: js.UndefOr[String | Null] = js.undefined
  /**
    * Served as the 'Content-Type' header on object download.
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  /**
    * Additional user-defined custom metadata.
    */
  var customMetadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}

object SettableMetadata {
  @scala.inline
  def apply(
    cacheControl: String = null,
    contentDisposition: String = null,
    contentEncoding: String = null,
    contentLanguage: String = null,
    contentType: String = null,
    customMetadata: StringDictionary[String] = null
  ): SettableMetadata = {
    val __obj = js.Dynamic.literal()
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (customMetadata != null) __obj.updateDynamic("customMetadata")(customMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableMetadata]
  }
}

