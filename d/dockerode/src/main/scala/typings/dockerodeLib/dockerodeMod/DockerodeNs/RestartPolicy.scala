package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestartPolicy extends js.Object {
  var MaximumRetryCount: js.UndefOr[scala.Double] = js.undefined
  var Name: java.lang.String
}

object RestartPolicy {
  @scala.inline
  def apply(Name: java.lang.String, MaximumRetryCount: scala.Int | scala.Double = null): RestartPolicy = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (MaximumRetryCount != null) __obj.updateDynamic("MaximumRetryCount")(MaximumRetryCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartPolicy]
  }
}

