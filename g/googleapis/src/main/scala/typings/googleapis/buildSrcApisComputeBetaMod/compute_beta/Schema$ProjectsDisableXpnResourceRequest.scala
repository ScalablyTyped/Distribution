package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProjectsDisableXpnResourceRequest extends js.Object {
  /**
    * Service resource (a.k.a service project) ID.
    */
  var xpnResource: js.UndefOr[Schema$XpnResourceId] = js.native
}

object Schema$ProjectsDisableXpnResourceRequest {
  @scala.inline
  def apply(xpnResource: Schema$XpnResourceId = null): Schema$ProjectsDisableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    if (xpnResource != null) __obj.updateDynamic("xpnResource")(xpnResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProjectsDisableXpnResourceRequest]
  }
}

