package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateVersionMetadataV1Beta extends StObject {
  
  /**
    * The Cloud Build ID if one was created as part of the version create. @OutputOnly
    */
  var cloudBuildId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateVersionMetadataV1Beta {
  
  inline def apply(): SchemaCreateVersionMetadataV1Beta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateVersionMetadataV1Beta]
  }
  
  extension [Self <: SchemaCreateVersionMetadataV1Beta](x: Self) {
    
    inline def setCloudBuildId(value: String): Self = StObject.set(x, "cloudBuildId", value.asInstanceOf[js.Any])
    
    inline def setCloudBuildIdNull: Self = StObject.set(x, "cloudBuildId", null)
    
    inline def setCloudBuildIdUndefined: Self = StObject.set(x, "cloudBuildId", js.undefined)
  }
}
