package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestartPolicy extends js.Object {
  var MaximumRetryCount: js.UndefOr[Double] = js.native
  var Name: String = js.native
}

object RestartPolicy {
  @scala.inline
  def apply(Name: String): RestartPolicy = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartPolicy]
  }
  @scala.inline
  implicit class RestartPolicyOps[Self <: RestartPolicy] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumRetryCount(value: Double): Self = this.set("MaximumRetryCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumRetryCount: Self = this.set("MaximumRetryCount", js.undefined)
  }
  
}

