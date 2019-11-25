package typings.gapiDotClientDotAdsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdsAppearOn extends js.Object {
  /** The name used to describe this channel externally. */
  var adsAppearOn: js.UndefOr[String] = js.undefined
  /** The external description of the channel. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The locations in which ads appear. (Only valid for content and mobile content ads (deprecated)). Acceptable values for content ads are: TOP_LEFT,
    * TOP_CENTER, TOP_RIGHT, MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT, MULTIPLE_LOCATIONS. Acceptable values for
    * mobile content ads (deprecated) are: TOP, MIDDLE, BOTTOM, MULTIPLE_LOCATIONS.
    */
  var location: js.UndefOr[String] = js.undefined
  /** The language of the sites ads will be displayed on. */
  var siteLanguage: js.UndefOr[String] = js.undefined
}

object Anon_AdsAppearOn {
  @scala.inline
  def apply(
    adsAppearOn: String = null,
    description: String = null,
    location: String = null,
    siteLanguage: String = null
  ): Anon_AdsAppearOn = {
    val __obj = js.Dynamic.literal()
    if (adsAppearOn != null) __obj.updateDynamic("adsAppearOn")(adsAppearOn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (siteLanguage != null) __obj.updateDynamic("siteLanguage")(siteLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdsAppearOn]
  }
}

