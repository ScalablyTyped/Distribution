package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Cloud Build information.
  */
trait SchemaBuildInfo extends StObject {
  
  /**
    * The Google Cloud Build id. Example:
    * &quot;f966068f-08b2-42c8-bdfe-74137dff2bf9&quot;
    */
  var cloudBuildId: js.UndefOr[String] = js.undefined
}
object SchemaBuildInfo {
  
  inline def apply(): SchemaBuildInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildInfo]
  }
  
  extension [Self <: SchemaBuildInfo](x: Self) {
    
    inline def setCloudBuildId(value: String): Self = StObject.set(x, "cloudBuildId", value.asInstanceOf[js.Any])
    
    inline def setCloudBuildIdUndefined: Self = StObject.set(x, "cloudBuildId", js.undefined)
  }
}
