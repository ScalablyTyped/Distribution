package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeneratedStandaloneApk extends StObject {
  
  /**
    * Download ID, which uniquely identifies the APK to download. Should be supplied to `generatedapks.download` method.
    */
  var downloadId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the generated variant.
    */
  var variantId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGeneratedStandaloneApk {
  
  inline def apply(): SchemaGeneratedStandaloneApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeneratedStandaloneApk]
  }
  
  extension [Self <: SchemaGeneratedStandaloneApk](x: Self) {
    
    inline def setDownloadId(value: String): Self = StObject.set(x, "downloadId", value.asInstanceOf[js.Any])
    
    inline def setDownloadIdNull: Self = StObject.set(x, "downloadId", null)
    
    inline def setDownloadIdUndefined: Self = StObject.set(x, "downloadId", js.undefined)
    
    inline def setVariantId(value: Double): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
    
    inline def setVariantIdNull: Self = StObject.set(x, "variantId", null)
    
    inline def setVariantIdUndefined: Self = StObject.set(x, "variantId", js.undefined)
  }
}
