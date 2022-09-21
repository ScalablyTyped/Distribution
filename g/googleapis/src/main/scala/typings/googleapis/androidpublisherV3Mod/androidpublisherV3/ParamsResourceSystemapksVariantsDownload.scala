package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSystemapksVariantsDownload
  extends StObject
     with StandardParameters {
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a previously created system APK variant.
    */
  var variantId: js.UndefOr[Double] = js.undefined
  
  /**
    * The version code of the App Bundle.
    */
  var versionCode: js.UndefOr[String] = js.undefined
}
object ParamsResourceSystemapksVariantsDownload {
  
  inline def apply(): ParamsResourceSystemapksVariantsDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSystemapksVariantsDownload]
  }
  
  extension [Self <: ParamsResourceSystemapksVariantsDownload](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setVariantId(value: Double): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
    
    inline def setVariantIdUndefined: Self = StObject.set(x, "variantId", js.undefined)
    
    inline def setVersionCode(value: String): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
  }
}
