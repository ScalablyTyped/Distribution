package typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.Anon_Cms
import typings.googleapis.Anon_IdInitialurl
import typings.googleapis.Anon_KeyLocaleRuleResultsAnonBeta
import typings.googleapis.Anon_Major
import typings.googleapis.Anon_Pass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PagespeedApiPagespeedResponseV4 extends js.Object {
  /**
    * The captcha verify result
    */
  var captchaResult: js.UndefOr[String] = js.native
  /**
    * Localized PageSpeed results. Contains a ruleResults entry for each
    * PageSpeed rule instantiated and run by the server.
    */
  var formattedResults: js.UndefOr[Anon_KeyLocaleRuleResultsAnonBeta] = js.native
  /**
    * Canonicalized and final URL for the document, after following page
    * redirects (if any).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * List of rules that were specified in the request, but which the server
    * did not know how to instantiate.
    */
  var invalidRules: js.UndefOr[js.Array[String]] = js.native
  /**
    * Kind of result.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metrics of end users&#39; page loading experience.
    */
  var loadingExperience: js.UndefOr[Anon_IdInitialurl] = js.native
  /**
    * Summary statistics for the page, such as number of JavaScript bytes,
    * number of HTML bytes, etc.
    */
  var pageStats: js.UndefOr[Anon_Cms] = js.native
  /**
    * Response code for the document. 200 indicates a normal page load. 4xx/5xx
    * indicates an error.
    */
  var responseCode: js.UndefOr[Double] = js.native
  /**
    * A map with one entry for each rule group in these results.
    */
  var ruleGroups: js.UndefOr[StringDictionary[Anon_Pass]] = js.native
  /**
    * Base64-encoded screenshot of the page that was analyzed.
    */
  var screenshot: js.UndefOr[Schema$PagespeedApiImageV4] = js.native
  /**
    * Additional base64-encoded screenshots of the page, in various partial
    * render states.
    */
  var snapshots: js.UndefOr[js.Array[Schema$PagespeedApiImageV4]] = js.native
  /**
    * Title of the page, as displayed in the browser&#39;s title bar.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The version of PageSpeed used to generate these results.
    */
  var version: js.UndefOr[Anon_Major] = js.native
}

object Schema$PagespeedApiPagespeedResponseV4 {
  @scala.inline
  def apply(
    captchaResult: String = null,
    formattedResults: Anon_KeyLocaleRuleResultsAnonBeta = null,
    id: String = null,
    invalidRules: js.Array[String] = null,
    kind: String = null,
    loadingExperience: Anon_IdInitialurl = null,
    pageStats: Anon_Cms = null,
    responseCode: Int | Double = null,
    ruleGroups: StringDictionary[Anon_Pass] = null,
    screenshot: Schema$PagespeedApiImageV4 = null,
    snapshots: js.Array[Schema$PagespeedApiImageV4] = null,
    title: String = null,
    version: Anon_Major = null
  ): Schema$PagespeedApiPagespeedResponseV4 = {
    val __obj = js.Dynamic.literal()
    if (captchaResult != null) __obj.updateDynamic("captchaResult")(captchaResult.asInstanceOf[js.Any])
    if (formattedResults != null) __obj.updateDynamic("formattedResults")(formattedResults.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (invalidRules != null) __obj.updateDynamic("invalidRules")(invalidRules.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (loadingExperience != null) __obj.updateDynamic("loadingExperience")(loadingExperience.asInstanceOf[js.Any])
    if (pageStats != null) __obj.updateDynamic("pageStats")(pageStats.asInstanceOf[js.Any])
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    if (ruleGroups != null) __obj.updateDynamic("ruleGroups")(ruleGroups.asInstanceOf[js.Any])
    if (screenshot != null) __obj.updateDynamic("screenshot")(screenshot.asInstanceOf[js.Any])
    if (snapshots != null) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PagespeedApiPagespeedResponseV4]
  }
}

