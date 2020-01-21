package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSslPoliciesListAvailableFeaturesResponse extends js.Object {
  var features: js.UndefOr[js.Array[String]] = js.native
}

object SchemaSslPoliciesListAvailableFeaturesResponse {
  @scala.inline
  def apply(features: js.Array[String] = null): SchemaSslPoliciesListAvailableFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSslPoliciesListAvailableFeaturesResponse]
  }
}

