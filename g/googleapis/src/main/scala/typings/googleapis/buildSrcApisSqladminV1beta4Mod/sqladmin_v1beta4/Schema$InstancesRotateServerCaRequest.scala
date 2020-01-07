package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rotate Server CA request.
  */
@js.native
trait Schema$InstancesRotateServerCaRequest extends js.Object {
  /**
    * Contains details about the rotate server CA operation.
    */
  var rotateServerCaContext: js.UndefOr[Schema$RotateServerCaContext] = js.native
}

object Schema$InstancesRotateServerCaRequest {
  @scala.inline
  def apply(rotateServerCaContext: Schema$RotateServerCaContext = null): Schema$InstancesRotateServerCaRequest = {
    val __obj = js.Dynamic.literal()
    if (rotateServerCaContext != null) __obj.updateDynamic("rotateServerCaContext")(rotateServerCaContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesRotateServerCaRequest]
  }
}

