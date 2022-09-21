package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUploadYumArtifactMediaResponse extends StObject {
  
  /**
    * Operation to be returned to the user.
    */
  var operation: js.UndefOr[SchemaOperation] = js.undefined
}
object SchemaUploadYumArtifactMediaResponse {
  
  inline def apply(): SchemaUploadYumArtifactMediaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadYumArtifactMediaResponse]
  }
  
  extension [Self <: SchemaUploadYumArtifactMediaResponse](x: Self) {
    
    inline def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
