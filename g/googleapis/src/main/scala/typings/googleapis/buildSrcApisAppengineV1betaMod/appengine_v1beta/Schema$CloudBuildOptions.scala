package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the build operations performed as a part of the version
  * deployment. Only applicable for App Engine flexible environment when
  * creating a version using source code directly.
  */
@js.native
trait Schema$CloudBuildOptions extends js.Object {
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

object Schema$CloudBuildOptions {
  @scala.inline
  def apply(appYamlPath: String = null, cloudBuildTimeout: String = null): Schema$CloudBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (appYamlPath != null) __obj.updateDynamic("appYamlPath")(appYamlPath.asInstanceOf[js.Any])
    if (cloudBuildTimeout != null) __obj.updateDynamic("cloudBuildTimeout")(cloudBuildTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CloudBuildOptions]
  }
}

