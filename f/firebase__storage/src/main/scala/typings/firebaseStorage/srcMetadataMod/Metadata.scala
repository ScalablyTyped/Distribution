package typings.firebaseStorage.srcMetadataMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseStorage.srcReferenceMod.Reference
import typings.firebaseStorageTypes.mod.FullMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @fileoverview Documentation for the metadata format.
  */
/**
  * The full set of object metadata, including read-only properties.
  */
@js.native
trait Metadata
  extends FullMetadata
     with /* prop */ StringDictionary[js.Any] {
  
  @JSName("cacheControl")
  var cacheControl_Metadata: js.UndefOr[String] = js.native
  
  @JSName("contentDisposition")
  var contentDisposition_Metadata: js.UndefOr[String] = js.native
  
  @JSName("contentEncoding")
  var contentEncoding_Metadata: js.UndefOr[String] = js.native
  
  @JSName("contentLanguage")
  var contentLanguage_Metadata: js.UndefOr[String] = js.native
  
  @JSName("contentType")
  var contentType_Metadata: js.UndefOr[String] = js.native
  
  @JSName("customMetadata")
  var customMetadata_Metadata: js.UndefOr[StringDictionary[String]] = js.native
  
  var downloadTokens: js.UndefOr[js.Array[String]] = js.native
  
  @JSName("md5Hash")
  var md5Hash_Metadata: js.UndefOr[String] = js.native
  
  var ref: js.UndefOr[Reference] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Metadata {
  
  @scala.inline
  def apply(
    bucket: String,
    fullPath: String,
    generation: String,
    metageneration: String,
    name: String,
    size: Double,
    timeCreated: String,
    updated: String
  ): Metadata = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
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
    def setMd5Hash(value: String): Self = this.set("md5Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5Hash: Self = this.set("md5Hash", js.undefined)
    
    @scala.inline
    def setRef(value: Reference): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
