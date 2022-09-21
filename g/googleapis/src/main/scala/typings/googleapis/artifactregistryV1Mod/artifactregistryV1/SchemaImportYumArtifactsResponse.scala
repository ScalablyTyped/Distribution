package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportYumArtifactsResponse extends StObject {
  
  /**
    * Detailed error info for packages that were not imported.
    */
  var errors: js.UndefOr[js.Array[SchemaImportYumArtifactsErrorInfo]] = js.undefined
  
  /**
    * The yum artifacts imported.
    */
  var yumArtifacts: js.UndefOr[js.Array[SchemaYumArtifact]] = js.undefined
}
object SchemaImportYumArtifactsResponse {
  
  inline def apply(): SchemaImportYumArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportYumArtifactsResponse]
  }
  
  extension [Self <: SchemaImportYumArtifactsResponse](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaImportYumArtifactsErrorInfo]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaImportYumArtifactsErrorInfo*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setYumArtifacts(value: js.Array[SchemaYumArtifact]): Self = StObject.set(x, "yumArtifacts", value.asInstanceOf[js.Any])
    
    inline def setYumArtifactsUndefined: Self = StObject.set(x, "yumArtifacts", js.undefined)
    
    inline def setYumArtifactsVarargs(value: SchemaYumArtifact*): Self = StObject.set(x, "yumArtifacts", js.Array(value*))
  }
}
