package typings
package gapiDotClientDotSurveysLib.gapiNs.clientNs.surveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SurveyAudience extends js.Object {
  /** Optional list of age buckets to target. Supported age buckets are: ['18-24', '25-34', '35-44', '45-54', '55-64', '65+'] */
  var ages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Required country code that surveys should be targeted to. Accepts standard ISO 3166-1 2 character language codes. For instance, 'US' for the United
               * States, and 'GB' for the United Kingdom.
               */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Country subdivision (states/provinces/etc) that surveys should be targeted to. For all countries except GB, ISO-3166-2 subdivision code is required
               * (eg. 'US-OH' for Ohio, United States). For GB, NUTS 1 statistical region codes for the United Kingdom is required (eg. 'UK-UKC' for North East
               * England).
               */
  var countrySubdivision: js.UndefOr[java.lang.String] = js.undefined
  /** Optional gender to target. */
  var gender: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Language code that surveys should be targeted to. For instance, 'en-US'. Surveys may target bilingual users by specifying a list of language codes (for
               * example, 'de' and 'en-US'). In that case, all languages will be used for targeting users but the survey content (which is displayed) must match the
               * first language listed. Accepts standard BCP47 language codes. See specification.
               */
  var languages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Key for predefined panel that causes survey to be sent to a predefined set of Opinion Rewards App users. You must set PopulationSource to
               * ANDROID_APP_PANEL to use this field.
               */
  var mobileAppPanelId: js.UndefOr[java.lang.String] = js.undefined
  /** Online population source where the respondents are sampled from. */
  var populationSource: js.UndefOr[java.lang.String] = js.undefined
}

