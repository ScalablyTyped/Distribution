package typings.gapiClientCompute.gapi.client.compute

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
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetReference]
  }
}

