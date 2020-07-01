package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdsAppearOn extends js.Object {
  var adsAppearOn: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var siteLanguage: js.UndefOr[String] = js.native
}

object AdsAppearOn {
  @scala.inline
  def apply(
    adsAppearOn: String = null,
    description: String = null,
    location: String = null,
    siteLanguage: String = null
  ): AdsAppearOn = {
    val __obj = js.Dynamic.literal()
    if (adsAppearOn != null) __obj.updateDynamic("adsAppearOn")(adsAppearOn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (siteLanguage != null) __obj.updateDynamic("siteLanguage")(siteLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdsAppearOn]
  }
}

