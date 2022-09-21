package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateDownloadUrlResponse extends StObject {
  
  /**
    * The generated Google Cloud Storage signed URL that should be used for function source code download.
    */
  var downloadUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGenerateDownloadUrlResponse {
  
  inline def apply(): SchemaGenerateDownloadUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateDownloadUrlResponse]
  }
  
  extension [Self <: SchemaGenerateDownloadUrlResponse](x: Self) {
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlNull: Self = StObject.set(x, "downloadUrl", null)
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
  }
}
