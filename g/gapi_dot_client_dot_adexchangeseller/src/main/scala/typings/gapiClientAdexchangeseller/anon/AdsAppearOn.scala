package typings.gapiClientAdexchangeseller.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdsAppearOn extends js.Object {
  /** The name used to describe this channel externally. */
  var adsAppearOn: js.UndefOr[String] = js.native
  /** The external description of the channel. */
  var description: js.UndefOr[String] = js.native
  /**
    * The locations in which ads appear. (Only valid for content and mobile content ads). Acceptable values for content ads are: TOP_LEFT, TOP_CENTER,
    * TOP_RIGHT, MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT, MULTIPLE_LOCATIONS. Acceptable values for mobile content
    * ads are: TOP, MIDDLE, BOTTOM, MULTIPLE_LOCATIONS.
    */
  var location: js.UndefOr[String] = js.native
  /** The language of the sites ads will be displayed on. */
  var siteLanguage: js.UndefOr[String] = js.native
}

object AdsAppearOn {
  @scala.inline
  def apply(): AdsAppearOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdsAppearOn]
  }
  @scala.inline
  implicit class AdsAppearOnOps[Self <: AdsAppearOn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdsAppearOn(value: String): Self = this.set("adsAppearOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdsAppearOn: Self = this.set("adsAppearOn", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setSiteLanguage(value: String): Self = this.set("siteLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteLanguage: Self = this.set("siteLanguage", js.undefined)
  }
  
}

