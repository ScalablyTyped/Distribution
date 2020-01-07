package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance import request.
  */
@js.native
trait Schema$InstancesImportRequest extends js.Object {
  /**
    * Contains details about the import operation.
    */
  var importContext: js.UndefOr[Schema$ImportContext] = js.native
}

object Schema$InstancesImportRequest {
  @scala.inline
  def apply(importContext: Schema$ImportContext = null): Schema$InstancesImportRequest = {
    val __obj = js.Dynamic.literal()
    if (importContext != null) __obj.updateDynamic("importContext")(importContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesImportRequest]
  }
}

