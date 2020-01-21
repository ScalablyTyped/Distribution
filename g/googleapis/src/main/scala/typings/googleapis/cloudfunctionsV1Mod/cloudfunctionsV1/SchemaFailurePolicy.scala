package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the policy in case of function&#39;s execution failure. If empty,
  * then defaults to ignoring failures (i.e. not retrying them).
  */
@js.native
trait SchemaFailurePolicy extends js.Object {
  /**
    * If specified, then the function will be retried in case of a failure.
    */
  var retry: js.UndefOr[SchemaRetry] = js.native
}

object SchemaFailurePolicy {
  @scala.inline
  def apply(retry: SchemaRetry = null): SchemaFailurePolicy = {
    val __obj = js.Dynamic.literal()
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFailurePolicy]
  }
}

