package typings.firebaseStorage.srcMetadataMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseStorage.referenceMod.Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @fileoverview Documentation for the metadata format.
  */
@js.native
trait Metadata
  extends /* prop */ StringDictionary[js.Any] {
  var bucket: js.UndefOr[String] = js.native
  var cacheControl: js.UndefOr[String] = js.native
  var contentDisposition: js.UndefOr[String] = js.native
  var contentEncoding: js.UndefOr[String] = js.native
  var contentLanguage: js.UndefOr[String] = js.native
  var contentType: js.UndefOr[String] = js.native
  var customMetadata: js.UndefOr[StringDictionary[String]] = js.native
  var downloadTokens: js.UndefOr[js.Array[String]] = js.native
  var fullPath: js.UndefOr[String] = js.native
  var generation: js.UndefOr[String] = js.native
  var md5Hash: js.UndefOr[String] = js.native
  var metageneration: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var ref: js.UndefOr[Reference] = js.native
  var size: js.UndefOr[Double] = js.native
  var timeCreated: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var updated: js.UndefOr[String] = js.native
}

object Metadata {
  @scala.inline
  def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setCacheControl(value: String): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    @scala.inline
    def setContentDisposition(value: String): Self = this.set("contentDisposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDisposition: Self = this.set("contentDisposition", js.undefined)
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setCustomMetadata(value: StringDictionary[String]): Self = this.set("customMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMetadata: Self = this.set("customMetadata", js.undefined)
    @scala.inline
    def setDownloadTokensVarargs(value: String*): Self = this.set("downloadTokens", js.Array(value :_*))
    @scala.inline
    def setDownloadTokens(value: js.Array[String]): Self = this.set("downloadTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadTokens: Self = this.set("downloadTokens", js.undefined)
    @scala.inline
    def setFullPath(value: String): Self = this.set("fullPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullPath: Self = this.set("fullPath", js.undefined)
    @scala.inline
    def setGeneration(value: String): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    @scala.inline
    def setMd5Hash(value: String): Self = this.set("md5Hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5Hash: Self = this.set("md5Hash", js.undefined)
    @scala.inline
    def setMetageneration(value: String): Self = this.set("metageneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetageneration: Self = this.set("metageneration", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRef(value: Reference): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

