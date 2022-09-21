package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInternalappsharingartifactsUploadapk
  extends StObject
     with StandardParameters {
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[js.Object] = js.undefined
}
object ParamsResourceInternalappsharingartifactsUploadapk {
  
  inline def apply(): ParamsResourceInternalappsharingartifactsUploadapk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInternalappsharingartifactsUploadapk]
  }
  
  extension [Self <: ParamsResourceInternalappsharingartifactsUploadapk](x: Self) {
    
    inline def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setRequestBody(value: js.Object): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
