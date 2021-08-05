package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApksListResponse extends StObject {
  
  var apks: js.UndefOr[js.Array[SchemaApk]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#apksListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaApksListResponse {
  
  inline def apply(): SchemaApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApksListResponse]
  }
  
  extension [Self <: SchemaApksListResponse](x: Self) {
    
    inline def setApks(value: js.Array[SchemaApk]): Self = StObject.set(x, "apks", value.asInstanceOf[js.Any])
    
    inline def setApksUndefined: Self = StObject.set(x, "apks", js.undefined)
    
    inline def setApksVarargs(value: SchemaApk*): Self = StObject.set(x, "apks", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
