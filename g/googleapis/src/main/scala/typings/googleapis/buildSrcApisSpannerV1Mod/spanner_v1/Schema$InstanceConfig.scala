package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A possible configuration for a Cloud Spanner instance. Configurations
  * define the geographic placement of nodes and their replication.
  */
@js.native
trait Schema$InstanceConfig extends js.Object {
  /**
    * The name of this instance configuration as it appears in UIs.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the instance configuration.  Values are of the
    * form `projects/&lt;project&gt;/instanceConfigs/a-z*`
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$InstanceConfig {
  @scala.inline
  def apply(displayName: String = null, name: String = null): Schema$InstanceConfig = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceConfig]
  }
}

