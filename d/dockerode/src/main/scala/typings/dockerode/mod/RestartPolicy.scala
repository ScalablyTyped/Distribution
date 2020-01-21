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
  def apply(Name: String, MaximumRetryCount: Int | Double = null): RestartPolicy = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (MaximumRetryCount != null) __obj.updateDynamic("MaximumRetryCount")(MaximumRetryCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartPolicy]
  }
}

