package typings.atFirebaseStorageDashTypes.atFirebaseStorageDashTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettableMetadata extends js.Object {
  var cacheControl: js.UndefOr[String | Null] = js.undefined
  var contentDisposition: js.UndefOr[String | Null] = js.undefined
  var contentEncoding: js.UndefOr[String | Null] = js.undefined
  var contentLanguage: js.UndefOr[String | Null] = js.undefined
  var contentType: js.UndefOr[String | Null] = js.undefined
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
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl)
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition)
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (customMetadata != null) __obj.updateDynamic("customMetadata")(customMetadata)
    __obj.asInstanceOf[SettableMetadata]
  }
}

