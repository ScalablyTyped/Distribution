package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeneratedSplitApk extends StObject {
  
  /**
    * Download ID, which uniquely identifies the APK to download. Should be supplied to `generatedapks.download` method.
    */
  var downloadId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the module that this APK belongs to.
    */
  var moduleName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Split ID. Empty for the main split of the base module.
    */
  var splitId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the generated variant.
    */
  var variantId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGeneratedSplitApk {
  
  inline def apply(): SchemaGeneratedSplitApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeneratedSplitApk]
  }
  
  extension [Self <: SchemaGeneratedSplitApk](x: Self) {
    
    inline def setDownloadId(value: String): Self = StObject.set(x, "downloadId", value.asInstanceOf[js.Any])
    
    inline def setDownloadIdNull: Self = StObject.set(x, "downloadId", null)
    
    inline def setDownloadIdUndefined: Self = StObject.set(x, "downloadId", js.undefined)
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setModuleNameNull: Self = StObject.set(x, "moduleName", null)
    
    inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
    
    inline def setSplitId(value: String): Self = StObject.set(x, "splitId", value.asInstanceOf[js.Any])
    
    inline def setSplitIdNull: Self = StObject.set(x, "splitId", null)
    
    inline def setSplitIdUndefined: Self = StObject.set(x, "splitId", js.undefined)
    
    inline def setVariantId(value: Double): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
    
    inline def setVariantIdNull: Self = StObject.set(x, "variantId", null)
    
    inline def setVariantIdUndefined: Self = StObject.set(x, "variantId", js.undefined)
  }
}
