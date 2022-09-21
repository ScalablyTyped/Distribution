package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateUploadUrlResponse extends StObject {
  
  /**
    * The generated Google Cloud Storage signed URL that should be used for a function source code upload. The uploaded file should be a zip archive which contains a function.
    */
  var uploadUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGenerateUploadUrlResponse {
  
  inline def apply(): SchemaGenerateUploadUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateUploadUrlResponse]
  }
  
  extension [Self <: SchemaGenerateUploadUrlResponse](x: Self) {
    
    inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlNull: Self = StObject.set(x, "uploadUrl", null)
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
