package typings.firebase.mod.storage

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object metadata that can be set at upload.
  */
trait UploadMetadata extends SettableMetadata {
  /**
    * A Base64-encoded MD5 hash of the object being uploaded.
    */
  var md5Hash: js.UndefOr[String | Null] = js.undefined
}

object UploadMetadata {
  @scala.inline
  def apply(
    cacheControl: js.UndefOr[Null | String] = js.undefined,
    contentDisposition: js.UndefOr[Null | String] = js.undefined,
    contentEncoding: js.UndefOr[Null | String] = js.undefined,
    contentLanguage: js.UndefOr[Null | String] = js.undefined,
    contentType: js.UndefOr[Null | String] = js.undefined,
    customMetadata: js.UndefOr[Null | StringDictionary[String]] = js.undefined,
    md5Hash: js.UndefOr[Null | String] = js.undefined
  ): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheControl)) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (!js.isUndefined(contentDisposition)) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEncoding)) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(contentLanguage)) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(contentType)) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(customMetadata)) __obj.updateDynamic("customMetadata")(customMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(md5Hash)) __obj.updateDynamic("md5Hash")(md5Hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadMetadata]
  }
}

