package typings.gapiClientPagespeedonline.gapi.client.pagespeedonline

import typings.gapiClientPagespeedonline.anon.CssResponseBytes
import typings.gapiClientPagespeedonline.anon.Locale
import typings.gapiClientPagespeedonline.anon.Major
import typings.gapiClientPagespeedonline.anon.Score
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /** Localized PageSpeed results. Contains a ruleResults entry for each PageSpeed rule instantiated and run by the server. */
  var formattedResults: js.UndefOr[Locale] = js.native
  /** Canonicalized and final URL for the document, after following page redirects (if any). */
  var id: js.UndefOr[String] = js.native
  /** List of rules that were specified in the request, but which the server did not know how to instantiate. */
  var invalidRules: js.UndefOr[js.Array[String]] = js.native
  /** Kind of result. */
  var kind: js.UndefOr[String] = js.native
  /** Summary statistics for the page, such as number of JavaScript bytes, number of HTML bytes, etc. */
  var pageStats: js.UndefOr[CssResponseBytes] = js.native
  /** Response code for the document. 200 indicates a normal page load. 4xx/5xx indicates an error. */
  var responseCode: js.UndefOr[Double] = js.native
  /** A map with one entry for each rule group in these results. */
  var ruleGroups: js.UndefOr[Record[String, Score]] = js.native
  /** Base64-encoded screenshot of the page that was analyzed. */
  var screenshot: js.UndefOr[PagespeedApiImageV2] = js.native
  /** Title of the page, as displayed in the browser's title bar. */
  var title: js.UndefOr[String] = js.native
  /** The version of PageSpeed used to generate these results. */
  var version: js.UndefOr[Major] = js.native
}

object Result {
  @scala.inline
  def apply(): Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setFormattedResults(value: Locale): Self = this.set("formattedResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedResults: Self = this.set("formattedResults", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInvalidRulesVarargs(value: String*): Self = this.set("invalidRules", js.Array(value :_*))
    @scala.inline
    def setInvalidRules(value: js.Array[String]): Self = this.set("invalidRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidRules: Self = this.set("invalidRules", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPageStats(value: CssResponseBytes): Self = this.set("pageStats", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageStats: Self = this.set("pageStats", js.undefined)
    @scala.inline
    def setResponseCode(value: Double): Self = this.set("responseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseCode: Self = this.set("responseCode", js.undefined)
    @scala.inline
    def setRuleGroups(value: Record[String, Score]): Self = this.set("ruleGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleGroups: Self = this.set("ruleGroups", js.undefined)
    @scala.inline
    def setScreenshot(value: PagespeedApiImageV2): Self = this.set("screenshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenshot: Self = this.set("screenshot", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVersion(value: Major): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

