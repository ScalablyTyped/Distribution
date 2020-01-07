package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database demote master request.
  */
@js.native
trait Schema$InstancesDemoteMasterRequest extends js.Object {
  /**
    * Contains details about the demoteMaster operation.
    */
  var demoteMasterContext: js.UndefOr[Schema$DemoteMasterContext] = js.native
}

object Schema$InstancesDemoteMasterRequest {
  @scala.inline
  def apply(demoteMasterContext: Schema$DemoteMasterContext = null): Schema$InstancesDemoteMasterRequest = {
    val __obj = js.Dynamic.literal()
    if (demoteMasterContext != null) __obj.updateDynamic("demoteMasterContext")(demoteMasterContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesDemoteMasterRequest]
  }
}

