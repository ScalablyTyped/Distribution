package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProjectsEnableXpnResourceRequest extends js.Object {
  /**
    * Service resource (a.k.a service project) ID.
    */
  var xpnResource: js.UndefOr[Schema$XpnResourceId] = js.native
}

object Schema$ProjectsEnableXpnResourceRequest {
  @scala.inline
  def apply(xpnResource: Schema$XpnResourceId = null): Schema$ProjectsEnableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    if (xpnResource != null) __obj.updateDynamic("xpnResource")(xpnResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProjectsEnableXpnResourceRequest]
  }
}

