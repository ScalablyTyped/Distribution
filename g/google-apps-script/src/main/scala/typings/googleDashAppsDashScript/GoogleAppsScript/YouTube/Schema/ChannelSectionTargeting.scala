package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionTargeting extends js.Object {
  var countries: js.UndefOr[js.Array[String]] = js.undefined
  var languages: js.UndefOr[js.Array[String]] = js.undefined
  var regions: js.UndefOr[js.Array[String]] = js.undefined
}

object ChannelSectionTargeting {
  @scala.inline
  def apply(
    countries: js.Array[String] = null,
    languages: js.Array[String] = null,
    regions: js.Array[String] = null
  ): ChannelSectionTargeting = {
    val __obj = js.Dynamic.literal()
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSectionTargeting]
  }
}

