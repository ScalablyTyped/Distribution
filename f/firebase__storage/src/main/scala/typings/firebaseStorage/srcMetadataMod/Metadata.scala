package typings.firebaseStorage.srcMetadataMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseStorage.referenceMod.Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @fileoverview Documentation for the metadata format.
  */
trait Metadata
  extends /* prop */ StringDictionary[js.Any] {
  var bucket: js.UndefOr[String] = js.undefined
  var cacheControl: js.UndefOr[String] = js.undefined
  var contentDisposition: js.UndefOr[String] = js.undefined
  var contentEncoding: js.UndefOr[String] = js.undefined
  var contentLanguage: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var customMetadata: js.UndefOr[StringDictionary[String]] = js.undefined
  var downloadTokens: js.UndefOr[js.Array[String]] = js.undefined
  var fullPath: js.UndefOr[String] = js.undefined
  var generation: js.UndefOr[String] = js.undefined
  var md5Hash: js.UndefOr[String] = js.undefined
  var metageneration: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[Reference] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var timeCreated: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    bucket: String = null,
    cacheControl: String = null,
    contentDisposition: String = null,
    contentEncoding: String = null,
    contentLanguage: String = null,
    contentType: String = null,
    customMetadata: StringDictionary[String] = null,
    downloadTokens: js.Array[String] = null,
    fullPath: String = null,
    generation: String = null,
    md5Hash: String = null,
    metageneration: String = null,
    name: String = null,
    ref: Reference = null,
    size: js.UndefOr[Double] = js.undefined,
    timeCreated: String = null,
    `type`: String = null,
    updated: String = null
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (customMetadata != null) __obj.updateDynamic("customMetadata")(customMetadata.asInstanceOf[js.Any])
    if (downloadTokens != null) __obj.updateDynamic("downloadTokens")(downloadTokens.asInstanceOf[js.Any])
    if (fullPath != null) __obj.updateDynamic("fullPath")(fullPath.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (md5Hash != null) __obj.updateDynamic("md5Hash")(md5Hash.asInstanceOf[js.Any])
    if (metageneration != null) __obj.updateDynamic("metageneration")(metageneration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

