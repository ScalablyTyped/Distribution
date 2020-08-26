package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Documentation extends js.Object {
  /** The URL to the root of documentation. */
  var documentationRootUrl: js.UndefOr[String] = js.native
  /**
    * Declares a single overview page. For example:
    * <pre><code>documentation:
    * summary: ...
    * overview: &#40;== include overview.md ==&#41;
    * </code></pre>
    * This is a shortcut for the following declaration (using pages style):
    * <pre><code>documentation:
    * summary: ...
    * pages:
    * - name: Overview
    * content: &#40;== include overview.md ==&#41;
    * </code></pre>
    * Note: you cannot specify both `overview` field and `pages` field.
    */
  var overview: js.UndefOr[String] = js.native
  /** The top level pages for the documentation set. */
  var pages: js.UndefOr[js.Array[Page]] = js.native
  /**
    * A list of documentation rules that apply to individual API elements.
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[DocumentationRule]] = js.native
  /**
    * A short summary of what the service does. Can only be provided by
    * plain text.
    */
  var summary: js.UndefOr[String] = js.native
}

object Documentation {
  @scala.inline
  def apply(): Documentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Documentation]
  }
  @scala.inline
  implicit class DocumentationOps[Self <: Documentation] (val x: Self) extends AnyVal {
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
    def setDocumentationRootUrl(value: String): Self = this.set("documentationRootUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentationRootUrl: Self = this.set("documentationRootUrl", js.undefined)
    @scala.inline
    def setOverview(value: String): Self = this.set("overview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    @scala.inline
    def setPagesVarargs(value: Page*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[Page]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setRulesVarargs(value: DocumentationRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[DocumentationRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
  
}

