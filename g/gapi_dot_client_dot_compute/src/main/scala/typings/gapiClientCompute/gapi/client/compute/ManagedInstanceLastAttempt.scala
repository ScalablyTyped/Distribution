package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedInstanceLastAttempt extends js.Object {
  /** [Output Only] Encountered errors during the last attempt to create or delete the instance. */
  var errors: js.UndefOr[Errors] = js.native
}

object ManagedInstanceLastAttempt {
  @scala.inline
  def apply(): ManagedInstanceLastAttempt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedInstanceLastAttempt]
  }
  @scala.inline
  implicit class ManagedInstanceLastAttemptOps[Self <: ManagedInstanceLastAttempt] (val x: Self) extends AnyVal {
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
    def setErrors(value: Errors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

