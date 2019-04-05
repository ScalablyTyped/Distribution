package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionTargeting extends js.Object {
  var countries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var languages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var regions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ChannelSectionTargeting {
  @scala.inline
  def apply(
    countries: js.Array[java.lang.String] = null,
    languages: js.Array[java.lang.String] = null,
    regions: js.Array[java.lang.String] = null
  ): ChannelSectionTargeting = {
    val __obj = js.Dynamic.literal()
    if (countries != null) __obj.updateDynamic("countries")(countries)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[ChannelSectionTargeting]
  }
}

