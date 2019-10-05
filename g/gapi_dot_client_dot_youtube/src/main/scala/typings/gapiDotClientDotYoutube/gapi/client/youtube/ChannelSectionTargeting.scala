package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionTargeting extends js.Object {
  /** The country the channel section is targeting. */
  var countries: js.UndefOr[js.Array[String]] = js.undefined
  /** The language the channel section is targeting. */
  var languages: js.UndefOr[js.Array[String]] = js.undefined
  /** The region the channel section is targeting. */
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
    if (countries != null) __obj.updateDynamic("countries")(countries)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[ChannelSectionTargeting]
  }
}

