package typings.googleCloudStorage.fileMod

import typings.googleCloudCommon.serviceObjectMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResumableUploadOptions extends StObject {
  
  var configPath: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var origin: js.UndefOr[String] = js.undefined
  
  var predefinedAcl: js.UndefOr[PredefinedAcl] = js.undefined
  
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object CreateResumableUploadOptions {
  
  inline def apply(): CreateResumableUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResumableUploadOptions]
  }
  
  extension [Self <: CreateResumableUploadOptions](x: Self) {
    
    inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
    
    inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPredefinedAcl(value: PredefinedAcl): Self = StObject.set(x, "predefinedAcl", value.asInstanceOf[js.Any])
    
    inline def setPredefinedAclUndefined: Self = StObject.set(x, "predefinedAcl", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
