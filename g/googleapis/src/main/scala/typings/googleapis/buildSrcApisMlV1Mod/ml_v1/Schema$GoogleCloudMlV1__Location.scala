package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GoogleCloudMlV1__Location extends js.Object {
  /**
    * Capabilities available in the location.
    */
  var capabilities: js.UndefOr[js.Array[Schema$GoogleCloudMlV1__Capability]] = js.native
  var name: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudMlV1__Location {
  @scala.inline
  def apply(capabilities: js.Array[Schema$GoogleCloudMlV1__Capability] = null, name: String = null): Schema$GoogleCloudMlV1__Location = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudMlV1__Location]
  }
}

