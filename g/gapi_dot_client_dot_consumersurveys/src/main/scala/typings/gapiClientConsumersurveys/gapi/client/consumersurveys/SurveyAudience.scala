package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveyAudience extends js.Object {
  var ages: js.UndefOr[js.Array[String]] = js.native
  var country: js.UndefOr[String] = js.native
  var countrySubdivision: js.UndefOr[String] = js.native
  var gender: js.UndefOr[String] = js.native
  var languages: js.UndefOr[js.Array[String]] = js.native
  var mobileAppPanelId: js.UndefOr[String] = js.native
  var populationSource: js.UndefOr[String] = js.native
}

object SurveyAudience {
  @scala.inline
  def apply(): SurveyAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveyAudience]
  }
  @scala.inline
  implicit class SurveyAudienceOps[Self <: SurveyAudience] (val x: Self) extends AnyVal {
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
    def setAgesVarargs(value: String*): Self = this.set("ages", js.Array(value :_*))
    @scala.inline
    def setAges(value: js.Array[String]): Self = this.set("ages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAges: Self = this.set("ages", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCountrySubdivision(value: String): Self = this.set("countrySubdivision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountrySubdivision: Self = this.set("countrySubdivision", js.undefined)
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    @scala.inline
    def setMobileAppPanelId(value: String): Self = this.set("mobileAppPanelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileAppPanelId: Self = this.set("mobileAppPanelId", js.undefined)
    @scala.inline
    def setPopulationSource(value: String): Self = this.set("populationSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulationSource: Self = this.set("populationSource", js.undefined)
  }
  
}

