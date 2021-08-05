package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request of `GenerateDownloadUrl` method.
  */
trait SchemaGenerateDownloadUrlRequest extends StObject {
  
  /**
    * The optional version of function. If not set, default, current version is
    * used.
    */
  var versionId: js.UndefOr[String] = js.undefined
}
object SchemaGenerateDownloadUrlRequest {
  
  inline def apply(): SchemaGenerateDownloadUrlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateDownloadUrlRequest]
  }
  
  extension [Self <: SchemaGenerateDownloadUrlRequest](x: Self) {
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
