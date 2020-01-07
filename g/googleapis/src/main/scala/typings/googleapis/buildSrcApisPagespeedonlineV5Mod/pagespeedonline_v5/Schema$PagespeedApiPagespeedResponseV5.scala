package typings.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5

import typings.googleapis.Anon_Major
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PagespeedApiPagespeedResponseV5 extends js.Object {
  /**
    * The UTC timestamp of this analysis.
    */
  var analysisUTCTimestamp: js.UndefOr[String] = js.native
  /**
    * The captcha verify result
    */
  var captchaResult: js.UndefOr[String] = js.native
  /**
    * Canonicalized and final URL for the document, after following page
    * redirects (if any).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of result.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Lighthouse response for the audit url as an object.
    */
  var lighthouseResult: js.UndefOr[Schema$LighthouseResultV5] = js.native
  /**
    * Metrics of end users&#39; page loading experience.
    */
  var loadingExperience: js.UndefOr[Schema$PagespeedApiLoadingExperienceV5] = js.native
  /**
    * Metrics of the aggregated page loading experience of the origin
    */
  var originLoadingExperience: js.UndefOr[Schema$PagespeedApiLoadingExperienceV5] = js.native
  /**
    * The version of PageSpeed used to generate these results.
    */
  var version: js.UndefOr[Anon_Major] = js.native
}

object Schema$PagespeedApiPagespeedResponseV5 {
  @scala.inline
  def apply(
    analysisUTCTimestamp: String = null,
    captchaResult: String = null,
    id: String = null,
    kind: String = null,
    lighthouseResult: Schema$LighthouseResultV5 = null,
    loadingExperience: Schema$PagespeedApiLoadingExperienceV5 = null,
    originLoadingExperience: Schema$PagespeedApiLoadingExperienceV5 = null,
    version: Anon_Major = null
  ): Schema$PagespeedApiPagespeedResponseV5 = {
    val __obj = js.Dynamic.literal()
    if (analysisUTCTimestamp != null) __obj.updateDynamic("analysisUTCTimestamp")(analysisUTCTimestamp.asInstanceOf[js.Any])
    if (captchaResult != null) __obj.updateDynamic("captchaResult")(captchaResult.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lighthouseResult != null) __obj.updateDynamic("lighthouseResult")(lighthouseResult.asInstanceOf[js.Any])
    if (loadingExperience != null) __obj.updateDynamic("loadingExperience")(loadingExperience.asInstanceOf[js.Any])
    if (originLoadingExperience != null) __obj.updateDynamic("originLoadingExperience")(originLoadingExperience.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PagespeedApiPagespeedResponseV5]
  }
}

