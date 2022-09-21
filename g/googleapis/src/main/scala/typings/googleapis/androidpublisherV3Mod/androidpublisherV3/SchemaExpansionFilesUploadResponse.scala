package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExpansionFilesUploadResponse extends StObject {
  
  /**
    * The uploaded expansion file configuration.
    */
  var expansionFile: js.UndefOr[SchemaExpansionFile] = js.undefined
}
object SchemaExpansionFilesUploadResponse {
  
  inline def apply(): SchemaExpansionFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpansionFilesUploadResponse]
  }
  
  extension [Self <: SchemaExpansionFilesUploadResponse](x: Self) {
    
    inline def setExpansionFile(value: SchemaExpansionFile): Self = StObject.set(x, "expansionFile", value.asInstanceOf[js.Any])
    
    inline def setExpansionFileUndefined: Self = StObject.set(x, "expansionFile", js.undefined)
  }
}
