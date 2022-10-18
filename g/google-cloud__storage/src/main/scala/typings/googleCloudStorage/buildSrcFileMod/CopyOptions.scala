package typings.googleCloudStorage.buildSrcFileMod

import typings.googleCloudStorage.buildSrcNodejsCommonServiceObjectMod.Metadata
import typings.googleCloudStorage.buildSrcStorageMod.PreconditionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyOptions extends StObject {
  
  var cacheControl: js.UndefOr[String] = js.undefined
  
  var contentDisposition: js.UndefOr[String] = js.undefined
  
  var contentEncoding: js.UndefOr[String] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var destinationKmsKeyName: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var preconditionOpts: js.UndefOr[PreconditionOptions] = js.undefined
  
  var predefinedAcl: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object CopyOptions {
  
  inline def apply(): CopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptions]
  }
  
  extension [Self <: CopyOptions](x: Self) {
    
    inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
    
    inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDestinationKmsKeyName(value: String): Self = StObject.set(x, "destinationKmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setDestinationKmsKeyNameUndefined: Self = StObject.set(x, "destinationKmsKeyName", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPreconditionOpts(value: PreconditionOptions): Self = StObject.set(x, "preconditionOpts", value.asInstanceOf[js.Any])
    
    inline def setPreconditionOptsUndefined: Self = StObject.set(x, "preconditionOpts", js.undefined)
    
    inline def setPredefinedAcl(value: String): Self = StObject.set(x, "predefinedAcl", value.asInstanceOf[js.Any])
    
    inline def setPredefinedAclUndefined: Self = StObject.set(x, "predefinedAcl", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
