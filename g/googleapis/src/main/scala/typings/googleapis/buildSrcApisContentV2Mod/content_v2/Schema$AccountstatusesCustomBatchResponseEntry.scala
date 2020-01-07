package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch accountstatuses response.
  */
@js.native
trait Schema$AccountstatusesCustomBatchResponseEntry extends js.Object {
  /**
    * The requested account status. Defined if and only if the request was
    * successful.
    */
  var accountStatus: js.UndefOr[Schema$AccountStatus] = js.native
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[Schema$Errors] = js.native
}

object Schema$AccountstatusesCustomBatchResponseEntry {
  @scala.inline
  def apply(
    accountStatus: Schema$AccountStatus = null,
    batchId: Int | Double = null,
    errors: Schema$Errors = null
  ): Schema$AccountstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (accountStatus != null) __obj.updateDynamic("accountStatus")(accountStatus.asInstanceOf[js.Any])
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountstatusesCustomBatchResponseEntry]
  }
}

