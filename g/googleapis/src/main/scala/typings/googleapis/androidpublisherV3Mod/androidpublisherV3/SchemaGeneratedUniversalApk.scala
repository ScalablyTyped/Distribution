package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeneratedUniversalApk extends StObject {
  
  /**
    * Download ID, which uniquely identifies the APK to download. Should be supplied to `generatedapks.download` method.
    */
  var downloadId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGeneratedUniversalApk {
  
  inline def apply(): SchemaGeneratedUniversalApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeneratedUniversalApk]
  }
  
  extension [Self <: SchemaGeneratedUniversalApk](x: Self) {
    
    inline def setDownloadId(value: String): Self = StObject.set(x, "downloadId", value.asInstanceOf[js.Any])
    
    inline def setDownloadIdNull: Self = StObject.set(x, "downloadId", null)
    
    inline def setDownloadIdUndefined: Self = StObject.set(x, "downloadId", js.undefined)
  }
}
