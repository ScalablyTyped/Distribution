package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedCompanyInfo extends js.Object {
  /** List of country codes for the localized company info. */
  var countryCodes: js.UndefOr[js.Array[String]] = js.undefined
  /** Localized display name. */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Language code of the localized company info, as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var languageCode: js.UndefOr[String] = js.undefined
  /** Localized brief description that the company uses to advertise themselves. */
  var overview: js.UndefOr[String] = js.undefined
}

object LocalizedCompanyInfo {
  @scala.inline
  def apply(
    countryCodes: js.Array[String] = null,
    displayName: String = null,
    languageCode: String = null,
    overview: String = null
  ): LocalizedCompanyInfo = {
    val __obj = js.Dynamic.literal()
    if (countryCodes != null) __obj.updateDynamic("countryCodes")(countryCodes)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (overview != null) __obj.updateDynamic("overview")(overview)
    __obj.asInstanceOf[LocalizedCompanyInfo]
  }
}

