package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeneratedAssetPackSlice extends StObject {
  
  /**
    * Download ID, which uniquely identifies the APK to download. Should be supplied to `generatedapks.download` method.
    */
  var downloadId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the module that this asset slice belongs to.
    */
  var moduleName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Asset slice ID.
    */
  var sliceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Asset module version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGeneratedAssetPackSlice {
  
  inline def apply(): SchemaGeneratedAssetPackSlice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeneratedAssetPackSlice]
  }
  
  extension [Self <: SchemaGeneratedAssetPackSlice](x: Self) {
    
    inline def setDownloadId(value: String): Self = StObject.set(x, "downloadId", value.asInstanceOf[js.Any])
    
    inline def setDownloadIdNull: Self = StObject.set(x, "downloadId", null)
    
    inline def setDownloadIdUndefined: Self = StObject.set(x, "downloadId", js.undefined)
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setModuleNameNull: Self = StObject.set(x, "moduleName", null)
    
    inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
    
    inline def setSliceId(value: String): Self = StObject.set(x, "sliceId", value.asInstanceOf[js.Any])
    
    inline def setSliceIdNull: Self = StObject.set(x, "sliceId", null)
    
    inline def setSliceIdUndefined: Self = StObject.set(x, "sliceId", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
