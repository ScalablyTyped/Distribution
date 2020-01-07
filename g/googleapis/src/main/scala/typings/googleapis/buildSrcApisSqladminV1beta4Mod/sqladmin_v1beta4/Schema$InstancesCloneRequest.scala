package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance clone request.
  */
@js.native
trait Schema$InstancesCloneRequest extends js.Object {
  /**
    * Contains details about the clone operation.
    */
  var cloneContext: js.UndefOr[Schema$CloneContext] = js.native
}

object Schema$InstancesCloneRequest {
  @scala.inline
  def apply(cloneContext: Schema$CloneContext = null): Schema$InstancesCloneRequest = {
    val __obj = js.Dynamic.literal()
    if (cloneContext != null) __obj.updateDynamic("cloneContext")(cloneContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesCloneRequest]
  }
}

