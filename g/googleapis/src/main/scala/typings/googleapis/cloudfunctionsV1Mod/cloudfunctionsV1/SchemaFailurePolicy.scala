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
  def apply(): SchemaFailurePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailurePolicy]
  }
  @scala.inline
  implicit class SchemaFailurePolicyOps[Self <: SchemaFailurePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRetry(value: SchemaRetry): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
  }
  
}

