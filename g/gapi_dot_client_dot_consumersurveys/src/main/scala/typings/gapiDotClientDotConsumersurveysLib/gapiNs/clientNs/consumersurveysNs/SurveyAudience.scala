package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveyAudience extends js.Object {
  var ages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var countrySubdivision: js.UndefOr[java.lang.String] = js.undefined
  var gender: js.UndefOr[java.lang.String] = js.undefined
  var languages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var mobileAppPanelId: js.UndefOr[java.lang.String] = js.undefined
  var populationSource: js.UndefOr[java.lang.String] = js.undefined
}

object SurveyAudience {
  @scala.inline
  def apply(
    ages: js.Array[java.lang.String] = null,
    country: java.lang.String = null,
    countrySubdivision: java.lang.String = null,
    gender: java.lang.String = null,
    languages: js.Array[java.lang.String] = null,
    mobileAppPanelId: java.lang.String = null,
    populationSource: java.lang.String = null
  ): SurveyAudience = {
    val __obj = js.Dynamic.literal()
    if (ages != null) __obj.updateDynamic("ages")(ages)
    if (country != null) __obj.updateDynamic("country")(country)
    if (countrySubdivision != null) __obj.updateDynamic("countrySubdivision")(countrySubdivision)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    if (mobileAppPanelId != null) __obj.updateDynamic("mobileAppPanelId")(mobileAppPanelId)
    if (populationSource != null) __obj.updateDynamic("populationSource")(populationSource)
    __obj.asInstanceOf[SurveyAudience]
  }
}

