package typings.firebaseStorageTypes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullMetadata extends UploadMetadata {
  var bucket: String
  var fullPath: String
  var generation: String
  var metageneration: String
  var name: String
  var size: Double
  var timeCreated: String
  var updated: String
}

object FullMetadata {
  @scala.inline
  def apply(
    bucket: String,
    fullPath: String,
    generation: String,
    metageneration: String,
    name: String,
    size: Double,
    timeCreated: String,
    updated: String,
    cacheControl: js.UndefOr[Null | String] = js.undefined,
    contentDisposition: js.UndefOr[Null | String] = js.undefined,
    contentEncoding: js.UndefOr[Null | String] = js.undefined,
    contentLanguage: js.UndefOr[Null | String] = js.undefined,
    contentType: js.UndefOr[Null | String] = js.undefined,
    customMetadata: js.UndefOr[Null | StringDictionary[String]] = js.undefined,
    md5Hash: js.UndefOr[Null | String] = js.undefined
  ): FullMetadata = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheControl)) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (!js.isUndefined(contentDisposition)) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEncoding)) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(contentLanguage)) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(contentType)) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(customMetadata)) __obj.updateDynamic("customMetadata")(customMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(md5Hash)) __obj.updateDynamic("md5Hash")(md5Hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullMetadata]
  }
}

