package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetReference extends js.Object {
  var target: js.UndefOr[String] = js.undefined
}

object TargetReference {
  @scala.inline
  def apply(target: String = null): TargetReference = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[TargetReference]
  }
}

