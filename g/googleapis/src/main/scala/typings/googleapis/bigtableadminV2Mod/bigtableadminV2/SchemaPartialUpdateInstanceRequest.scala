package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for BigtableInstanceAdmin.PartialUpdateInstance.
  */
@js.native
trait SchemaPartialUpdateInstanceRequest extends js.Object {
  /**
    * The Instance which will (partially) replace the current value.
    */
  var instance: js.UndefOr[SchemaInstance] = js.native
  /**
    * The subset of Instance fields which should be replaced. Must be
    * explicitly set.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaPartialUpdateInstanceRequest {
  @scala.inline
  def apply(instance: SchemaInstance = null, updateMask: String = null): SchemaPartialUpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPartialUpdateInstanceRequest]
  }
}

