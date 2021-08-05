package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for the given google.longrunning.Operation during a
  * google.appengine.v1alpha.CreateVersionRequest.
  */
trait SchemaCreateVersionMetadataV1Alpha extends StObject {
  
  /**
    * The Cloud Build ID if one was created as part of the version create.
    * @OutputOnly
    */
  var cloudBuildId: js.UndefOr[String] = js.undefined
}
object SchemaCreateVersionMetadataV1Alpha {
  
  inline def apply(): SchemaCreateVersionMetadataV1Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateVersionMetadataV1Alpha]
  }
  
  extension [Self <: SchemaCreateVersionMetadataV1Alpha](x: Self) {
    
    inline def setCloudBuildId(value: String): Self = StObject.set(x, "cloudBuildId", value.asInstanceOf[js.Any])
    
    inline def setCloudBuildIdUndefined: Self = StObject.set(x, "cloudBuildId", js.undefined)
  }
}
