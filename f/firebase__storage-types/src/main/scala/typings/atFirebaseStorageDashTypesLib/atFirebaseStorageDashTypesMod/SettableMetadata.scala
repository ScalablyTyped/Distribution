package typings
package atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettableMetadata extends js.Object {
  var cacheControl: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var contentDisposition: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var contentEncoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var contentLanguage: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var contentType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
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

