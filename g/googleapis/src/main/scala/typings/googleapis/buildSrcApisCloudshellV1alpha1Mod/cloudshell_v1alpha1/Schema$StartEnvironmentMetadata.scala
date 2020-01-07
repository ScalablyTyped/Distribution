package typings.googleapis.buildSrcApisCloudshellV1alpha1Mod.cloudshell_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message included in the metadata field of operations returned from
  * StartEnvironment.
  */
@js.native
trait Schema$StartEnvironmentMetadata extends js.Object {
  /**
    * Current state of the environment being started.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$StartEnvironmentMetadata {
  @scala.inline
  def apply(state: String = null): Schema$StartEnvironmentMetadata = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StartEnvironmentMetadata]
  }
}

