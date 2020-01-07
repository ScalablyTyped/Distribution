package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Rollback.
  */
@js.native
trait Schema$RollbackRequest extends js.Object {
  /**
    * Required. The transaction to roll back.
    */
  var transactionId: js.UndefOr[String] = js.native
}

object Schema$RollbackRequest {
  @scala.inline
  def apply(transactionId: String = null): Schema$RollbackRequest = {
    val __obj = js.Dynamic.literal()
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RollbackRequest]
  }
}

