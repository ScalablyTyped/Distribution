package typings.googleapis.buildSrcApisBigtableadminV1Mod.bigtableadmin_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for BigtableInstanceAdmin.PartialUpdateInstance.
  */
@js.native
trait Schema$PartialUpdateInstanceRequest extends js.Object {
  /**
    * The Instance which will (partially) replace the current value.
    */
  var instance: js.UndefOr[Schema$Instance] = js.native
  /**
    * The subset of Instance fields which should be replaced. Must be
    * explicitly set.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$PartialUpdateInstanceRequest {
  @scala.inline
  def apply(instance: Schema$Instance = null, updateMask: String = null): Schema$PartialUpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PartialUpdateInstanceRequest]
  }
}

