package typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifications for the target audience of a survey run through the API.
  */
@js.native
trait Schema$SurveyAudience extends js.Object {
  /**
    * Optional list of age buckets to target. Supported age buckets are:
    * [&#39;18-24&#39;, &#39;25-34&#39;, &#39;35-44&#39;, &#39;45-54&#39;,
    * &#39;55-64&#39;, &#39;65+&#39;]
    */
  var ages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required country code that surveys should be targeted to. Accepts
    * standard ISO 3166-1 2 character language codes. For instance,
    * &#39;US&#39; for the United States, and &#39;GB&#39; for the United
    * Kingdom.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Country subdivision (states/provinces/etc) that surveys should be
    * targeted to. For all countries except GB, ISO-3166-2 subdivision code is
    * required (eg. &#39;US-OH&#39; for Ohio, United States). For GB, NUTS 1
    * statistical region codes for the United Kingdom is required (eg.
    * &#39;UK-UKC&#39; for North East England).
    */
  var countrySubdivision: js.UndefOr[String] = js.native
  /**
    * Optional gender to target.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * Language code that surveys should be targeted to. For instance,
    * &#39;en-US&#39;. Surveys may target bilingual users by specifying a list
    * of language codes (for example, &#39;de&#39; and &#39;en-US&#39;). In
    * that case, all languages will be used for targeting users but the survey
    * content (which is displayed) must match the first language listed.
    * Accepts standard BCP47 language codes. See specification.
    */
  var languages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Online population source where the respondents are sampled from.
    */
  var populationSource: js.UndefOr[String] = js.native
}

object Schema$SurveyAudience {
  @scala.inline
  def apply(
    ages: js.Array[String] = null,
    country: String = null,
    countrySubdivision: String = null,
    gender: String = null,
    languages: js.Array[String] = null,
    populationSource: String = null
  ): Schema$SurveyAudience = {
    val __obj = js.Dynamic.literal()
    if (ages != null) __obj.updateDynamic("ages")(ages.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (countrySubdivision != null) __obj.updateDynamic("countrySubdivision")(countrySubdivision.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (populationSource != null) __obj.updateDynamic("populationSource")(populationSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SurveyAudience]
  }
}

