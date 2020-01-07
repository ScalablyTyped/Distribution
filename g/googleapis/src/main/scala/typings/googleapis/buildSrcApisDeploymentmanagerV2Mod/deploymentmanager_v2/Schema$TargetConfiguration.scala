package typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetConfiguration extends js.Object {
  /**
    * The configuration to use for this deployment.
    */
  var config: js.UndefOr[Schema$ConfigFile] = js.native
  /**
    * Specifies any files to import for this configuration. This can be used to
    * import templates or other files. For example, you might import a text
    * file in order to use the file in a template.
    */
  var imports: js.UndefOr[js.Array[Schema$ImportFile]] = js.native
}

object Schema$TargetConfiguration {
  @scala.inline
  def apply(config: Schema$ConfigFile = null, imports: js.Array[Schema$ImportFile] = null): Schema$TargetConfiguration = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetConfiguration]
  }
}

