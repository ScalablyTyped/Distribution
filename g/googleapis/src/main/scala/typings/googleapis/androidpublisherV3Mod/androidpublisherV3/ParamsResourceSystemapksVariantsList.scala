package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSystemapksVariantsList
  extends StObject
     with StandardParameters {
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * The version code of the App Bundle.
    */
  var versionCode: js.UndefOr[String] = js.undefined
}
object ParamsResourceSystemapksVariantsList {
  
  inline def apply(): ParamsResourceSystemapksVariantsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSystemapksVariantsList]
  }
  
  extension [Self <: ParamsResourceSystemapksVariantsList](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setVersionCode(value: String): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
  }
}
