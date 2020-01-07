package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetReference extends js.Object {
  var target: js.UndefOr[String] = js.native
}

object Schema$TargetReference {
  @scala.inline
  def apply(target: String = null): Schema$TargetReference = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetReference]
  }
}

