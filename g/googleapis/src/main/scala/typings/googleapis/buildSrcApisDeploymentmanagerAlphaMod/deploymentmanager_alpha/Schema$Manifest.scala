package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Manifest extends js.Object {
  /**
    * Output only. The YAML configuration for this manifest.
    */
  var config: js.UndefOr[Schema$ConfigFile] = js.native
  /**
    * Output only. The fully-expanded configuration file, including any
    * templates and references.
    */
  var expandedConfig: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. The imported files for this manifest.
    */
  var imports: js.UndefOr[js.Array[Schema$ImportFile]] = js.native
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * Output only. The YAML layout for this manifest.
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Output only.  The name of the manifest.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Self link for the manifest.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object Schema$Manifest {
  @scala.inline
  def apply(
    config: Schema$ConfigFile = null,
    expandedConfig: String = null,
    id: String = null,
    imports: js.Array[Schema$ImportFile] = null,
    insertTime: String = null,
    layout: String = null,
    name: String = null,
    selfLink: String = null
  ): Schema$Manifest = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (expandedConfig != null) __obj.updateDynamic("expandedConfig")(expandedConfig.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Manifest]
  }
}

