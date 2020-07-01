package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCountryTargeting extends js.Object {
  var countries: js.UndefOr[js.Array[String]] = js.native
  var includeRestOfWorld: js.UndefOr[Boolean] = js.native
}

object SchemaCountryTargeting {
  @scala.inline
  def apply(countries: js.Array[String] = null, includeRestOfWorld: js.UndefOr[Boolean] = js.undefined): SchemaCountryTargeting = {
    val __obj = js.Dynamic.literal()
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (!js.isUndefined(includeRestOfWorld)) __obj.updateDynamic("includeRestOfWorld")(includeRestOfWorld.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCountryTargeting]
  }
}

