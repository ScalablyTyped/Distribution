package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSystemapksVariantsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaVariant] = js.undefined
  
  /**
    * The version code of the App Bundle.
    */
  var versionCode: js.UndefOr[String] = js.undefined
}
object ParamsResourceSystemapksVariantsCreate {
  
  inline def apply(): ParamsResourceSystemapksVariantsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSystemapksVariantsCreate]
  }
  
  extension [Self <: ParamsResourceSystemapksVariantsCreate](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setRequestBody(value: SchemaVariant): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setVersionCode(value: String): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
  }
}
