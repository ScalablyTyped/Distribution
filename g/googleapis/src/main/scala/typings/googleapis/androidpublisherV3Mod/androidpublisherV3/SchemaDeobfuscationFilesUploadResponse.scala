package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeobfuscationFilesUploadResponse extends StObject {
  
  /**
    * The uploaded Deobfuscation File configuration.
    */
  var deobfuscationFile: js.UndefOr[SchemaDeobfuscationFile] = js.undefined
}
object SchemaDeobfuscationFilesUploadResponse {
  
  inline def apply(): SchemaDeobfuscationFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeobfuscationFilesUploadResponse]
  }
  
  extension [Self <: SchemaDeobfuscationFilesUploadResponse](x: Self) {
    
    inline def setDeobfuscationFile(value: SchemaDeobfuscationFile): Self = StObject.set(x, "deobfuscationFile", value.asInstanceOf[js.Any])
    
    inline def setDeobfuscationFileUndefined: Self = StObject.set(x, "deobfuscationFile", js.undefined)
  }
}
