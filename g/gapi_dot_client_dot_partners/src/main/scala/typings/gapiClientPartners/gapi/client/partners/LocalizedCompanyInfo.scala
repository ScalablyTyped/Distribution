package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedCompanyInfo extends js.Object {
  /** List of country codes for the localized company info. */
  var countryCodes: js.UndefOr[js.Array[String]] = js.native
  /** Localized display name. */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Language code of the localized company info, as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var languageCode: js.UndefOr[String] = js.native
  /** Localized brief description that the company uses to advertise themselves. */
  var overview: js.UndefOr[String] = js.native
}

object LocalizedCompanyInfo {
  @scala.inline
  def apply(): LocalizedCompanyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedCompanyInfo]
  }
  @scala.inline
  implicit class LocalizedCompanyInfoOps[Self <: LocalizedCompanyInfo] (val x: Self) extends AnyVal {
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
    def setCountryCodesVarargs(value: String*): Self = this.set("countryCodes", js.Array(value :_*))
    @scala.inline
    def setCountryCodes(value: js.Array[String]): Self = this.set("countryCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCodes: Self = this.set("countryCodes", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setOverview(value: String): Self = this.set("overview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
  }
  
}

