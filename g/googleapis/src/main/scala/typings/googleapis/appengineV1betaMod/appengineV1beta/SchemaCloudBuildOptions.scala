package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the build operations performed as a part of the version
  * deployment. Only applicable for App Engine flexible environment when
  * creating a version using source code directly.
  */
@js.native
trait SchemaCloudBuildOptions extends StObject {
  
  /**
    * Path to the yaml file used in deployment, used to determine runtime
    * configuration details.Required for flexible environment builds.See
    * https://cloud.google.com/appengine/docs/standard/python/config/appref for
    * more details.
    */
  var appYamlPath: js.UndefOr[String] = js.native
  
  /**
    * The Cloud Build timeout used as part of any dependent builds performed by
    * version creation. Defaults to 10 minutes.
    */
  var cloudBuildTimeout: js.UndefOr[String] = js.native
}
object SchemaCloudBuildOptions {
  
  @scala.inline
  def apply(): SchemaCloudBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudBuildOptions]
  }
  
  @scala.inline
  implicit class SchemaCloudBuildOptionsMutableBuilder[Self <: SchemaCloudBuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppYamlPath(value: String): Self = StObject.set(x, "appYamlPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppYamlPathUndefined: Self = StObject.set(x, "appYamlPath", js.undefined)
    
    @scala.inline
    def setCloudBuildTimeout(value: String): Self = StObject.set(x, "cloudBuildTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudBuildTimeoutUndefined: Self = StObject.set(x, "cloudBuildTimeout", js.undefined)
  }
}
