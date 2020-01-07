package typings.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.Anon_Accessibility
import typings.googleapis.Anon_BenchmarkIndex
import typings.googleapis.Anon_CodeMessage
import typings.googleapis.Anon_DescriptionTitle
import typings.googleapis.Anon_EmulatedFormFactor
import typings.googleapis.Anon_RendererFormattedStrings
import typings.googleapis.Anon_Total
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LighthouseResultV5 extends js.Object {
  /**
    * Map of audits in the LHR.
    */
  var audits: js.UndefOr[StringDictionary[Schema$LighthouseAuditResultV5]] = js.native
  /**
    * Map of categories in the LHR.
    */
  var categories: js.UndefOr[Anon_Accessibility] = js.native
  /**
    * Map of category groups in the LHR.
    */
  var categoryGroups: js.UndefOr[StringDictionary[Anon_DescriptionTitle]] = js.native
  /**
    * The configuration settings for this LHR.
    */
  var configSettings: js.UndefOr[Anon_EmulatedFormFactor] = js.native
  /**
    * Environment settings that were used when making this LHR.
    */
  var environment: js.UndefOr[Anon_BenchmarkIndex] = js.native
  /**
    * The time that this run was fetched.
    */
  var fetchTime: js.UndefOr[String] = js.native
  /**
    * The final resolved url that was audited.
    */
  var finalUrl: js.UndefOr[String] = js.native
  /**
    * The internationalization strings that are required to render the LHR.
    */
  var i18n: js.UndefOr[Anon_RendererFormattedStrings] = js.native
  /**
    * The lighthouse version that was used to generate this LHR.
    */
  var lighthouseVersion: js.UndefOr[String] = js.native
  /**
    * The original requested url.
    */
  var requestedUrl: js.UndefOr[String] = js.native
  /**
    * List of all run warnings in the LHR. Will always output to at least `[]`.
    */
  var runWarnings: js.UndefOr[js.Array[_]] = js.native
  /**
    * A top-level error message that, if present, indicates a serious enough
    * problem that this Lighthouse result may need to be discarded.
    */
  var runtimeError: js.UndefOr[Anon_CodeMessage] = js.native
  /**
    * Timing information for this LHR.
    */
  var timing: js.UndefOr[Anon_Total] = js.native
  /**
    * The user agent that was used to run this LHR.
    */
  var userAgent: js.UndefOr[String] = js.native
}

object Schema$LighthouseResultV5 {
  @scala.inline
  def apply(
    audits: StringDictionary[Schema$LighthouseAuditResultV5] = null,
    categories: Anon_Accessibility = null,
    categoryGroups: StringDictionary[Anon_DescriptionTitle] = null,
    configSettings: Anon_EmulatedFormFactor = null,
    environment: Anon_BenchmarkIndex = null,
    fetchTime: String = null,
    finalUrl: String = null,
    i18n: Anon_RendererFormattedStrings = null,
    lighthouseVersion: String = null,
    requestedUrl: String = null,
    runWarnings: js.Array[_] = null,
    runtimeError: Anon_CodeMessage = null,
    timing: Anon_Total = null,
    userAgent: String = null
  ): Schema$LighthouseResultV5 = {
    val __obj = js.Dynamic.literal()
    if (audits != null) __obj.updateDynamic("audits")(audits.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (categoryGroups != null) __obj.updateDynamic("categoryGroups")(categoryGroups.asInstanceOf[js.Any])
    if (configSettings != null) __obj.updateDynamic("configSettings")(configSettings.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (fetchTime != null) __obj.updateDynamic("fetchTime")(fetchTime.asInstanceOf[js.Any])
    if (finalUrl != null) __obj.updateDynamic("finalUrl")(finalUrl.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (lighthouseVersion != null) __obj.updateDynamic("lighthouseVersion")(lighthouseVersion.asInstanceOf[js.Any])
    if (requestedUrl != null) __obj.updateDynamic("requestedUrl")(requestedUrl.asInstanceOf[js.Any])
    if (runWarnings != null) __obj.updateDynamic("runWarnings")(runWarnings.asInstanceOf[js.Any])
    if (runtimeError != null) __obj.updateDynamic("runtimeError")(runtimeError.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LighthouseResultV5]
  }
}

