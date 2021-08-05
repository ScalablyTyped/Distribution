package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseStorage.srcReferenceMod.Reference
import typings.firebaseStorageTypes.mod.FullMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMetadataMod {
  
  /**
    * @fileoverview Documentation for the metadata format.
    */
  /**
    * The full set of object metadata, including read-only properties.
    */
  trait Metadata
    extends StObject
       with FullMetadata
       with /* prop */ StringDictionary[js.Any] {
    
    @JSName("cacheControl")
    var cacheControl_Metadata: js.UndefOr[String] = js.undefined
    
    @JSName("contentDisposition")
    var contentDisposition_Metadata: js.UndefOr[String] = js.undefined
    
    @JSName("contentEncoding")
    var contentEncoding_Metadata: js.UndefOr[String] = js.undefined
    
    @JSName("contentLanguage")
    var contentLanguage_Metadata: js.UndefOr[String] = js.undefined
    
    @JSName("contentType")
    var contentType_Metadata: js.UndefOr[String] = js.undefined
    
    @JSName("customMetadata")
    var customMetadata_Metadata: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var downloadTokens: js.UndefOr[js.Array[String]] = js.undefined
    
    @JSName("md5Hash")
    var md5Hash_Metadata: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[Reference] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Metadata {
    
    inline def apply(
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
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCustomMetadata(value: StringDictionary[String]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
      
      inline def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
      
      inline def setDownloadTokens(value: js.Array[String]): Self = StObject.set(x, "downloadTokens", value.asInstanceOf[js.Any])
      
      inline def setDownloadTokensUndefined: Self = StObject.set(x, "downloadTokens", js.undefined)
      
      inline def setDownloadTokensVarargs(value: String*): Self = StObject.set(x, "downloadTokens", js.Array(value :_*))
      
      inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
      
      inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
      
      inline def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
