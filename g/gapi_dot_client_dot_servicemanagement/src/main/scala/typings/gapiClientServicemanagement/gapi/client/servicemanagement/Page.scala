package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  /**
    * The Markdown content of the page. You can use <code>&#40;== include {path} ==&#41;</code>
    * to include content from a Markdown file.
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * The name of the page. It will be used as an identity of the page to
    * generate URI of the page, text of the link to this page in navigation,
    * etc. The full page name (start from the root page name to this page
    * concatenated with `.`) can be used as reference to the page in your
    * documentation. For example:
    * <pre><code>pages:
    * - name: Tutorial
    * content: &#40;== include tutorial.md ==&#41;
    * subpages:
    * - name: Java
    * content: &#40;== include tutorial_java.md ==&#41;
    * </code></pre>
    * You can reference `Java` page using Markdown reference link syntax:
    * `Java`.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Subpages of this page. The order of subpages specified here will be
    * honored in the generated docset.
    */
  var subpages: js.UndefOr[js.Array[Page]] = js.undefined
}

object Page {
  @scala.inline
  def apply(content: String = null, name: String = null, subpages: js.Array[Page] = null): Page = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subpages != null) __obj.updateDynamic("subpages")(subpages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

