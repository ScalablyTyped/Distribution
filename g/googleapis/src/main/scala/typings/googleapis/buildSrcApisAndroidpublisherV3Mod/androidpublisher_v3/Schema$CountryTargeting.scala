package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CountryTargeting extends js.Object {
  var countries: js.UndefOr[js.Array[String]] = js.native
  var includeRestOfWorld: js.UndefOr[Boolean] = js.native
}

object Schema$CountryTargeting {
  @scala.inline
  def apply(countries: js.Array[String] = null, includeRestOfWorld: js.UndefOr[Boolean] = js.undefined): Schema$CountryTargeting = {
    val __obj = js.Dynamic.literal()
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (!js.isUndefined(includeRestOfWorld)) __obj.updateDynamic("includeRestOfWorld")(includeRestOfWorld.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CountryTargeting]
  }
}

