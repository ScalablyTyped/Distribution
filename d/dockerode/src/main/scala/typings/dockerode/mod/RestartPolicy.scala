package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestartPolicy extends js.Object {
  var MaximumRetryCount: js.UndefOr[Double] = js.undefined
  var Name: String
}

object RestartPolicy {
  @scala.inline
  def apply(Name: String, MaximumRetryCount: js.UndefOr[Double] = js.undefined): RestartPolicy = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumRetryCount)) __obj.updateDynamic("MaximumRetryCount")(MaximumRetryCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartPolicy]
  }
}

