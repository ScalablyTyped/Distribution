package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSecurityPolicyReference extends js.Object {
  var securityPolicy: js.UndefOr[String] = js.native
}

object SchemaSecurityPolicyReference {
  @scala.inline
  def apply(securityPolicy: String = null): SchemaSecurityPolicyReference = {
    val __obj = js.Dynamic.literal()
    if (securityPolicy != null) __obj.updateDynamic("securityPolicy")(securityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecurityPolicyReference]
  }
}

