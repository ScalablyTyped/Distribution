package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudBuildOptions extends StObject {
  
  /**
    * Path to the yaml file used in deployment, used to determine runtime configuration details.Required for flexible environment builds.See https://cloud.google.com/appengine/docs/standard/python/config/appref for more details.
    */
  var appYamlPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes.
    */
  var cloudBuildTimeout: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudBuildOptions {
  
  inline def apply(): SchemaCloudBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudBuildOptions]
  }
  
  extension [Self <: SchemaCloudBuildOptions](x: Self) {
    
    inline def setAppYamlPath(value: String): Self = StObject.set(x, "appYamlPath", value.asInstanceOf[js.Any])
    
    inline def setAppYamlPathNull: Self = StObject.set(x, "appYamlPath", null)
    
    inline def setAppYamlPathUndefined: Self = StObject.set(x, "appYamlPath", js.undefined)
    
    inline def setCloudBuildTimeout(value: String): Self = StObject.set(x, "cloudBuildTimeout", value.asInstanceOf[js.Any])
    
    inline def setCloudBuildTimeoutNull: Self = StObject.set(x, "cloudBuildTimeout", null)
    
    inline def setCloudBuildTimeoutUndefined: Self = StObject.set(x, "cloudBuildTimeout", js.undefined)
  }
}
