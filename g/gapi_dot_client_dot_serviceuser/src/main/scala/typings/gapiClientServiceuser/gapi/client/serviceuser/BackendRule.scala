package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendRule extends js.Object {
  /** The address of the API backend. */
  var address: js.UndefOr[String] = js.native
  /**
    * The number of seconds to wait for a response from a request.  The default
    * deadline for gRPC is infinite (no deadline) and HTTP requests is 5 seconds.
    */
  var deadline: js.UndefOr[Double] = js.native
  /**
    * Minimum deadline in seconds needed for this method. Calls having deadline
    * value lower than this will be rejected.
    */
  var minDeadline: js.UndefOr[Double] = js.native
  /**
    * Selects the methods to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object BackendRule {
  @scala.inline
  def apply(): BackendRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendRule]
  }
  @scala.inline
  implicit class BackendRuleOps[Self <: BackendRule] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setDeadline(value: Double): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeadline: Self = this.set("deadline", js.undefined)
    @scala.inline
    def setMinDeadline(value: Double): Self = this.set("minDeadline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDeadline: Self = this.set("minDeadline", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

