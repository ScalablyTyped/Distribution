package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a discovery occurrence.
  */
@js.native
trait Schema$GrafeasV1beta1DiscoveryDetails extends js.Object {
  /**
    * Required. Analysis status for the discovered resource.
    */
  var discovered: js.UndefOr[Schema$Discovered] = js.native
}

object Schema$GrafeasV1beta1DiscoveryDetails {
  @scala.inline
  def apply(discovered: Schema$Discovered = null): Schema$GrafeasV1beta1DiscoveryDetails = {
    val __obj = js.Dynamic.literal()
    if (discovered != null) __obj.updateDynamic("discovered")(discovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GrafeasV1beta1DiscoveryDetails]
  }
}

