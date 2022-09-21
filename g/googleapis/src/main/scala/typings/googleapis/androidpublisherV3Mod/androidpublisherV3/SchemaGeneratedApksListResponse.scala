package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeneratedApksListResponse extends StObject {
  
  /**
    * All generated APKs, grouped by the APK signing key.
    */
  var generatedApks: js.UndefOr[js.Array[SchemaGeneratedApksPerSigningKey]] = js.undefined
}
object SchemaGeneratedApksListResponse {
  
  inline def apply(): SchemaGeneratedApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeneratedApksListResponse]
  }
  
  extension [Self <: SchemaGeneratedApksListResponse](x: Self) {
    
    inline def setGeneratedApks(value: js.Array[SchemaGeneratedApksPerSigningKey]): Self = StObject.set(x, "generatedApks", value.asInstanceOf[js.Any])
    
    inline def setGeneratedApksUndefined: Self = StObject.set(x, "generatedApks", js.undefined)
    
    inline def setGeneratedApksVarargs(value: SchemaGeneratedApksPerSigningKey*): Self = StObject.set(x, "generatedApks", js.Array(value*))
  }
}
