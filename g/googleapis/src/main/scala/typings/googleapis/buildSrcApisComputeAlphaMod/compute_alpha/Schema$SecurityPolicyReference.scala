package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SecurityPolicyReference extends js.Object {
  var securityPolicy: js.UndefOr[String] = js.native
}

object Schema$SecurityPolicyReference {
  @scala.inline
  def apply(securityPolicy: String = null): Schema$SecurityPolicyReference = {
    val __obj = js.Dynamic.literal()
    if (securityPolicy != null) __obj.updateDynamic("securityPolicy")(securityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SecurityPolicyReference]
  }
}

