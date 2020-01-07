package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SslPoliciesListAvailableFeaturesResponse extends js.Object {
  var features: js.UndefOr[js.Array[String]] = js.native
}

object Schema$SslPoliciesListAvailableFeaturesResponse {
  @scala.inline
  def apply(features: js.Array[String] = null): Schema$SslPoliciesListAvailableFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SslPoliciesListAvailableFeaturesResponse]
  }
}

