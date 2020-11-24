package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the build operations performed as a part of the version
  * deployment. Only applicable for App Engine flexible environment when
  * creating a version using source code directly.
  */
@js.native
trait SchemaCloudBuildOptions extends js.Object {
  
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
  implicit class SchemaCloudBuildOptionsOps[Self <: SchemaCloudBuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppYamlPath(value: String): Self = this.set("appYamlPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppYamlPath: Self = this.set("appYamlPath", js.undefined)
    
    @scala.inline
    def setCloudBuildTimeout(value: String): Self = this.set("cloudBuildTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudBuildTimeout: Self = this.set("cloudBuildTimeout", js.undefined)
  }
}
