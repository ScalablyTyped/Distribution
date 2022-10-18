package typings.googleCloudStorage.buildSrcBucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeAllFilesPublicPrivateOptions extends StObject {
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object MakeAllFilesPublicPrivateOptions {
  
  inline def apply(): MakeAllFilesPublicPrivateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeAllFilesPublicPrivateOptions]
  }
  
  extension [Self <: MakeAllFilesPublicPrivateOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
