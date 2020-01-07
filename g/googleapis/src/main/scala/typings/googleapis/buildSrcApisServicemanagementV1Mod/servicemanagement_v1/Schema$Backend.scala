package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Backend` defines the backend configuration for a service.
  */
@js.native
trait Schema$Backend extends js.Object {
  /**
    * A list of API backend rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[Schema$BackendRule]] = js.native
}

object Schema$Backend {
  @scala.inline
  def apply(rules: js.Array[Schema$BackendRule] = null): Schema$Backend = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Backend]
  }
}

