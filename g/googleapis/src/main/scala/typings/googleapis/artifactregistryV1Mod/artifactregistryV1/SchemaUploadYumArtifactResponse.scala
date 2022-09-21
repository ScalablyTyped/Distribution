package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUploadYumArtifactResponse extends StObject {
  
  /**
    * The Apt artifacts updated.
    */
  var yumArtifacts: js.UndefOr[js.Array[SchemaYumArtifact]] = js.undefined
}
object SchemaUploadYumArtifactResponse {
  
  inline def apply(): SchemaUploadYumArtifactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadYumArtifactResponse]
  }
  
  extension [Self <: SchemaUploadYumArtifactResponse](x: Self) {
    
    inline def setYumArtifacts(value: js.Array[SchemaYumArtifact]): Self = StObject.set(x, "yumArtifacts", value.asInstanceOf[js.Any])
    
    inline def setYumArtifactsUndefined: Self = StObject.set(x, "yumArtifacts", js.undefined)
    
    inline def setYumArtifactsVarargs(value: SchemaYumArtifact*): Self = StObject.set(x, "yumArtifacts", js.Array(value*))
  }
}
