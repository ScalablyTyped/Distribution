package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGeneratedapksDownload
  extends StObject
     with StandardParameters {
  
  /**
    * Download ID, which uniquely identifies the APK to download. Can be obtained from the response of `generatedapks.list` method.
    */
  var downloadId: js.UndefOr[String] = js.undefined
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Version code of the app bundle.
    */
  var versionCode: js.UndefOr[Double] = js.undefined
}
object ParamsResourceGeneratedapksDownload {
  
  inline def apply(): ParamsResourceGeneratedapksDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGeneratedapksDownload]
  }
  
  extension [Self <: ParamsResourceGeneratedapksDownload](x: Self) {
    
    inline def setDownloadId(value: String): Self = StObject.set(x, "downloadId", value.asInstanceOf[js.Any])
    
    inline def setDownloadIdUndefined: Self = StObject.set(x, "downloadId", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
  }
}
